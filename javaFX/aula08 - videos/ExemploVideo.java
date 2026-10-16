import java.io.File;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;


public class ExemploVideo extends Application {

	@Override
	public void start(Stage palco){
		palco.setTitle("Teste");
		//					Diretório atual
		String urlDoVideo = "file:///C:/teste/bcbd4bd4-68e1-4716-8297-e4cab45129c0.mp4";

		Media media = new Media(urlDoVideo);

		MediaPlayer mediaPlayer = new MediaPlayer(media);

		MediaView mediaView = new MediaView(mediaPlayer);

		HBox hBox = new HBox();
		hBox.getChildren().add(mediaView);


		Scene cena = new Scene(hBox, 800, 600);
		palco.setScene(cena);
		palco.show();

		mediaPlayer.play();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

		