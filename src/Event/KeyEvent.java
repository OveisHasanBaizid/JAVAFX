package Event;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class KeyEvent extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();
        Scene scene = new Scene(vBox, 400, 400);
        scene.setOnKeyPressed(keyEvent -> {
            System.out.println();
        });
//        scene.setOnKeyReleased(keyEvent -> {
//            System.out.println("Released");
//        });
//        scene.setOnKeyTyped(keyEvent -> {
//            System.out.println("Typed");
//        });
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
