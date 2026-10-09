# Controle de Loop

## Exemplo `break`: 

```java
for (int i = 0; i < 10; i++) {
	if (i == 5 ) {
		break; // Sai do loop quando i é == (igual) a 5
	}

	System.out.println(i);
}
```

### Explicação `break`

- **O que faz**: Interrompe e finaliza o loop imediatamente.
- **Onde acontece**: O fluxo do programa sai de dentro do laço e vai direto para a primeira linha de código logo após ele.

## Exemplo `continue`: 

```java
for (int j = 0; j < 10; j++) {
	if (j == 5 ) {
		continue; // Pula a iteração quando i é == (igual) a 5
	}

	System.out.println(i);
}
```

### Explicação `continue`

- **O que faz**: Pula o restante da iteração atual e passa direto para a próxima volta do laço.
- **Onde acontece**: O código que estiver abaixo do `continue` naquela rodada é ignorado.





