package Layout;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TitledPaneTest extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        TitledPane titledPane = new TitledPane();
        titledPane.setContent(new Button("Button"));
        titledPane.setText("Title");
      //  titledPane.setAnimated(false);
      //  titledPane.setCollapsible(false);
     //   titledPane.setExpanded(false);
        titledPane.expandedProperty().addListener((observableValue, aBoolean, t1) -> {
            System.out.println(t1);
        });
        VBox vBox = new VBox();
        for (int i = 1; i <=5 ; i++) {
            vBox.getChildren().add(new Button("Button "+i));
        }
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(20);
        titledPane.setContent(vBox);

        Scene scene = new Scene(titledPane, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
