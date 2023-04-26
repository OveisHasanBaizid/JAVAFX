package UI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBoxTest extends Application implements EventHandler{
    public static void main(String[] args) {
        launch(args);
    }
    int total =0;
    Label label;
    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();


//        checkBox.setIndeterminate(true);
//        checkBox.setAllowIndeterminate(true);
//        checkBox.setOnAction(actionEvent -> {
//            System.out.println(checkBox.isSelected());
//        });
        CheckBox checkBox_drink = new CheckBox("Drink 3$");
        CheckBox checkBox_salad = new CheckBox("Salad 2$");
        CheckBox checkBox_dessert = new CheckBox("Dessert 5$");
        checkBox_drink.setOnAction(this);
        checkBox_salad.setOnAction(this);
        checkBox_dessert.setOnAction(this);

        label = new Label("Total : 0$");
        vBox.getChildren().addAll(checkBox_drink, checkBox_salad ,checkBox_dessert , label );
        vBox.setPadding(new Insets(50));
        vBox.setSpacing(20);
        Scene scene = new Scene(vBox, 400, 400);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void handle(Event event) {
        CheckBox checkBox = (CheckBox) event.getSource();
        if (checkBox.getText().equals("Drink 3$"))
            total+=checkBox.isSelected()?3:-3;
        else if (checkBox.getText().equals("Salad 2$"))
            total+=checkBox.isSelected()?2:-2;
        else
            total+=checkBox.isSelected()?5:-5;
        label.setText("Total : "+total+"$");
    }
}
