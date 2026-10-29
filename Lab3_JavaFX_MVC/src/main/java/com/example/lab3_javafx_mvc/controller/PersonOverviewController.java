
package com.example.lab3_javafx_mvc.controller;

import com.example.lab3_javafx_mvc.model.AddressBookModel;
import com.example.lab3_javafx_mvc.model.Person;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PersonOverviewController {

    @FXML
    private TableView<Person> personTable;

    @FXML
    private TableColumn<Person, String> firstNameColumn;

    @FXML
    private TableColumn<Person, String> lastNameColumn;

    @FXML
    private Label firstNameLabel;

    @FXML
    private Label lastNameLabel;

    @FXML
    private Label streetLabel;

    @FXML
    private Label cityLabel;

    @FXML
    private Label postalCodeLabel;

    @FXML
    private Label birthdayLabel;

    private AddressBookModel model;

    @FXML
    public void initialize() {
        firstNameColumn.setCellValueFactory(
                cellData -> cellData.getValue().firstNameProperty()
        );

        lastNameColumn.setCellValueFactory(
                cellData -> cellData.getValue().lastNameProperty()
        );

        personTable.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) ->
                        showPersonDetails(newValue));
    }

    public void setModel(AddressBookModel model) {
        this.model = model;
        personTable.setItems(model.getPersonList());
    }

    private void showPersonDetails(Person person) {
        if (person == null) {
            firstNameLabel.setText("");
            lastNameLabel.setText("");
            streetLabel.setText("");
            cityLabel.setText("");
            postalCodeLabel.setText("");
            birthdayLabel.setText("");
        } else {
            firstNameLabel.setText(person.getFirstName());
            lastNameLabel.setText(person.getLastName());
            streetLabel.setText(person.getStreet());
            cityLabel.setText(person.getCity());
            postalCodeLabel.setText(person.getPostalCode());
            birthdayLabel.setText(person.getBirthday());
        }
    }

    @FXML
    private void handleDeletePerson() {
        Person selectedPerson =
                personTable.getSelectionModel().getSelectedItem();

        if (selectedPerson != null && model != null) {
            model.getPersonList().remove(selectedPerson);
        }
    }
}
