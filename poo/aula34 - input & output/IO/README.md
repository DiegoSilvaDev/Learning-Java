# IO em Java
- IO (Input/OutPut)

## Exemplo de IO em Java
	
```java 
	// Escrevendo em um arquivo
	FileWriter writer = new FileWriter("meuArquivo.txt");

	writer.write("Olá, mundo"); // Gravar

	// Lendo de um arquivo

	FileReader reader = new FileReader("meuArquivo.txt");

	int data = reader.read(); // Ler
```

