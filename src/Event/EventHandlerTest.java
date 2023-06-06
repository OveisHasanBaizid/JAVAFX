package Event;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
public class EventHandlerTest extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();
        Label label1 = new Label("Label1");
        Label label2 = new Label("Label2");
        vBox.getChildren().addAll(label1 , label2);

        EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("Label");
            }
        };
        label1.addEventHandler(MouseEvent.MOUSE_CLICKED , handler);
        label2.addEventHandler(MouseEvent.MOUSE_CLICKED , handler);
        vBox.addEventHandler(MouseEvent.MOUSE_CLICKED , handler);

        vBox.addEventHandler(MouseEvent.MOUSE_CLICKED, new javafx.event.EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("VBox");
                event.consume();
            }
        });


        label1.addEventHandler(MouseEvent.MOUSE_CLICKED, new javafx.event.EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Label");
            }
        });


        Scene scene = new Scene(vBox, 400, 400);

        scene.addEventHandler(MouseEvent.MOUSE_CLICKED, new javafx.event.EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("scene");
            }
        });

        stage.addEventHandler(MouseEvent.MOUSE_CLICKED, new javafx.event.EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Stage");
            }
        });

        stage.setScene(scene);
        stage.show();
    }
}
