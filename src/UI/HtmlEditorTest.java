package UI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.web.HTMLEditor;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class HtmlEditorTest extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        VBox vBox = new VBox();
        Button button = new Button("Load");
        WebView webView = new WebView();
        WebEngine engine = webView.getEngine();
        HTMLEditor htmlEditor = new HTMLEditor();
      //  String text = "<html><body><h1>JavaPro</h1></body></html>";
      //  htmlEditor.setHtmlText(text);
        button.setOnAction(actionEvent -> {
            engine.loadContent(htmlEditor.getHtmlText());
        });
        vBox.getChildren().addAll(htmlEditor,button,webView);
        vBox.setPadding(new Insets(20));
        vBox.setSpacing(20);
        Scene scene = new Scene(vBox, 900, 800);
        stage.setScene(scene);
        stage.show();
    }
}
