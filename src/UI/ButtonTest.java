package UI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class ButtonTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("JavaPro");
        StackPane stackPane = new StackPane();
        Button btn2 = new Button("btn2");
        btn2.setDefaultButton(true);
        btn2.setOnMouseClicked(mouseEvent -> {
            if (mouseEvent.getClickCount()==2)
                System.out.println("btn2");
        });
        stackPane.getChildren().add(btn2);
        Scene scene = new Scene(stackPane,300,300);
        stage.setScene(scene);
        stage.show();
    }
}
