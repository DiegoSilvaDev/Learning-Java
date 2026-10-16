import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ExemploLayouts extends Application {

	@Override
	public void start(Stage palco) {
		palco.setTitle("Teste");

		Button botao1 = new Button("Botão 1");
		Button botao2 = new Button("Botão 2");
		HBox hBox = new HBox(botao1, botao2);
	 	hBox.setAlignment(Pos.CENTER);
		
		Button botao3 = new Button("Botão 3");
		Button botao4 = new Button("Botão 4");
		VBox vBox = new VBox(botao3, botao4);
		vBox.setAlignment(Pos.CENTER);

		BorderPane borderPane = new BorderPane();
		borderPane.setTop(hBox);
		borderPane.setCenter(vBox);

		Scene cena = new Scene(borderPane, 300, 300);
		palco.setScene(cena);
		palco.show();
	} 
}

		