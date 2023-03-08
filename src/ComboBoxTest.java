import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ComboBoxTest extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {



//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("One"); strings.add("Two"); strings.add("Three"); strings.add("Four"); strings.add("Five");
//        comboBox.setItems(FXCollections.observableArrayList(strings));
//        comboBox.setValue("One");

//        comboBox.setVisibleRowCount(2);
//        comboBox.setEditable(true);

        ComboBox<String> fieldStudy = new ComboBox<>();
        ComboBox<String> subcategory = new ComboBox<>();

        Label  label1 = new Label("FieldStudy : ");
        Label  label2 = new Label("Subcategory : ");

        ArrayList<String> array1 = new ArrayList<>();
        array1.add("Medical"); array1.add("Computer Engineering");

        ArrayList<String> array2 = new ArrayList<>();
        array2.add("UI/UX"); array2.add("Programing"); array2.add("AI");

        ArrayList<String> array3 = new ArrayList<>();
        array3.add("General"); array3.add("Optometrist"); array3.add("Surgery");

        fieldStudy.setItems(FXCollections.observableArrayList(array1));
        fieldStudy.setOnAction(actionEvent -> {
            String s = fieldStudy.getValue();
            if (s.equals("Medical"))
                subcategory.setItems(FXCollections.observableArrayList(array3));
            else
                subcategory.setItems(FXCollections.observableArrayList(array2));
        });

//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("One"); strings.add("Two"); strings.add("Three"); strings.add("Four"); strings.add("Five");

        VBox vBox = new VBox();
        vBox.getChildren().addAll(label1,fieldStudy , label2 , subcategory );

        vBox.setPadding(new Insets(50));
        vBox.setSpacing(20);
        Scene scene = new Scene(vBox, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}