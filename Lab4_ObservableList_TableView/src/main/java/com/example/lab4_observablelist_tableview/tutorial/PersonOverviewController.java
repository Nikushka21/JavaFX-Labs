
package com.example.lab4_observablelist_tableview.tutorial;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PersonOverviewController {

    @FXML
    private TableView<Person> personTable;

    @FXML
    private TableColumn<Person, String> firstNameColumn;

    @FXML
    private TableColumn<Person, String> lastNameColumn;

    private final ObservableList<Person> personData =
            FXCollections.observableArrayList();

    public PersonOverviewController() {
        personData.addAll(
                new Person("Анна", "Иванова",
                        "Ленина, 10", "344000", "Ростов-на-Дону"),
                new Person("Иван", "Петров",
                        "Пушкина, 15", "344001", "Ростов-на-Дону"),
                new Person("Мария", "Смирнова",
                        "Садовая, 7", "344002", "Ростов-на-Дону"),
                new Person("Алексей", "Соколов",
                        "Мира, 21", "344003", "Ростов-на-Дону")
        );
    }

    @FXML
    private void initialize() {
        firstNameColumn.setCellValueFactory(
                cellData -> cellData.getValue().firstNameProperty()
        );

        lastNameColumn.setCellValueFactory(
                cellData -> cellData.getValue().lastNameProperty()
        );

        personTable.setItems(personData);

        // Равномерно распределяем ширину между столбцами.
        personTable.setColumnResizePolicy(
                TableView.CONSTRAINED_RESIZE_POLICY
        );
    }
}
