package Event;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class ScrollEvent extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
//        ScrollPane scrollPane = new ScrollPane();
//        scrollPane.setMaxSize(200,200);
//        ImageView imageView = new ImageView(new Image(new FileInputStream("Images\\JavaPro.jpg")));
//        imageView.setFitHeight(400);
//        imageView.setFitWidth(800);

//        scrollPane.setOnScrollStarted(new EventHandler<javafx.scene.input.ScrollEvent>() {
//            @Override
//            public void handle(javafx.scene.input.ScrollEvent scrollEvent) {
//                System.out.println("Start");
//            }
//        });
//        scrollPane.setOnScrollFinished(new EventHandler<javafx.scene.input.ScrollEvent>() {
//            @Override
//            public void handle(javafx.scene.input.ScrollEvent scrollEvent) {
//                System.out.println("Finished");
//            }
//        });
//        scrollPane.setOnScroll(scrollEvent -> {
//            System.out.println(scrollEvent.getTouchCount());
//        });
//        scrollPane.setContent(imageView);
        StackPane stackPane = new StackPane();
        Rectangle rectangle = new Rectangle(100,100, Color.BLUEVIOLET);
        stackPane.getChildren().add(rectangle);

        rectangle.setOnScroll(scrollEvent -> {
            double totalDelta = scrollEvent.getDeltaY();
            if (totalDelta<0){
                rectangle.setHeight(rectangle.getHeight()-10);
                rectangle.setWidth(rectangle.getWidth()-10);
            }else{
                rectangle.setHeight(rectangle.getHeight()+10);
                rectangle.setWidth(rectangle.getWidth()+10);
            }
        });

        Scene scene = new Scene(stackPane, 500, 500);
        stage.setScene(scene);
        stage.show();
    }
}
