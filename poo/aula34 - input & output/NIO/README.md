# NIO em Java 

- NIO (New Input/OutPut)

## Exemplo de NIO em Java
	
```java 
	
	Path path = Paths.get("meuArquivo.txt");

	// Escrevendo em um arquivo
	Files.write(path, "Olá, mundo".getBytes());

	// Lendo de um arquivo
	byte[] bytes = Files.readAllBytes(path);

	String content = new String(bytes);

	System.out.println(content);
```

