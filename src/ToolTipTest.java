import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class ToolTipTest extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();
        Button button = new Button("Button");
        Tooltip tooltip = new Tooltip("Java Pro");

        ImageView imageView = new ImageView(new Image(new FileInputStream("JavaPro.jpg")));
        imageView.setFitHeight(100);
        imageView.setFitWidth(200);
        tooltip.setGraphic(imageView);

        button.setTooltip(tooltip);

//        button.setOnAction(actionEvent -> {
//            Tooltip.install(button,tooltip);
//        });


        vBox.getChildren().add(button);

        vBox.setPadding(new Insets(50));
        vBox.setSpacing(70);
        Scene scene = new Scene(vBox, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
