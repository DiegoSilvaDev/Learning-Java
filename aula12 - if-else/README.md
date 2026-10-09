# Controle de Fluxo

## Instruções Condicionais

- `if-else`:

```java
int numero = 10;
String resultado;

if(numero % 2 == 0) {

	resultado = "Par";

} else {

	resultado = "Ímpar";
}

System.out.println("O número é: " + resultado);
```

- Operador Ternário: 

```java
int numero = 10;

String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";

System.out.println("O numero é: " + resultado);
```

## Explicação

- `if-else`: 

	- Verifica a condição `numero % 2 == 0`. Se for verdadeira define `resultado` como "Par", caso contrário, como "Ímpar".

- Operador Ternário:
	
	- Faz a mesma verificação, mas de forma mais compacta, menos verbosa: `(numero % 2 == 0) ? "Par" : "Ímpar"`;


Ambas formas chegam ao mesmo resultado produzindo a mesma saída, porém, o operador ternário é mais conciso. Use-o para simplificar o código em situações onde uma simples condição `if-else` é suficiente.