
package com.example.lab4_observablelist_tableview.studentvariant;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Label;

public class StudentVariantController {

    @FXML
    private Label groupNameLabel;

    @FXML
    private Label facultyLabel;

    @FXML
    private Label courseLabel;

    @FXML
    private TableView<Student> studentTable;

    @FXML
    private TableColumn<Student, String> lastNameColumn;

    @FXML
    private TableColumn<Student, String> firstNameColumn;

    @FXML
    private TableColumn<Student, String> middleNameColumn;

    @FXML
    private TableColumn<Student, String> specialtyColumn;

    private final StudentGroup studentGroup =
            new StudentGroup("ИСТ-331", "КТ и ИБ", "3");

    @FXML
    private void initialize() {
        groupNameLabel.setText("Группа: " + studentGroup.getGroupName());
        facultyLabel.setText("Факультет: " + studentGroup.getFaculty());
        courseLabel.setText("Курс: " + studentGroup.getCourse());

        lastNameColumn.setCellValueFactory(
                cellData -> cellData.getValue().lastNameProperty()
        );

        firstNameColumn.setCellValueFactory(
                cellData -> cellData.getValue().firstNameProperty()
        );

        middleNameColumn.setCellValueFactory(
                cellData -> cellData.getValue().middleNameProperty()
        );

        specialtyColumn.setCellValueFactory(
                cellData -> cellData.getValue().specialtyProperty()
        );

        studentTable.setItems(studentGroup.getStudents());

        studentTable.setColumnResizePolicy(
                TableView.CONSTRAINED_RESIZE_POLICY
        );
    }
}
