package UI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ProgressBarTest extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label label = new Label("Value : 0.0%");
        Button button = new Button("Click");
        ProgressBar bar = new ProgressBar(0);
//        boolean b = bar.isIndeterminate();
//        System.out.println(b);
        //   bar.setProgress(0.34);

        // ProgressIndicator indicator = new ProgressIndicator(0.65);


        button.setOnAction(actionEvent -> {
            double value = bar.getProgress();
            if (value < 1)
                value += .1;
            bar.setProgress(value);
            label.setText("Value : " + value * 100 + "%");
        });


        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, bar, button);
        vBox.setPadding(new Insets(50));
        vBox.setSpacing(70);
        Scene scene = new Scene(vBox, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
