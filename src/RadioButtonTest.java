import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RadioButtonTest extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("RadioButton Test");


        ToggleGroup group = new ToggleGroup();

        TextField textField = new TextField();
        textField.setText("Question");
        textField.setEditable(false);

        RadioButton radioButton1 = new RadioButton("JavaPro1");
        RadioButton radioButton2 = new RadioButton("JavaPro2");
        RadioButton radioButton3 = new RadioButton("JavaPro3");
        RadioButton radioButton4 = new RadioButton("JavaPro4");

        radioButton1.setToggleGroup(group);
        radioButton2.setToggleGroup(group);
        radioButton3.setToggleGroup(group);
        radioButton4.setToggleGroup(group);

        Button button = new Button("Check");

        //radioButton.fire();

        button.setOnAction(actionEvent -> {
            RadioButton radioButton = (RadioButton)  group.getSelectedToggle();
            if (radioButton==null)
                System.out.println("Null");
            else if (radioButton.getText().equals("JavaPro3"))
                System.out.println("yes");
            else
                System.out.println("No");
        });

//        radioButton.setSelected(true);
//
//        radioButton.isSelected();

//        group.selectedToggleProperty().addListener((observableValue, oldRadioButton, newRadioButton) -> {
//            RadioButton rbOld = (RadioButton) oldRadioButton;
//            RadioButton rbNew = (RadioButton) newRadioButton;
//            System.out.println((rbOld == null ? "null" : rbOld.getText()) + " -> " + rbNew.getText());
//        });

        VBox vBox = new VBox();
        vBox.getChildren().addAll(textField,radioButton1, radioButton2, radioButton3, radioButton4, button);
        vBox.setPadding(new Insets(50));
        vBox.setSpacing(20);
        Scene scene = new Scene(vBox, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
