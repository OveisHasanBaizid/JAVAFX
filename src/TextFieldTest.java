import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class TextFieldTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("TextField Test");

        String strPass = "1234" , strUname = "JavaPro";
        TextField pass = new TextField();
        TextField uname = new TextField();

        Button button = new Button("Login");

        Label labelPass = new Label("Password");
        Label labelUname = new Label("UserName");

        GridPane layout = new GridPane();

        //textField.clear();
        button.setOnAction(actionEvent -> {
            if (pass.getText().equals(strPass) && uname.getText().equals(strUname))
                System.out.println("Login");
            else{
                System.out.println("Invalid");
            }
        });

//        textField.textProperty().addListener((observableValue, oldText, newText) -> {
//            label.setText(newText);
//        });

      //  textField.setEditable(false);

        layout.setPadding(new Insets(50));

        layout.add(labelUname,0,0);
        layout.add(uname,1,0);

        layout.add(labelPass,0,1);
        layout.add(pass,1,1);

        layout.add(button,1,2);

        Scene scene = new Scene(layout,400,400);
        stage.setScene(scene);
        stage.show();
    }
}
