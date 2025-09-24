@echo off
echo ========================================
echo   SISTEMA DE GERENCIAMENTO DE VEICULOS
echo ========================================

set JAVA_HOME=C:\Program Files\Java\jdk-25
set PATH=%JAVA_HOME%\bin;%PATH%

echo Compilando arquivos Java com compatibilidade Java 8...
"%JAVA_HOME%\bin\javac.exe" -target 8 -source 8 -d ..\bin ..\src\main\java\*.java

if %ERRORLEVEL% EQU 0 (
    echo Compilacao bem-sucedida!
    echo.
    echo Executando o programa...
    echo.
    java -cp ..\bin TesteSistemaVeiculos
) else (
    echo Erro na compilacao!
)

echo.
pause