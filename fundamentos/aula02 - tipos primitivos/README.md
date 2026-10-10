# Tipos primitivos em Java

Em Java, existem oito tipos primitivos divididos em quatro categorias principais que armazenam valores simples diretamente na memória

## 1. Números inteiros

- `byte`: Ocupa **1 byte** (8 bits). Valores de `-128` a `127`.
- `short`: Ocupa **2 bytes** (16 bits). Valores de `-32.768` a `32.767`.
- `int`: Ocupa **4 bytes** (32 bits). É o tipo padrão para números inteiros (valores de `-2.147.483.648` a `2.147.483.647`).
- `long`: Ocupa **8 bytes** (64 bits). Usado para números inteiros muito grandes; exige o sufixo `L` no final do número (ex: `1000L`).

## 2. Números de Ponto Flutuante (Decimais)

- `float`: Ocupa **4 bytes** (32 bits). Precisão simples; exige o sufixo `f` ou `F` (ex: `5.75f`).
- `double`: Ocupa **8 bytes** (64 bits). Precisão dupla; é o tipo padrão para números decimais.

## 3. Caractere

- `char`: Ocupa **2 bytes** (16 bits). Armazena um único caractere baseado na tabela Unicode (ex: `'A'`, `'1'`).

## 4. Lógico (Booleano)

- `boolean`: Ocupa **1 byte** na lógica (mas alocado de forma específica na JVM). Assume apenas dois valores: `true` (verdadeiro) ou `false` (falso).

---

### Resumo das Características

- **Armazenamento**: Guardam o valor exato na pilha de memória (ao contrário dos objetos e classes que guardam referências).
- **Classes Wrapper**: Para cada tipo primitivo, o Java fornece uma **classe wrapper** correspondente (como `Integer`, `Double`, `Boolean`) que transforma o tipo em objeto e adiciona métodos úteis.
