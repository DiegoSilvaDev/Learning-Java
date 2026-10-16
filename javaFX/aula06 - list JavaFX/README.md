# Trabalhando com Listas


- `ListView`
- `ObservableList`
- `FXCollections`

	```java
	import javafx.collections.FXCollections;
	import javafx.collections.ObservableList;
	import javafx.scene.control.ListView;
	// Outros imports

	// Montando List
	ObservableList<String> itens;
	itens = FXCollections.ObservableList("Item 1", "Item 2", "Item 3");

	ListView<String> listView = new ListView<>(itens);

	VBox vBox = new VBox(listView);


	```



