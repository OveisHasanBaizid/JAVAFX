package UI;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Test extends Application {
    public static void main(String[] args) {
       launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group group = new Group();
        TilePane tilePane = new TilePane();
        tilePane.setPrefRows(1);
        tilePane.setPrefTileWidth(100);
        tilePane.setPrefTileHeight(100);
        tilePane.setTileAlignment(Pos.TOP_LEFT);
        tilePane.getChildren().addAll( new Button("SunDay"),
                new Button("MonDay"),
                new Button("TuesDay"),
                new Button("WendsDay"),
                new Button("ThursDay"),
                new Button("FriDay"),
                new Button("Saturday"));
        tilePane.setOrientation(Orientation.VERTICAL);
        tilePane.setVgap(30);
        group.getChildren().add(tilePane);
        Scene scene = new Scene(group, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
