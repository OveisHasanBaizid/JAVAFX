package UI;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Test extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        VBox vBox = new VBox();
        vBox.setMaxSize(100,100);
        Button button1 = new Button("Button1");
        Button button2 = new Button("Button2");
        button1.setId("my_label");

   //     button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");

        ArrayList<String> strings = new ArrayList<>();
        for (String string : strings) {
            System.out.println(string);
        }
        button1.getStylesheets().add("s.css");
        button2.getStylesheets().add("s.css");
        //Registering Event Filter for the event generated on text field

        vBox.getChildren().addAll(button1,button2);
        Scene scene = new Scene(vBox, 400, 400);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
