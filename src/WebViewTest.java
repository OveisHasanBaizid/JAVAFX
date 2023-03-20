import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class WebViewTest extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        WebView webView = new WebView();
        WebEngine engine = webView.getEngine();

       // engine.load("https://www.google.com");

    //    webView.setFontScale(2.0);
    //    webView.setZoom(2.0);
     //   webView.setMaxSize(200,200);
      //  System.out.println(engine.getLocation());

        engine.loadContent("<html><body><b>JavaFX</b></body></html>");

        VBox vBox = new VBox();
        vBox.getChildren().add(webView);
        vBox.setPadding(new Insets(20));
        vBox.setSpacing(20);
        Scene scene = new Scene(vBox, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
