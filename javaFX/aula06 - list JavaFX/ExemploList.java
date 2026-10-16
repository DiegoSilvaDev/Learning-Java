import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.scene.control.ListView;


public class ExemploList extends Application {

	@Override
	public void start(Stage palco){
		palco.setTitle("Teste");

		ObservableList<String> itens;
		itens = FXCollections.observableArrayList("Item 1", "Item 2", "Item 3");

		ListView<String> listView = new ListView<>(itens);

		VBox layout = new VBox(listView);

		Scene cena = new Scene(layout, 300, 200);

		palco.setScene(cena);
		palco.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

		