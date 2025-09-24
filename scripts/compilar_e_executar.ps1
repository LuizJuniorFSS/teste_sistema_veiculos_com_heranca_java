# Script PowerShell para compilar e executar o Sistema de Veículos
Write-Host "========================================" -ForegroundColor Cyan
Write-Host "  SISTEMA DE GERENCIAMENTO DE VEICULOS" -ForegroundColor Cyan
Write-Host "========================================" -ForegroundColor Cyan

$jdkPath = "C:\Program Files\Java\jdk-25\bin"
$env:JAVA_HOME = "C:\Program Files\Java\jdk-25"
$env:PATH += ";$jdkPath"

Write-Host "Compilando arquivos Java com compatibilidade Java 8..." -ForegroundColor Yellow
& "$jdkPath\javac.exe" -target 8 -source 8 -d ..\bin ..\src\main\java\*.java

if ($LASTEXITCODE -eq 0) {
    Write-Host "Compilacao bem-sucedida!" -ForegroundColor Green
    Write-Host ""
    Write-Host "Executando o programa..." -ForegroundColor Yellow
    Write-Host ""
    java -cp ..\bin TesteSistemaVeiculos
} else {
    Write-Host "Erro na compilacao!" -ForegroundColor Red
}

Write-Host ""
Read-Host "Pressione Enter para continuar"