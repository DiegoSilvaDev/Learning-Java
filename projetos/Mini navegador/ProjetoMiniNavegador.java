import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;



public class ProjetoMiniNavegador extends Application {
	@Override
	public void start(Stage palco){
		TextField campoUrl = new TextField();
		WebView navegador = new WebView();
		WebEngine motor = navegador.getEngine();

		// Carregar uma página de web quando o usuário pressiona Enter
		campoUrl.setOnAction(evento -> motor.load(formataUrl(campoUrl.getText())));

		VBox vbox = new VBox();
		vbox.getChildren().addAll(campoUrl, navegador);
		Scene cena = new Scene(vbox);

		palco.setTitle("Meu Browser Java");
		palco.setScene(cena);
		palco.show();
	}
	
	// Método para inserir http se o usuário não digitar
	public String formataUrl(String url) {
		if(!url.startsWith("http://") && !url.startsWith("https://")) {
			url = "http://" + url;
		}

		return url;
	}

	public static void main(String[] args){
		launch(args);


	}
}