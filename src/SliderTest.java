import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SliderTest extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Slider slider = new Slider(10, 40, 20);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(2);

        Label labelText = new Label("JavaPro");
        Label labelSize = new Label("Size : 20");


        labelText.setFont(Font.font(20));

        slider.valueProperty().addListener((observableValue, number, t1) -> {
            labelText.setFont(Font.font(t1.intValue()));
            labelSize.setText("Size : "+t1.intValue());
        });


        VBox vBox = new VBox();
        vBox.getChildren().addAll(labelSize,slider,labelText);
        vBox.setPadding(new Insets(50));
        vBox.setSpacing(70);
        Scene scene = new Scene(vBox, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
