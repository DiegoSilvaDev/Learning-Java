# Trabalhando com Vídeos

- Módulos usados para Vídeos
	- javafx.controls
	- javafx.media (adição)
		- Media, MediaPlayer e MediaView
		- Pacote javafx.scene.media

### Compilação exemplo:

```bash
	# Compilação:
		javac --module-path "%PATH_TO_FX%" --add-modules javafx.controls, javafx.media ExemploVideo.java
		
		# Ou
		
		javac --module-path "caminho absoluto" --add-modules javafx.controls,javafx.media ExemploVideo.java

```

### Execução exemplo:

```bash
	# Execução:
		java --module-path "%PATH_TO_FX%" --add-modules javafx.controls,javafx.media ExemploVideo

		# Ou

		java --module-path "caminho absoluto" --add-modules javafx.controls,javafx.media ExemploVideo


```

### Exemplo código:

```java
	import javafx.scene.media.Media;
	import javafx.scene.media.MediaPlayer;
	import javafx.scene.media.MediaView;
	// Outros imports

	String urlDoVideo = "caminho absoluto";

	Media media = new Media(urlDoVideo);

	MediaPlayer mediaPlayer = new MediaPlayer(media);

	MediaView mediaView = new MediaView(mediaPlayer);

	// Restatante do código

	mediaPlayer.play();
```