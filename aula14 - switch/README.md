# Switch:

Exemplo 1:

```java
int day = 3;

switch (day) {

	case 1 -> System.out.println("Segunda");
	case 2 -> System.out.println("Terça");
	case 3 -> System.out.println("Quarta");

	// ...

	default -> System.out.println("Desconhecido");
}
```

Exemplo 2: 

```java
String day = "Ter";

String typeOfDay = switch (day) {
	case "Seg.", "Ter.", "Qua.", "Qui.", "Sex." -> "Dia util";
	case "Sabado", "Domingo" -> "Fim de semana";
	default -> "Desconhecido";
};

System.out.println(typeOfDay); // Dia util
```

## Explicação

- `switch`:

	O `switch` no Java é uma estrutura de controle de fluxo usada para substituir múltiplos blocos de `if-else` encadeados, tornando o código mais limpo e legível. Ele testa o valor de uma única variável ou expressão e o compara com várias opções.


