package Layout;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneTest extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane gridPane = new GridPane();

        Label labelWelcome = new Label("Welcome");
        Label labelUsername = new Label("Username :");
        Label labelPassword = new Label("Password :");

        TextField textFieldUsername = new TextField();
        TextField textFieldPassword = new TextField();

        Button btnLogin = new Button("Login");

        gridPane.add(labelWelcome,1,0);

        gridPane.add(labelUsername,0,1);
        gridPane.add(textFieldUsername,1,1);

        gridPane.add(labelPassword,0,2);
        gridPane.add(textFieldPassword,1,2);

        gridPane.add(btnLogin,1,3);

        //gridPane.addRow(1,button2,button3,button4);
        //gridPane.addColumn(1,button2,button3,button4);
        gridPane.setPadding(new Insets(20));

        gridPane.setVgap(5);
        gridPane.setHgap(5);

        gridPane.getColumnConstraints().add(new ColumnConstraints(100));
        gridPane.getColumnConstraints().add(new ColumnConstraints(150));

        GridPane.setHalignment(btnLogin, HPos.RIGHT);

        GridPane.setHalignment(labelUsername, HPos.RIGHT);
        GridPane.setHalignment(labelPassword, HPos.RIGHT);

        gridPane.setAlignment(Pos.CENTER);

        btnLogin.setOnAction(actionEvent -> {
            if (textFieldUsername.getText().equals("Admin") && textFieldPassword.getText().equals("1234"))
                System.out.println("Login");
        });

 //       gridPane.setGridLinesVisible(true);

        Scene scene = new Scene(gridPane, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
