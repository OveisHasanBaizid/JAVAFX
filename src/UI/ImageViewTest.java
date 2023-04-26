package UI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicInteger;

public class ImageViewTest extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Button buttonNext = new Button("Next");
        Button buttonPrev = new Button("Prev");

        String[] images = {"a.jpg","b.jpg","c.jpg"};

        FileInputStream stream = new FileInputStream(images[0]);
        Image image = new Image(stream);

        ImageView imageView = new ImageView();
        imageView.setImage(image);

        imageView.setFitWidth(300);
        imageView.setFitHeight(100);

        imageView.setPreserveRatio(true);

        imageView.setSmooth(true);

//        imageView.setOnMouseClicked(mouseEvent -> {
//            imageView.setImage(null);
//        });
        AtomicInteger counter= new AtomicInteger();
        buttonNext.setOnAction(actionEvent -> {
            counter.getAndIncrement();
            if (counter.get() >2)
                counter.set(0);
            try {
                imageView.setImage(new Image(new FileInputStream(images[counter.get()])));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        });

        buttonPrev.setOnAction(actionEvent -> {
            counter.getAndDecrement();
            if (counter.get()<0)
                counter.set(2);
            try {
                imageView.setImage(new Image(new FileInputStream(images[counter.get()])));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        });
        HBox hBox = new HBox();
        hBox.getChildren().addAll(buttonPrev,imageView,buttonNext);
        hBox.setPadding(new Insets(50));
        hBox.setSpacing(30);
        Scene scene = new Scene(hBox, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
