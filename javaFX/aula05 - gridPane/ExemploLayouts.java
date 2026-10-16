import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;


public class ExemploLayouts extends Application {

	@Override
	public void start(Stage palco) {
		palco.setTitle("Teste");

		// Criação dos elementos (rótulos, campos de textos e botão)

		Label rotuloNome = new Label("Nome: ");
		Label rotuloEmail = new Label("Email: ");

		TextField campoNome = new TextField();
		TextField campoEmail = new TextField();

		Button botaoEnviar = new Button("Enviar");

		// Criação do GridPane

		GridPane gridPane = new GridPane();
		gridPane.setHgap(8); // espaçamento horizontal entre as células
		gridPane.setVgap(8); // espaçamento vertical entre as células
		gridPane.setPadding(new Insets(5)); // espaçamento externo 5 all

		// Adição dos elementos ao GridPane
		gridPane.addRow(0, rotuloNome, campoNome);
		gridPane.addRow(1, rotuloEmail, campoEmail);
		gridPane.addRow(2, botaoEnviar);

		Scene cena = new Scene(gridPane, 400, 200);
		palco.setScene(cena);
		palco.show();

	} 
	public static void main(String[] args){
		launch(args);
	}
}

		