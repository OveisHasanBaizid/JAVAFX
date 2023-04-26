package Layout;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class BorderPaneTest extends Application {
    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button center = new Button("Center");
        Button top = new Button("Top");
        Button bottom = new Button("Bottom");
        Button left = new Button("Left");
        Button right = new Button("Right");

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(center);
        HBox hBox = new HBox(top);
        hBox.setAlignment(Pos.CENTER);
        borderPane.setTop(hBox);
        borderPane.setBottom(bottom);

        borderPane.setLeft(left);
        borderPane.setRight(right);



        Scene scene = new Scene(borderPane, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
