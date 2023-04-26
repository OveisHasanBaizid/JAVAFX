package UI;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class ScrollBarTest extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();

        ImageView imageView = new ImageView(new Image(new FileInputStream("JavaPro.jpg")));
        imageView.setFitWidth(600);
        imageView.setFitHeight(300);
        ScrollBar scrollBar = new ScrollBar();

        scrollBar.setOrientation(Orientation.VERTICAL);

        scrollBar.setMin(0);
        scrollBar.setMax(100);
        scrollBar.setValue(25);

        scrollBar.valueProperty().addListener((observableValue, number, t1) ->{
                vBox.setLayoutY(-t1.doubleValue());
        });

        vBox.getChildren().add(imageView);
        Group group = new Group(vBox,scrollBar);
        Scene scene = new Scene(group, 200, 200);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
