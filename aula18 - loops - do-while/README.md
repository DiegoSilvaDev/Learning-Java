# Loops (laços)

Os loops (laços) usados para repetir um bloco de código varais vezes.

Exemplo `do-while`: 

```java
int k = 0;

do {
	System.out.println("O valor de k é: " + k); // primeiroRetorno = 0
	k++;

} while (k < 5);
```

## Explicação

O laço `do-while` em Java executa um bloco de código pelo menos uma vez antes de testar a condição no final.

- Principal Caracteristica:

	- `while`: Testa a condição antes de executar. Se for falsa de início, o bloco nunca roda.
	- `do-while`: Executa o bloco e testa a condição depois. Isso garante que o bloco rode ao menos uma vez, mesmo que a condição seja falsa.





