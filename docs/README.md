# Sistema de Gerenciamento de Veículos com Herança em Java

## 📋 Descrição do Projeto

Este projeto implementa um sistema de gerenciamento de veículos utilizando os conceitos fundamentais de **Programação Orientada a Objetos (POO)** em Java, incluindo herança, polimorfismo e encapsulamento.

## 🎯 Objetivos Cumpridos

### ✅ Implementação da Classe Base
- **Classe Veiculo** criada com os atributos essenciais:
  - `marca` (String)
  - `modelo` (String) 
  - `ano` (int)

### ✅ Método de Exibição
- **Método `exibirDetalhes()`** implementado na classe Veiculo
- Exibe informações básicas do veículo de forma formatada

### ✅ Herança Implementada
- **Subclasse Carro**: Herda de Veiculo + atributo `numeroPortas`
- **Subclasse Moto**: Herda de Veiculo + atributo `cilindradas`
- Ambas utilizam corretamente `extends Veiculo`

### ✅ Polimorfismo e Sobrescrita
- **Métodos sobrescritos** em Carro e Moto usando `@Override`
- **Informações completas** exibidas para cada tipo de veículo
- **Polimorfismo** demonstrado através de array de Veículos

### ✅ Execução Sem Erros
- Programa compila e executa perfeitamente
- Saída formatada e organizada
- Demonstração completa de todos os conceitos

## 🏗️ Estrutura do Projeto

```
sistema_de_veiculo_com_herança_em_java/
├── src/
│   └── main/
│       └── java/
│           ├── Veiculo.java              # Classe base
│           ├── Carro.java                # Subclasse Carro
│           ├── Moto.java                 # Subclasse Moto
│           └── TesteSistemaVeiculos.java # Classe principal de teste
├── bin/                                  # Arquivos compilados (.class)
├── docs/
│   └── README.md                         # Este arquivo
├── scripts/
│   ├── compilar_e_executar.bat          # Script para Windows (Batch)
│   └── compilar_e_executar.ps1          # Script para Windows (PowerShell)
└── .gitignore                            # Arquivo de configuração Git
```

## 🚀 Como Executar

### Opção 1: Comando Manual
```bash
# Compilar (a partir da raiz do projeto)
javac -d bin src/main/java/*.java

# Executar (a partir da raiz do projeto)
java -cp bin TesteSistemaVeiculos
```

### Opção 2: Script Automatizado (Windows)
```bash
# Usando Batch
scripts\compilar_e_executar.bat

# Usando PowerShell
scripts\compilar_e_executar.ps1
```

## 📊 Saída Esperada

```
=== SISTEMA DE GERENCIAMENTO DE VEÍCULOS ===

=== Detalhes do Carro ===
Marca: Toyota
Modelo: Corolla
Ano: 2023
Número de Portas: 4

=== Detalhes do Carro ===
Marca: Honda
Modelo: Civic
Ano: 2022
Número de Portas: 4

=== Detalhes da Moto ===
Marca: Honda
Modelo: CB 600F
Ano: 2023
Cilindradas: 600cc

=== Detalhes da Moto ===
Marca: Yamaha
Modelo: MT-07
Ano: 2022
Cilindradas: 689cc

=== DEMONSTRAÇÃO DE POLIMORFISMO ===
=== Detalhes do Carro ===
Marca: Toyota
Modelo: Corolla
Número de Portas: 4

=== Detalhes da Moto ===
Marca: Honda
Modelo: CB 600F
Ano: 2023
Cilindradas: 600cc
```

## 🔧 Conceitos de POO Demonstrados

### 1. **Herança**
- Classes `Carro` e `Moto` herdam de `Veiculo`
- Reutilização de código da classe pai
- Extensão de funcionalidades específicas

### 2. **Polimorfismo**
- Método `exibirDetalhes()` sobrescrito em cada subclasse
- Comportamento específico para cada tipo de veículo
- Array de `Veiculo[]` contendo diferentes tipos

### 3. **Encapsulamento**
- Atributos protegidos (`protected`) na classe pai
- Atributos privados (`private`) nas subclasses
- Métodos getters e setters para acesso controlado

### 4. **Sobrescrita de Métodos**
- Uso da anotação `@Override`
- Implementação específica em cada subclasse
- Manutenção da assinatura do método pai

## 📋 Requisitos do Sistema

- **Java 8** ou superior
- **JDK** instalado e configurado no PATH
- Sistema operacional: Windows, Linux ou macOS

## 🛠️ Compatibilidade

O projeto foi configurado para ser compatível com **Java 8**, garantindo execução em sistemas com versões mais antigas do Java Runtime Environment (JRE).

## 👨‍💻 Estrutura das Classes

### Classe Veiculo (Classe Base)
- Atributos: marca, modelo, ano
- Método: exibirDetalhes()
- Construtor e getters/setters

### Classe Carro (Subclasse)
- Herda de Veiculo
- Atributo adicional: numeroPortas
- Sobrescreve exibirDetalhes()

### Classe Moto (Subclasse)
- Herda de Veiculo
- Atributo adicional: cilindradas
- Sobrescreve exibirDetalhes()

### Classe TesteSistemaVeiculos (Teste)
- Cria instâncias de Carro e Moto
- Demonstra herança e polimorfismo
- Exibe resultados formatados

## 📝 Observações

- Todos os arquivos estão codificados em UTF-8
- Scripts de compilação incluem compatibilidade com Java 8
- Projeto segue boas práticas de POO
- Código bem documentado e organizado

## 🤔 Análise Técnica: Perguntas e Respostas

### **1. 🎯 Quais são as vantagens de utilizar herança no código desenvolvido?**

**✅ Principais Vantagens:**

- **🔄 Reutilização de Código:** 
  - As classes `Carro` e `Moto` herdam automaticamente os atributos (`marca`, `modelo`, `ano`) e métodos da classe `Veiculo`
  - Evita duplicação de código - não precisamos reescrever os mesmos atributos em cada subclasse

- **📈 Facilidade de Manutenção:**
  - Mudanças na classe base (`Veiculo`) são automaticamente refletidas nas subclasses
  - Centralização da lógica comum em um só lugar

- **🎭 Polimorfismo:**
  - Podemos tratar objetos `Carro` e `Moto` como `Veiculo` genérico
  - Demonstrado no array `Veiculo[] veiculos = {carro1, moto1}`

- **🏗️ Estrutura Hierárquica:**
  - Organização lógica do código seguindo relacionamentos "é um" (Carro **é um** Veiculo)
  - Facilita compreensão e extensibilidade do sistema

- **🔧 Extensibilidade:**
  - Fácil adição de novos tipos de veículos (ex: `Caminhao`, `Bicicleta`) sem modificar código existente

### **2. ⚠️ O que acontece se removermos o método sobrescrito exibirDetalhes() das subclasses?**

**🔍 Demonstração Prática:**

**❌ Sem sobrescrita (método da classe pai):**
```
=== Detalhes do Veículo ===
Marca: Toyota
Modelo: Corolla
Ano: 2023
```

**✅ Com sobrescrita (método específico):**
```
=== Detalhes do Carro ===
Marca: Toyota
Modelo: Corolla
Ano: 2023
Número de Portas: 4
```

**📋 Consequências:**

- **🔄 Herda o método da classe pai:** A subclasse usa automaticamente o método `exibirDetalhes()` da classe `Veiculo`
- **❌ Perde informações específicas:** Não exibe atributos únicos da subclasse (ex: `numeroPortas`)
- **⚡ Funciona, mas é limitado:** O programa não quebra, mas perde funcionalidade específica
- **🎭 Polimorfismo ainda funciona:** Mas com comportamento genérico

### **3. 🛠️ Quais foram os desafios ao implementar as subclasses?**

**🎯 Principais Desafios Identificados:**

**1. 🏗️ Design da Herança:**
- **Desafio:** Decidir quais atributos/métodos devem ser `protected` vs `private`
- **Solução:** Usar `protected` para permitir acesso direto nas subclasses

**2. 🔄 Sobrescrita Adequada:**
- **Desafio:** Garantir que o método sobrescrito mantenha a funcionalidade base + adicione especificidades
- **Solução:** Usar `@Override` para garantir sobrescrita correta e incluir todos os atributos relevantes

**3. 🏗️ Construtores:**
- **Desafio:** Chamar corretamente o construtor da classe pai
- **Solução:** Usar `super(marca, modelo, ano)` como primeira linha dos construtores das subclasses

**4. 📊 Balanceamento de Responsabilidades:**
- **Desafio:** Decidir o que fica na classe pai vs subclasses
- **Solução:** Manter funcionalidades comuns na classe pai e específicas nas subclasses

**5. 🎭 Polimorfismo Efetivo:**
- **Desafio:** Garantir que o polimorfismo funcione corretamente
- **Solução:** Implementar sobrescrita consistente em todas as subclasses

**6. 🔧 Compatibilidade:**
- **Desafio:** Manter compatibilidade com Java 8
- **Solução:** Usar flags `-target 8 -source 8` na compilação

**💡 Lições Aprendidas:**
- A herança bem implementada torna o código mais limpo e manutenível
- A sobrescrita de métodos é essencial para aproveitar totalmente o polimorfismo
- O design inicial da classe pai é crucial para o sucesso das subclasses

---