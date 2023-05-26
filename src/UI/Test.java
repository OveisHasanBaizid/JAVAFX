package UI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Test extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World");

        VBox vBox = new VBox();


        Button btn1 = new Button("Button1");


//        btn1.setOnKeyTyped(new EventHandler<KeyEvent>() {
//            @Override
//            public void handle(KeyEvent keyEvent) {
//                System.out.println(keyEvent.isShortcutDown());
//            }
//        });

//        btn1.setOnKeyPressed(new EventHandler<KeyEvent>() {
//            @Override
//            public void handle(KeyEvent keyEvent) {
//                System.out.println("Pressed");
//            }
//        });
//        btn1.setOnKeyReleased(new EventHandler<KeyEvent>() {
//            @Override
//            public void handle(KeyEvent keyEvent) {
//                System.out.println("Released");
//            }
//        });
        btn1.setOnMouseDragExited(event -> {
            System.out.println("Mouse dragged outside the button.");
        });
        btn1.setOnMouseDragEntered(event -> {

        });
        vBox.getChildren().addAll(btn1);
        Scene scene = new Scene(vBox, 300, 250);


        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
