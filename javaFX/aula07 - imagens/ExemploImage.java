import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class ExemploImage extends Application {

	@Override
	public void start(Stage palco){
		palco.setTitle("Teste");
		//							Diretório atual
		Image imagem = new Image("./img/shocked-gasp.gif");

		ImageView imageView = new ImageView(imagem);

		// Configuração para ajustar o tamanho da imagem
		imageView.setFitWidth(613); 		// Largura desejada em pixels
		imageView.setFitHeight(640);		// Altura desejada em pixels
		imageView.setPreserveRatio(true);	// Mantém a proporção original da imagem

		VBox vBox = new VBox(imageView);

		Scene cena = new Scene(vBox, 613, 460);
		palco.setScene(cena);
		palco.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

		