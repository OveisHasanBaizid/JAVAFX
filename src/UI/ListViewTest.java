package UI;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Callback;

public class ListViewTest extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();
        VBox vBox1 = new VBox();
        vBox1.getChildren().addAll(new Button("Button1") , new Button("Button2") );
       ObservableList<VBox> observableList = FXCollections.observableArrayList(vBox1);
   
        ListView<VBox> listView = new ListView<>();
        listView.setItems(observableList);

//        listView.setOrientation(Orientation.HORIZONTAL);
//        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
//
//        listView.getSelectionModel().selectedItemProperty().addListener((observableValue, s, t1) -> {
//            System.out.println(t1);
//        });

//        listView.setCellFactory(new Callback<ListView<String>, ListCell<String>>() {
//            @Override
//            public ListCell<String> call(ListView<String> stringListView) {
//                return new ListCell<>(){
//                    @Override
//                    protected void updateItem(String s, boolean b) {
//                        super.updateItem(s, b);
//                        if (s!=null){
//                            Rectangle rectangle = new Rectangle(100,20);
//                            rectangle.setFill(Color.BLUE);
//                            setGraphic(rectangle);
//                            setText(s);
//                        }
//                    }
//                };
//            }
//        });



        vBox.getChildren().add(listView);
        vBox.setPadding(new Insets(20));
        vBox.setSpacing(20);
        Scene scene = new Scene(vBox, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
