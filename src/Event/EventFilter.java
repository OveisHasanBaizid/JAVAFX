package Event;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.KeyEvent;
public class EventFilter extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();

        Button btn1 = new Button("Button1");
        Button btn2 = new Button("Button2");

        vBox.getChildren().addAll(btn1,btn2);

        EventHandler<KeyEvent> filter1 = new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                Button btn = (Button) event.getSource();
                System.out.println(btn.getText());
            }
        };
        btn1.addEventFilter(KeyEvent.KEY_TYPED ,filter1 );
        btn2.addEventFilter(KeyEvent.KEY_TYPED ,filter1 );


//        btn1.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//                System.out.println("Button");
//            }
//        });


        Scene scene = new Scene(vBox, 400, 400);
        scene.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("Scene");
                mouseEvent.consume();
            }
        });
        stage.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("Stage");
            }
        });
        stage.setScene(scene);
        stage.show();
    }
}
