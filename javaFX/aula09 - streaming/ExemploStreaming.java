import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.web.WebView;

public class ExemploStreaming extends Application {

	@Override
	public void start(Stage palco){
		palco.setTitle("Teste");
		
		WebView webView = new WebView();

		String urlVideo;
		urlVideo = "https://www.tiktok.com/@edubgx/video/7693199491217886471";

		webView.getEngine().load(urlVideo);

		Scene cena = new Scene(webView, 800, 600);
		palco.setScene(cena);
		palco.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}

		