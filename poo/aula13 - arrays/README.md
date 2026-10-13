# Arrays em Java

Um **array** (ou vetor) em Java é uma estrutura de dados de tamanho fixo usada para armazenar vários valores do mesmo tipo em uma única variável. Os elementos são organizados sequencialmente na memória e acessados por índices que começam em **`0`**.

## Declaração e Inicialização

Você pode declarar e inicializar um array de algumas formas principais:

- **Declarando e definindo o tamanho:**

	```java
		int[] numeros = new int[4]; // Cria um array de inteiros com 4 posições (índices 0 a 3)
	```

- **Declarando e inicializando com valores:**

	```java
		String[] carros = {"Volvo", "BMW", "Ford", "Mazda"};
		int[] valores = {10, 20, 30, 40};
	```

## Acessando e Modificando Elementos: 

Os elementos são manipulados através do índice entre colchetes `[]`:

```java
	String[] frutas = {"Maçã", "Banana", "Uva"};
	String primeiraFruta = frutas[0]; // Retorna "Maçã" (índice 0)
	frutas[1] = "Laranja";            // Altera o segundo elemento (índice 1) para "Laranja"
```

## Principais Características

- **Tamanho fixo**: Uma vez criado, o tamanho do `array` não pode ser alterado. Para estruturas que crescem dinamicamente, usa-se o `ArrayList`.
- **Propriedade `.length`**: Retorna a quantidade de elementos que o `array` comporta.
- **Índice base-0**: O primeiro elemento está no índice `0` e o último no índice `tamanho - 1`.
- **Valores padrão**: Quando criado com `new` sem valores, os primitivos recebem `0`, booleanos `false` e objetos `null`.