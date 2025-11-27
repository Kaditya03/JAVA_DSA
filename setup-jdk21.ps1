<#
setup-jdk21.ps1
PowerShell helper to set JAVA_HOME and update PATH for the current session.
Usage:
  .\setup-jdk21.ps1 -JdkPath "C:\Program Files\Eclipse Adoptium\jdk-21.x.x"
If you omit -JdkPath, the script will try to detect a JDK 21 under common locations.
#>
param(
    [string]$JdkPath
)

function Write-Info($m) { Write-Host "[info] $m" -ForegroundColor Cyan }
function Write-Err($m) { Write-Host "[error] $m" -ForegroundColor Red }

if (-not $JdkPath) {
    # try a few common places for Temurin/Adoptium and other distributions
    $candidates = @( "C:\\Program Files\\Eclipse Adoptium\\jdk-21*", "C:\\Program Files\\Java\\jdk-21*", "$env:ProgramFiles\\Java\\jdk-21*" )
    foreach ($pattern in $candidates) {
        $found = Get-ChildItem -Path (Split-Path $pattern) -Filter (Split-Path $pattern -Leaf) -ErrorAction SilentlyContinue | Sort-Object LastWriteTime -Descending | Select-Object -First 1
        if ($found) { $JdkPath = $found.FullName; break }
    }
}

if (-not $JdkPath) {
    Write-Err "JDK path not provided and automatic detection failed. Please provide -JdkPath."
    Write-Host "Example: .\setup-jdk21.ps1 -JdkPath 'C:\\Program Files\\Eclipse Adoptium\\jdk-21.x.x'"
    exit 1
}

if (-not (Test-Path $JdkPath)) {
    Write-Err "Provided JdkPath does not exist: $JdkPath"
    exit 1
}

$env:JAVA_HOME = $JdkPath
$bin = Join-Path $env:JAVA_HOME 'bin'
# Prepend bin to PATH for current session
$env:PATH = "$bin;" + $env:PATH

Write-Info "JAVA_HOME set to: $env:JAVA_HOME"
Write-Info "Using java: $(Get-Command java -ErrorAction SilentlyContinue | Select-Object -ExpandProperty Definition)"
Write-Info "java -version output:" 
java -version

Write-Host "Session updated. To make the change permanent, use setx (requires new shells) or update system environment variables in Windows Settings." -ForegroundColor Yellow
