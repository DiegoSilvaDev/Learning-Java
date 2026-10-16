# Trabalhando com Vídeos de Streaming

- Módulos usado para Web
	- javafx.web
		- WebView
		- Pacote javafx.scene.web

### Compilação exemplo:

```bash
	# Compilação:
		javac --module-path "%PATH_TO_FX%" --add-modules javafx.web ExemploVideo.java
		
		# Ou
		
		javac --module-path "caminho absoluto" --add-modules javafx.web ExemploVideo.java

```

### Execução exemplo:

```bash
	# Execução:
		java --module-path "%PATH_TO_FX%" --add-modules javafx.web ExemploVideo

		# Ou

		java --module-path "caminho absoluto" --add-modules javafx.web ExemploVideo


```

### Exemplo código:

```java
	import javafx.scene.web.WebView;
	// Outros imports

	WebView webView = new WebView();

	String urlVideo = "https://vimeo.com/76979871";

	webView.getEngine().load(urlVideo);
```

