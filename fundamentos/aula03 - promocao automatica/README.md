# Promoção Automática em java

A promoção automática de tipos (ou *numeric promotion*) em Java é o processo pelo qual o compilador converte automaticamente um tipo de dado menor em um tipo de dado maior durante uma operação ou atribuição, garantindo que não haja perda de precisão.

## Regras da promoção numérica 

### Tipos menores viram `int`:

Os tipos `byte`, `short` e `char` são **sempre promovidos para** `int` no momento em que participam de uma operação aritmética binária, mesmo que nenhum dos operandos seja `int`.
- Exemplo: `byte a = 5;` `byte b = 10;` O resultado de `a + b` será do tipo `int`.

### Inteiro e ponto flutuante:

Se uma das variáveis for do tipo inteiro (`int`, `long`, etc.) e a outra for de ponto flutuante (`float` ou `double`), o valor inteiro é promovido automaticamente para o tipo de ponto flutuante.
- Exemplo: `int x = 10;` `double y = 5.5;` O resultado de `x + y` será um `double`.

### Tipo resultante:

Após a promoção e o alinhamento dos tipos, o valor final da expressão assume o tipo da última promoção realizada.


#### Exemplo:

```java
byte b = 10;
short s = 20;
int i = 50;
long l = 100L;
float f = 2.5f;
double d = 10.5;

/*
    O resultado da soma abaixo será do tipo 'double', 
    pois 'd' é o maior tipo envolvido na expressão:
*/

double resultado = (b + s) + (i * l) + f + d;
```
