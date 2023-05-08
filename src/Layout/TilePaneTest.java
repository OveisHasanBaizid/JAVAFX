package Layout;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class TilePaneTest extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        TilePane tilePane = new TilePane();
        tilePane.setOrientation(Orientation.VERTICAL);
        tilePane.setVgap(20);
        tilePane.setHgap(20);
        tilePane.setPrefRows(5);

    //    tilePane.setAlignment(Pos.CENTER);
        tilePane.getChildren().add(new Button("Button 1"));
        tilePane.getChildren().add(new Button("Button 2"));
        tilePane.getChildren().add(new Button("Button 3"));
        tilePane.getChildren().add(new Button("Button 4"));
        tilePane.getChildren().add(new Button("Button 5"));
        tilePane.getChildren().add(new Button("Button 6"));
        tilePane.getChildren().add(new Button("Button 7"));
        tilePane.getChildren().add(new Button("Button 8"));
        tilePane.getChildren().add(new Button("Button 9"));
        tilePane.getChildren().add(new Button("Button 10"));
//        tilePane.setPrefTileWidth(200);
//        tilePane.setPrefTileHeight(50);
//        tilePane.setTileAlignment(Pos.TOP_LEFT);

        Group group = new Group();
        group.getChildren().add(tilePane);

        Scene scene = new Scene(group, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
