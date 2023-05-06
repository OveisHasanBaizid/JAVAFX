package Layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;
import java.util.concurrent.atomic.AtomicInteger;

public class StackPaneTest extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        StackPane stackPane = new StackPane();

//        Rectangle rectangle1 = new Rectangle(200,200);
//        rectangle1.setFill(Color.BLUE);
//
//        Rectangle rectangle2 = new Rectangle(100,100);
//        rectangle2.setFill(Color.GREEN);
//
//        stackPane.getChildren().addAll(rectangle2,rectangle1);

//        stackPane.setAlignment(Pos.TOP_RIGHT);
//        StackPane.setMargin(rectangle1,new Insets(20));
//
//        rectangle1.setOnMouseClicked(mouseEvent -> {
//            stackPane.getChildren().remove(rectangle1);
//        });

        Paint[] paints = {Color.BLUE,Color.GREEN,Color.BLACK,Color.CORAL};
        AtomicInteger x = new AtomicInteger(300);
        AtomicInteger y = new AtomicInteger(300);
        AtomicInteger i= new AtomicInteger(0);
        stackPane.setOnMouseClicked(mouseEvent -> {
            if(i.get() <4) {
                stackPane.getChildren().add(new Rectangle(x.get(), y.get(), paints[i.getAndIncrement()]));
                x.addAndGet(-20);
                y.addAndGet(-20);
            }
        });

        Scene scene = new Scene(stackPane, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
