import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.File;
import javafx.stage.FileChooser;

public class ExemploFileChooser extends Application {

	@Override
	public void start(Stage palco){
		palco.setTitle("Teste");
		
		FileChooser seletorDeArquivo = new FileChooser();
		seletorDeArquivo.setTitle("Escolha um arquivo");

		Button botaoAbrir = new Button("Abrir arquivo");
		botaoAbrir.setOnAction(e -> {
			File arquivoSelecionado = seletorDeArquivo.showOpenDialog(palco);
			if(arquivoSelecionado != null){
				exibirImagem(arquivoSelecionado, palco);
			}
		});

		VBox layout = new VBox(botaoAbrir);

		Scene cena = new Scene(layout, 800, 600);

		palco.setScene(cena);
		palco.show();



		
	}

	private void exibirImagem(File arquivo, Stage palcoDoArquivoSelecionado) {
		Image imagem = new Image(arquivo.toURI().toString());
		ImageView imageView = new ImageView(imagem);

		VBox layout;

		// A linha abaixo obtém o layout atual
		layout = (VBox) palcoDoArquivoSelecionado.getScene().getRoot();

		// Adicionar a imagem ao layout
		layout.getChildren().add(imageView);

		// Ajustar tamanho da imagem
		imageView.setFitWidth(500);
		imageView.setFitHeight(500);

		palcoDoArquivoSelecionado.setTitle("Seletor de Arquivos");
	}


	public static void main(String[] args) {
		launch(args);
	}
}

		