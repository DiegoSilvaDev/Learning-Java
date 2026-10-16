# Trabalhando com Imagens

- Uso de `Image` (bmp, gif, jpeg e png) e `ImageView`


- Outras Bibliotecas
	- `Java Advanced Imaging (JAI)`, `ImageIO`, `JavaFX Canvas`

### Exemplo

```java
	import javafx.scene.image.Image;
	import javafx.scene.image.ImageView;
	// Outros imports

	// Montando List 		// Caminho absoluto
	Image imagem = new Image("file:///caminho/para/imagem.png");

	ImageView imageView = new ImageView(imagem);

	VBox vBox = new VBox(imageView);


```



