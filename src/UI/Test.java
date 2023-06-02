package UI;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.input.ScrollEvent;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicReference;

public class Test extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        primaryStage.setTitle("Hello World");
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setMaxSize(800,800);
        Group group = new Group();
//        ImageView imageView = new ImageView(new Image(new FileInputStream("Images\\JavaPro.jpg")));
//        imageView.setFitHeight(400);
//        imageView.setFitWidth(800);
        TextArea textArea = new TextArea();
        textArea.setMaxSize(800,800);

        scrollPane.setHmax(100);
        scrollPane.setVmax(100);
        textArea.setOnScroll(new EventHandler<ScrollEvent>() {

            @Override
            public void handle(ScrollEvent scrollEvent) {
                System.out.println(scrollEvent.getEventType());
            }
        });
        group.getChildren().add(textArea);
        scrollPane.setContent(group);
        Scene scene = new Scene(scrollPane, 150, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
