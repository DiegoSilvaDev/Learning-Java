# Tipos de Operadores

## Em java, os operadores são divididos em vários grupos:

- **Operadores Aritméticos**: Realizam operações matemáticas.
- **Operadores de comparação**: Comparam dois valores.
- **Operadores lógicos**: Combinam duas ou mais condições.
- **Operadores de Atribuição**: Atribuem valores a variáveis.
- **Operadores de Incremento e Decremento**: Manipulações de valores. 

# Operadores de Unários (Incremento e Decremento)

Os operadores unários são usados para operar em um único operando:

- **Incremento (++)**
- **Decremento (--)**
- **Positivo (+)**
- **Negativo (-)**
- **Negação lógica (!)**


Exemplo:

```java
int a = 10;
a++; // Equivalente a ---> a = a + 1; 
System.out.println(a); // Saída: 11
```

`int a = 5;`

// Pré-incremento `int b = ++a;` // Agora, `a` é 6 e `b` também é 6

// Pós-incremento `int c = a++;` // Agora, `a` é 7, mas `c` é 6 (porque o valor antigo de `a` foi usado)

// Pré-deceremento `int d = --a;` // Agora, `a` é 6 e `d` também é 6

// Pós-decremento `int e = a--;` // Agora, `a` é 5, mas `e` é 

