import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.concurrent.atomic.AtomicInteger;
public class LabelTest extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Test Label");
        VBox vBox = new VBox();
        Label label = new Label();

     //   Font font = Font.font("Calibri", FontWeight.BOLD , 25);
     //   label.setFont(font);

//        FileInputStream stream = new FileInputStream("JavaPro.jpg");
//        Image image = new Image(stream);
//        ImageView imageView = new ImageView(image);
//        imageView.setFitWidth(200);
//        imageView.setFitHeight(100);
//        label.setGraphic(imageView);

        Button button = new Button("Click");

        AtomicInteger counter = new AtomicInteger();
        button.setOnAction(actionEvent -> {
            counter.getAndIncrement();
            label.setText(counter+"");
        });
        label.setText(counter+"");
        vBox.getChildren().addAll(label,button);
        vBox.setSpacing(20);

        vBox.setPadding(new Insets(50));
        Scene scene = new Scene(vBox,300,300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
