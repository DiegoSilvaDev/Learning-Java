# Loops (laços)

Os loops (laços) usados para repetir um bloco de código varais vezes.

Exemplo `while`: 

```java
int j = 0;

while (j < 5) {
	System.out.println("O valor de j é: " + j); // primeiroRetorno = 0
	j++;
}
```

## Explicação

O laço `while` em Java repete um bloco de código enquanto uma condição booleana for verdadeira.

- Pontos importantes:

	- **Verificação no início**: Se a condição for falsa desde o começo, o bloco dentro do `while` não é executado nenhuma vez.
	- **Atualização da variável**: Sempre lembre de alterar o valor da variável de controle (como `contador++`) dentro do laço. Caso contrário, você criará um loop infinito que pode travar a aplicação.





