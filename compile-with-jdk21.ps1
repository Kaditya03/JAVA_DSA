<#
compile-with-jdk21.ps1
Compile all .java files in this repository using the selected JDK.
Usage:
  .\compile-with-jdk21.ps1                # uses $env:JAVA_HOME if set
  .\compile-with-jdk21.ps1 -JdkPath "C:\\...\\jdk-21"
#>
param(
    [string]$JdkPath
)

function Write-Info($m) { Write-Host "[info] $m" -ForegroundColor Cyan }
function Write-Err($m) { Write-Host "[error] $m" -ForegroundColor Red }

if ($JdkPath) {
    if (-not (Test-Path $JdkPath)) { Write-Err "JdkPath not found: $JdkPath"; exit 1 }
    $javac = Join-Path $JdkPath 'bin\javac.exe'
} elseif ($env:JAVA_HOME) {
    $javac = Join-Path $env:JAVA_HOME 'bin\javac.exe'
} else {
    # try to find javac on PATH
    $javac = (Get-Command javac -ErrorAction SilentlyContinue).Definition
}

if (-not $javac -or -not (Test-Path $javac)) {
    Write-Err "Could not find javac. Set JAVA_HOME or pass -JdkPath to the script."
    exit 1
}

Write-Info "Using javac: $javac"

# Find all .java files (exclude target/build dirs if any) and compile into ./out
$outDir = Join-Path (Get-Location) 'out'
if (-not (Test-Path $outDir)) { New-Item -ItemType Directory -Path $outDir | Out-Null }

# Collect source files
$src = Get-ChildItem -Path . -Recurse -Include *.java | Where-Object { $_.FullName -notmatch '\\out\\' } | ForEach-Object { $_.FullName }
if (-not $src) { Write-Err "No .java files found to compile."; exit 1 }

# Create argument list
$srcArgs = $src -join ' '
& $javac -d $outDir $srcArgs

if ($LASTEXITCODE -eq 0) {
    Write-Info "Compilation successful. Classes are in: $outDir"
} else {
    Write-Err "Compilation failed with exit code $LASTEXITCODE"
    exit $LASTEXITCODE
}
