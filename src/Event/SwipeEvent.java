package Event;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
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
        VBox vBox = new VBox();
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");
        // Register an event filter for a single node and a specific event type
        node.addEventFilter(MouseEvent.MOUSE_CLICKED,
                new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent) { ... };
                });

// Define an event filter
        EventHandler filter = new EventHandler(<InputEvent>() {
            public void handle(InputEvent event) {
                System.out.println("Filtering out event " + event.getEventType());
                event.consume();
            }

// Register the same filter for two different nodes
            myNode1.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            myNode2.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);

// Register the filter for another event type
            myNode1.addEventFilter(KeyEvent.KEY_PRESSED, filter);

        stackPane.getChildren().add(imageView);
        Scene scene = new Scene(stackPane, 800, 400);
        stage.setScene(scene);
        stage.show();
    }
    }
    V
}
