import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;


public class ExemploControlesComCssArquivoSeperado extends Application {

	@Override
	public void start(Stage palco) {
		palco.setTitle("Teste");

		Label label = new Label("Olá, mundo! Sou um etiqueta (Label).");
		label.getStyleClass().add("etiqueta");

		Button botao = new Button("Clique aqui");
		botao.getStyleClass().add("botao");

		TextField campoTexto = new TextField();
		campoTexto.getStyleClass().add("campoTexto");

		VBox layout 
		= new VBox(label, botao, campoTexto);

		Scene cena = new Scene(layout, 300, 200);
		cena.getStylesheets().add("./styles.css");
		
		palco.setScene(cena);
		palco.show();
	}


	public static void main(String[] args) {
		launch(args);
	}
}