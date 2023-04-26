package UI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class FileChooserTest extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();

        Button button = new Button("Add");
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Chooser");
        fileChooser.setInitialDirectory(new File("C:\\Users\\Oveis\\IdeaProjects\\JAVAFX"));
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("File images","*.jpg","*.png")
        ,new FileChooser.ExtensionFilter("File Doc","*.iml","*.java"));

        button.setOnAction(actionEvent -> {
            File file = fileChooser.showOpenDialog(stage);
            if (file!=null)
                System.out.println(file.getAbsolutePath());
        });
        vBox.getChildren().add(button);
        vBox.setPadding(new Insets(20));
        vBox.setSpacing(20);
        Scene scene = new Scene(vBox, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
