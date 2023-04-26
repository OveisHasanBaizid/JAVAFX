package UI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Pagination;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PaginationTest extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();

        String [] images ={"a.jpg","b.jpg","c.jpg"};
        Pagination pagination = new Pagination();
        pagination.setPageCount(3);
//        pagination.setCurrentPageIndex(2);
//        pagination.setMaxPageIndicatorCount(2);
        pagination.setPageFactory(new Callback<Integer, Node>() {
            @Override
            public Node call(Integer integer) {
                ImageView imageView;
                try {
                    imageView = new ImageView(new Image(new FileInputStream(images[integer])));
                    imageView.setFitWidth(100);
                    imageView.setFitHeight(100);
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
                return imageView;
            }
        });

        vBox.getChildren().add(pagination);
        vBox.setPadding(new Insets(20));
        vBox.setSpacing(20);
        Scene scene = new Scene(vBox, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
