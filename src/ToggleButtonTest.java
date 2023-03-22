import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ToggleButtonTest extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        ToggleGroup group = new ToggleGroup();

        Label label = new Label("How well do you speak english?");

        ToggleButton toggleButtonHigh = new ToggleButton("High");
        toggleButtonHigh.setToggleGroup(group);

        ToggleButton toggleButtonMedium = new ToggleButton("Medium");
        toggleButtonMedium.setToggleGroup(group);

        ToggleButton toggleButtonLow = new ToggleButton("Low");
        toggleButtonLow.setToggleGroup(group);

        group.selectedToggleProperty().addListener((observableValue, oldToggle, newToggle) -> {
            ToggleButton b = (ToggleButton)newToggle;
            System.out.println(b.getText());
        });
        VBox vBox = new VBox();
        vBox.getChildren().addAll(label,toggleButtonHigh,toggleButtonMedium,toggleButtonLow);
        vBox.setPadding(new Insets(20));
        vBox.setSpacing(20);
        Scene scene = new Scene(vBox, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
