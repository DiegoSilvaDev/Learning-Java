# Exemplo `ArrayIndexOutOfBoundsException`

(índice de matriz fora dos limites)

```java
	try {
		int[] numeros = {1 , 2 ,3} 

		System.out.println(numeros[5]);

	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Erro: " + e.getMessage());
			
	} finally { // Sempre executa
		System.out.println("O programa encerrou.");
	}

```