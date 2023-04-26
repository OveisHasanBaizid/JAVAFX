package UI;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class HyperLinkTest extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Hyperlink hyperlink = new Hyperlink("https://www.google.com");
        WebView webView = new WebView();
        webView.setMaxSize(300,300);
        WebEngine engine = webView.getEngine();

        hyperlink.visitedProperty().addListener((observableValue, aBoolean, t1) -> {
           engine.load(hyperlink.getText());
        });

        VBox vBox = new VBox();
        vBox.getChildren().addAll(hyperlink,webView);
        vBox.setPadding(new Insets(20));
        vBox.setSpacing(20);
        Scene scene = new Scene(vBox, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
