package UI;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChoiceBoxTest extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        Label label = new Label("Salam");
        String[] languages = {"Persian","Deutsch","English"};
        String[] values = {"Salam","Hallo","Hello"};
        choiceBox.setValue("Persian");
        choiceBox.setItems(FXCollections.observableArrayList(languages));

        choiceBox.getSelectionModel().selectedIndexProperty().addListener((observableValue, number, index) -> {
            label.setText(values[index.intValue()]);
        });


      //  String s = choiceBox.getValue();
     //   choiceBox.setValue("One");

//        choiceBox.show();
//        choiceBox.hide();
        VBox vBox = new VBox();
        vBox.getChildren().addAll(choiceBox,label);
        vBox.setPadding(new Insets(50));
        vBox.setSpacing(70);
        Scene scene = new Scene(vBox, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
