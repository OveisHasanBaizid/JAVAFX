package UI;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.TouchEvent;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        primaryStage.setTitle("Hello World");
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setMaxSize(800, 800);
        Group group = new Group();
        ImageView imageView = new ImageView(new Image(new FileInputStream("Images\\JavaPro.jpg")));
        imageView.setFitHeight(400);
        imageView.setFitWidth(800);

        scrollPane.setHmax(100);
        scrollPane.setVmax(100);

        imageView.setOnTouchMoved(touchEvent -> {
            System.out.println("Touch");
        });
       
        group.getChildren().add(imageView);
        scrollPane.setContent(group);
        Scene scene = new Scene(scrollPane, 820, 420);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
