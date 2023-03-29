import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.util.StringConverter;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DatePickerTest extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        DatePicker datePicker = new DatePicker(LocalDate.now());

        datePicker.setShowWeekNumbers(true);

    //    datePicker.setValue(LocalDate.of(2022,12,23));

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//        datePicker.setOnAction(actionEvent -> {
//            datePicker.setConverter(new StringConverter<LocalDate>() {
//                @Override
//                public String toString(LocalDate localDate) {
//                    return datePicker.getValue().format(formatter);
//                }
//
//                @Override
//                public LocalDate fromString(String s) {
//                    return LocalDate.parse(s,formatter);
//                }
//            });
//            System.out.println(datePicker.getEditor().getText());
//        });
//
//
//        datePicker.setEditable(false);

       datePicker.setDayCellFactory(new Callback<DatePicker, DateCell>() {
           @Override
           public DateCell call(DatePicker datePicker) {
               return new DateCell(){
                   @Override
                   public void updateItem(LocalDate localDate, boolean b) {
                       super.updateItem(localDate, b);
                       if (localDate!=null && localDate.getMonth()== Month.MARCH && localDate.getDayOfMonth()==18){
                           setTooltip(new Tooltip("Happy birthday"));
                            setStyle("-fx-background-color: Red");
                       }
                   }
               };
           }
       });
        VBox vBox = new VBox();
        vBox.getChildren().add(datePicker);
        vBox.setPadding(new Insets(50));
        vBox.setSpacing(70);
        Scene scene = new Scene(vBox, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
