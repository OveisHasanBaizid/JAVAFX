package Event;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SwipeEvent extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        StackPane stackPane = new StackPane();

        ImageView imageView = new ImageView(new Image(new FileInputStream("Images\\JavaPro.jpg")));
        imageView.setFitHeight(400);
        imageView.setFitWidth(800);

        imageView.setOnSwipeUp(swipeEvent -> {
            try {
                imageView.setImage(new Image(new FileInputStream("Images\\a.jpg")));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        });

        imageView.setOnSwipeDown(swipeEvent -> {
            try {
                imageView.setImage(new Image(new FileInputStream("Images\\b.jpg")));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        });

        imageView.setOnSwipeLeft(swipeEvent -> {
            try {
                imageView.setImage(new Image(new FileInputStream("Images\\c.jpg")));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        });

        imageView.setOnSwipeRight(swipeEvent -> {
            try {
                imageView.setImage(new Image(new FileInputStream("Images\\JavaPro.jpg")));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        });

        stackPane.getChildren().add(imageView);
        Scene scene = new Scene(stackPane, 800, 400);
        stage.setScene(scene);
        stage.show();
    }
}
