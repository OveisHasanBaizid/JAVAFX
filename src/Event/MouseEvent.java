package Event;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class MouseEvent extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();
        Button button = new Button("Button");
        vBox.getChildren().add(button);

        button.setOnMouseClicked(mouseEvent -> {
            if (mouseEvent.getClickCount()==2)
                System.out.println("2");
            else
                System.out.println("1");

        });
//        button.setOnMouseClicked(mouseEvent -> {
//            System.out.println("Clicked");
//        });
//        button.setOnMouseEntered(mouseEvent -> {
//            System.out.println("Entered");
//        });
//        button.setOnMouseExited(mouseEvent -> {
//            System.out.println("Exited");
//        });
        Scene scene = new Scene(vBox, 400, 400);
//        scene.setOnMouseMoved(mouseEvent -> {
//            System.out.println("Moved");
//        });
//        scene.setOnMousePressed(mouseEvent -> {
//            System.out.println("Pressed");
//        });
//        scene.setOnMouseReleased(mouseEvent -> {
//            System.out.println("Released");
//        });
//         scene.setOnMouseDragged(mouseEvent -> {
//              System.out.println("Dragged");
//        });

        stage.setScene(scene);
        stage.show();
    }
}
