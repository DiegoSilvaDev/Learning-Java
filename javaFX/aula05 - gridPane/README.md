# `GridPane`

- `GridPane` organiza elementos (grade, com linhas e colunas)

- `Insets` é usada para espaçamento em torno de um elemento

	```java
	import javafx.scene.layout.GridPane;
	import javafx.geometry.Insets;
	// Outros imports

	// Criação dos elementos (rótulos, campos de texto e botão)
	Label rotuloNome = new Label("Nome: ");
	Label rotuloEmail = new Label("Email: ");

	TextField campoNome = new TextField();
	TextField campoEmail = new TextField();

	Button botaoEnviar = new Button("Enviar");

	// Definição do GridPane
	GridPane gridPane = new GridPane();
	gridPane.setHgap(8);// Espaçamento horizontal entre células
	gridPane.setVgap(8);// Espaçamento vertical entre células
	gridPane.setPadding(new Insets(5));// Espaçamento externo
	
	// Adição dos elementos ao GridPane
	gridPane.addRow(0, rotuloNome, campoNome);
	gridPane.addRow(1, rotuloEmail, campoEmail);
	gridPane.addRow(2, botaoEnviar);



	```



