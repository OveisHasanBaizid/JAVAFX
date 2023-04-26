package Layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HBoxTest extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button btn1 = new Button("Btn1");
        Button btn2 = new Button("Btn2");
        Button btn3 = new Button("Btn3");

        Button btn4 = new Button("Btn4");
        Button btn5 = new Button("Btn5");
        Button btn6 = new Button("Btn6");

        VBox vBox = new VBox();
        HBox hBox = new HBox();

        hBox.getChildren().addAll(btn4,btn5,btn6);

        vBox.getChildren().addAll(btn1,btn2,btn3,hBox);

        vBox.setPadding(new Insets(30));

        vBox.setAlignment(Pos.CENTER);

        vBox.setSpacing(20);



        Scene scene = new Scene(vBox, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
