package Layout;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneTest extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FlowPane flowPane = new FlowPane();

        flowPane.setOrientation(Orientation.VERTICAL);

        flowPane.setVgap(20);
        flowPane.setHgap(20);

        flowPane.setPadding(new Insets(20));

        flowPane.setAlignment(Pos.CENTER);

     //   flowPane.setRowValignment();

        for (int i = 1; i <=10 ; i++) {
            flowPane.getChildren().add(new Button("Button"+i));
        }

        Scene scene = new Scene(flowPane, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
