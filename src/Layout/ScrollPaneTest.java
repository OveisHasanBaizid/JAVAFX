package Layout;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class ScrollPaneTest extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group group = new Group();
        ImageView imageView = new ImageView(new Image(new FileInputStream("Images\\JavaPro.jpg")));
        ScrollPane scrollPane = new ScrollPane();

        scrollPane.setContent(imageView);
        group.getChildren().add(scrollPane);
        scrollPane.setPrefSize(200,200);

//        scrollPane.setHvalue(.5);
//        scrollPane.setVvalue(.5);

//        scrollPane.setHmax(.5);

       // scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        scrollPane.vvalueProperty().addListener((observableValue, oldValue, newValue) -> {
            System.out.println(newValue.floatValue());
        });

        Scene scene = new Scene(group, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
