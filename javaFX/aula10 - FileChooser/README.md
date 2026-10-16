# Trabalhando com o Sistema de arquivos

- Módulo javafx.controls
	
- Classe `javafx.stage.FileChooser`

	### Exemplo código:

	```java
		FileChooser seletorDeArquivo = new FileChooser();
		Button botaoAbrir = new Button("Abrir arquivo");

		botaoAbrir.setOnAction(e -> {

			// Expressão lambda para implementação do evento (ActionEvent)
		
		})
	```

### Compilação exemplo:

```bash
	# Compilação:
		javac --module-path "%PATH_TO_FX%" --add-modules javafx.controls ExemploVideo.java
		
		# Ou
		
		javac --module-path "caminho absoluto" --add-modules javafx.controls ExemploVideo.java

```

### Execução exemplo:

```bash
	# Execução:
		java --module-path "%PATH_TO_FX%" --add-modules javafx.controls ExemploVideo

		# Ou

		java --module-path "caminho absoluto" --add-modules javafx.controls ExemploVideo


```



