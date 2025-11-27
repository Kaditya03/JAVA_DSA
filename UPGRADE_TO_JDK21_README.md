Upgrade the project to Java 21 (manual steps)

Overview
--------
I attempted to generate an automated Java 21 upgrade plan using the Copilot upgrade tool, but that tool is unavailable due to licensing on this account. To proceed, I've added manual helper files so you can upgrade your local environment and compile the project with JDK 21.

What I added
- `UPGRADE_TO_JDK21_README.md` (this file): step-by-step instructions to install JDK 21 and verify it.
- `setup-jdk21.ps1`: PowerShell script to set JAVA_HOME and add JDK 21 to PATH for the current session (safe, non-permanent by default).
- `compile-with-jdk21.ps1`: PowerShell script to compile all .java files using a chosen JDK (uses JAVA_HOME if set, or accepts a JdkPath parameter).
- `java-version.txt`: notes the target Java version (21).

Quick steps (summary)
1. Install a JDK 21 distribution (Eclipse Temurin / Adoptium or Oracle JDK 21).
   - Temurin (Adoptium) installer: https://adoptium.net
   - Choose Windows x64 MSI and install.
2. Open PowerShell and run the session helper (replace path to your JDK install if needed):

   # Example (PowerShell):
   .\setup-jdk21.ps1 -JdkPath "C:\Program Files\Eclipse Adoptium\jdk-21.0.2.7-hotspot"

   That sets `JAVA_HOME` and updates the PATH for the current session only.
3. Verify:
   `java -version`
   `javac -version`

4. Compile the project in-place (from repository root):
   `.\compile-with-jdk21.ps1`  # uses current JAVA_HOME, or pass -JdkPath like above

5. Optionally, make the JDK permanent by setting system environment variables (instructions below).

Detailed steps
--------------
1) Install JDK 21
- Download a JDK 21 distribution:
  - Eclipse Temurin (Adoptium): https://adoptium.net
  - Oracle JDK: https://www.oracle.com/java/technologies/downloads
- Install to a path such as `C:\Program Files\Eclipse Adoptium\jdk-21.x.x`.

2) Use the included session helper (recommended for testing)
- From a PowerShell prompt in the repository root run:
  `.\setup-jdk21.ps1 -JdkPath "C:\Program Files\Eclipse Adoptium\jdk-21.x.x"`
- This sets `JAVA_HOME` for the current session and prepends `JAVA_HOME\bin` to the PATH.

3) Compile (quick)
- From repository root run:
  `.\compile-with-jdk21.ps1`
- If you want to specify the JDK directly without setting JAVA_HOME you can run:
  `.\compile-with-jdk21.ps1 -JdkPath "C:\Program Files\Eclipse Adoptium\jdk-21.x.x"`

4) Make JDK permanent (optional)
- To set system environment variables permanently (affects new shells):
  - In PowerShell (as Administrator):
    `setx /M JAVA_HOME "C:\Program Files\Eclipse Adoptium\jdk-21.x.x"`
    Then add `C:\Program Files\Eclipse Adoptium\jdk-21.x.x\bin` to the system PATH through System Settings or use a setx command.
  - Note: `setx` affects only new processes. Close and reopen terminals after running.

Notes and next steps
--------------------
- This repository does not contain a build system (Maven/Gradle). If you add a `pom.xml` or `build.gradle`, I can update it to target Java 21 (and automate the upgrade using more advanced tools).
- If you'd like, I can:
  - Scan for language-level incompatibilities and suggest code changes.
  - Add a simple Gradle wrapper and build script targeting Java 21 to make builds reproducible.

If you want me to continue and add an automated Gradle or Maven build, tell me which you prefer and I'll create it and target Java 21.