# Conversor de Temperatura — CI com Jenkins

Projeto de exemplo para build e testes automáticos com Jenkins integrado ao GitHub.

- `ConversorTemperatura`: conversão Fahrenheit → Celsius e Celsius → Fahrenheit
- `ConversorTemperaturaTest`: 4 casos de teste (JUnit 5)
- Cobertura de código com JaCoCo (`target/site/jacoco/index.html`)
- `Jenkinsfile`: pipeline Checkout → Build → Test (+ relatório JUnit e cobertura)

## Rodar localmente

    mvn clean test
