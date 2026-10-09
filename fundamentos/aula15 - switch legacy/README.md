# Switch nas versões antigas do java (legacy)

- Só inteiros ou caracteres
- Strings a partir do java 7

Exemplo: 

```java
int dayOfWeek = 3; // 1 Representa Seg. (segunda), 2 - Ter. (terça), e assim por diante.

switch (dayOfWeek) {
	case 1:
		System.out.println("Seg.");
		break;
	case 2:
		System.out.println("Ter.");
		break;
	case 3:
		System.out.println("Qua.");
		break;
	case 4:
		System.out.println("Qui.");
		break;
	case 5: 
		System.out.println("Sex.");
		break;
	default: 
		System.out.println("Dia desconhecido");
		break;
}

```

*Neste exemplo, o valor da variavel `dayOfWeek` é `3`, que corresponde a "Quarta-feira" portanto, a saída esperada é: `Qua.`*

## Explicação

- A característica mais crítica do `switch` legado é que ele não para automaticamente quando encontra o `case` correto. Ele precisa obrigatoriamente da palavra-chave `break`.

	- **Com** `break`: O código executa o bloco correspondente e sai do `switch`.
	- **Sem** `break`: O Java continuará executando todos os `case` seguintes de forma sequencial, mesmo que os valores não batam. Isso é chamado de *fall-through*.




