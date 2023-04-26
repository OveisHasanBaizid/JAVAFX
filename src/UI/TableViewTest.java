package UI;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicInteger;

public class TableViewTest extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();

        ObservableList<Person> observableList = FXCollections.observableArrayList(new Person("A","B",20));
        TableView<Person> tableView = new TableView<>();
        tableView.setItems(observableList);
        tableView.setEditable(true);

        TableColumn<Person , String> firstNameColumn = new TableColumn<>("FirstName");
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        firstNameColumn.setSortType(TableColumn.SortType.ASCENDING);
        firstNameColumn.setSortable(false);
        firstNameColumn.setEditable(true);

        firstNameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        firstNameColumn.setOnEditCommit(t -> {
            t.getTableView().getItems().get(t.getTablePosition().getRow()).setFirstName(t.getNewValue());
            for (Person p:observableList) {
                System.out.println(p.getFirstName());
            }
        });

        TableColumn<Person , String> lastNameColumn = new TableColumn<>("LastName");
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));

        TableColumn<Person , Integer> ageColumn = new TableColumn<>("Age");
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));

        tableView.getColumns().addAll(firstNameColumn,lastNameColumn,ageColumn);

        Button button = new Button("Button");
        AtomicInteger count = new AtomicInteger(1);
        button.setOnAction(actionEvent -> {
            observableList.add(new Person("A"+count,"B"+count,20+ count.get()));
            count.getAndIncrement();
        });
        vBox.getChildren().addAll(tableView,button);

        vBox.setPadding(new Insets(20));
        vBox.setSpacing(20);
        Scene scene = new Scene(vBox, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
