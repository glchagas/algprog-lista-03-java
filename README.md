# 🚀 Lista de Exercícios III em Java — Algoritmos e Programação

## 📖 Sobre o Projeto

Este repositório documenta a implementação da **Lista de Exercícios III** da disciplina **Algoritmos e Programação / Programação de Soluções Computacionais**, proposta pelo **Centro Universitário UNA**.

O projeto foi desenvolvido em **Java**, com foco em lógica de programação, estruturas condicionais, operações matemáticas, entrada e saída de dados pelo console e resolução de problemas introdutórios. A estrutura foi organizada de forma simples, com **um arquivo para cada exercício**, seguindo uma proposta adequada ao **primeiro semestre da faculdade**.

Todos os programas foram escritos com sintaxe básica da linguagem, utilizando recursos fundamentais como:

- classe `public`
- método `main`
- `Scanner` para leitura de dados
- variáveis simples
- estruturas condicionais
- operações matemáticas
- exibição de resultados no console

---

## 🎯 Objetivos da Atividade

- Praticar lógica de programação com Java
- Trabalhar entrada e saída de dados no console
- Utilizar estruturas de decisão com `if`, `else` e `switch`
- Organizar cada exercício em um arquivo separado
- Manter o código simples, legível e bem indentado
- Desenvolver a base de programação exigida no início da graduação

---

## 🧩 Conteúdo Prático Desenvolvido

O projeto contém 6 exercícios independentes:

1. Leitura de 3 números com cálculo de maior, menor e média
2. Cálculo de troco com menor quantidade de notas
3. Resolução de equação do primeiro e segundo grau
4. Cálculo de perímetro, área ou volume com base em um código
5. Calculadora simples com operadores matemáticos
6. Sorteio de número aleatório com identificação de par ou ímpar

---

## ⚙️ Estrutura do Projeto

Os exercícios foram organizados com um arquivo `.java` para cada problema.

### Estrutura

```text
algprog-lista-03-java/
├── README.md
  ├──algprog-lista-03-java-exercícios
    ├── Exercicio01.java
    ├── Exercicio02.java
    ├── Exercicio03.java
    ├── Exercicio04.java
    ├── Exercicio05.java
    └── Exercicio06.java
```

### Descrição dos arquivos

- `Exercicio01.java` → lê 3 números e mostra o maior, o menor e a média
- `Exercicio02.java` → calcula o troco e informa a quantidade de notas
- `Exercicio03.java` → resolve equações com validação dos coeficientes e do delta
- `Exercicio04.java` → calcula perímetro do círculo, área do círculo ou volume da esfera
- `Exercicio05.java` → realiza operações matemáticas com dois números reais
- `Exercicio06.java` → sorteia um número entre dois inteiros e informa se é par ou ímpar

---

## 💻 Exercícios Desenvolvidos

### 1. Maior, menor e média de três números

O programa solicita três números ao usuário e exibe:

- o maior número
- o menor número
- a média aritmética dos três valores

### 2. Máquina de venda automática com troco

O programa solicita:

- o valor da compra
- o valor pago

Depois disso, verifica se o valor pago é suficiente e, se for, calcula o troco com a menor quantidade possível de notas de:

- R$ 50,00
- R$ 20,00
- R$ 10,00
- R$ 5,00
- R$ 2,00
- R$ 1,00

### 3. Equação de segundo grau

O programa solicita os coeficientes `a`, `b` e `c` e analisa:

- se os coeficientes foram informados incorretamente
- se a equação é de primeiro grau
- se não existem raízes reais
- se existem duas raízes reais iguais
- se existem duas raízes reais diferentes

### 4. Operações com círculo e esfera

O programa solicita:

- o código da operação
- o valor do raio

Com base no código informado, calcula:

- perímetro do círculo
- área do círculo
- volume da esfera

Se o código for inválido, o programa exibe uma mensagem de erro.

### 5. Calculadora simples

O programa solicita dois números reais e um símbolo de operação:

- `+`
- `-`
- `*`
- `/`
- `^`

Ao final, realiza a operação correspondente ou informa erro caso o símbolo seja inválido.

### 6. Sorteio de número aleatório

O programa solicita dois números inteiros, identifica qual é o menor e qual é o maior e realiza o sorteio de um número aleatório dentro do intervalo informado.

Depois disso, informa:

- o número sorteado
- se ele é par
- ou se ele é ímpar

---

## ▶️ Como Compilar e Executar

Para compilar todos os arquivos Java:

```bash
javac Exercicio01.java Exercicio02.java Exercicio03.java Exercicio04.java Exercicio05.java Exercicio06.java
```

Para executar um exercício específico:

```bash
java Exercicio01
```

Você pode trocar o nome da classe para executar qualquer um dos outros arquivos:

```bash
java Exercicio02
java Exercicio03
java Exercicio04
java Exercicio05
java Exercicio06
```

---

## ✅ Principais Conceitos Utilizados

- declaração de variáveis
- leitura de dados com `Scanner`
- estruturas condicionais
- operações matemáticas
- cálculo de média
- uso de `Math.pow` e `Math.sqrt`
- geração de número aleatório com `Random`
- exibição de resultados com `System.out.println`
- organização de código em arquivos separados

---

## 💡 Boas Práticas Aplicadas

- nomes de classes claros e objetivos
- um exercício por arquivo
- código básico e apropriado para iniciantes
- identação simples e consistente
- uso apenas de recursos fundamentais da linguagem
- fechamento do `Scanner` ao final da execução

---

## 🚀 Aplicação no Contexto Acadêmico

Esta lista fortalece os fundamentos mais importantes do início do curso, especialmente:

- raciocínio lógico
- manipulação de entradas e saídas
- uso de estruturas de decisão
- construção de algoritmos simples
- interpretação de enunciados
- transformação de problemas do cotidiano em código

Essas habilidades servem como base para conteúdos mais avançados da graduação, como estruturas de repetição, métodos, orientação a objetos e desenvolvimento de sistemas completos.

---

## 🧩 Conclusão

O projeto entrega os seis exercícios pedidos em Java, mantendo uma estrutura simples, organizada e adequada ao nível introdutório da disciplina.

A implementação prioriza clareza, legibilidade e boas práticas básicas, permitindo que o conteúdo seja facilmente entendido, apresentado e executado em sala ou em ambiente de estudos.

---

## 👨‍💻 Autor

Gabriella Chagas
Estudante de Análise e Desenvolvimento de Sistemas  
