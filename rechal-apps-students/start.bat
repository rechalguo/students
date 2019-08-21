@echo off
setlocal enabledelayedexpansion  
SET JAVA_ENV=%JAVA_HOME%
SET DEPLOY_DIR=%~dp0

if defined JAVA_ENV (
  
) else (
  JAVA_ENV=%DEPLOY_DIR%/jre
)

echo.
echo JAVA_HOME:%JAVA_ENV%
echo.

%JAVA_ENV%/bin/java -server -Dfile.encoding=UTF-8 -jar bin/StuManager.jar

echo 'ok'
