
package com.example.lab3_javafx_mvc.controller;

import com.example.lab3_javafx_mvc.model.Student;
import com.example.lab3_javafx_mvc.model.StudentGroup;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class StudentInfoController {

    @FXML
    private TableView<Student> studentTable;

    @FXML
    private TableColumn<Student, String> lastNameColumn;

    @FXML
    private TableColumn<Student, String> firstNameColumn;

    @FXML
    private Label groupNameLabel;

    @FXML
    private Label facultyLabel;

    @FXML
    private Label courseLabel;

    @FXML
    private Label studyFormLabel;

    @FXML
    private Label lastNameLabel;

    @FXML
    private Label firstNameLabel;

    @FXML
    private Label middleNameLabel;

    @FXML
    private Label birthDateLabel;

    @FXML
    private Label phoneLabel;

    @FXML
    private Label emailLabel;

    private StudentGroup group;

    @FXML
    public void initialize() {
        // Отображение фамилии в первой колонке
        lastNameColumn.setCellValueFactory(cellData ->
                new SimpleStringProperty(
                        cellData.getValue().getLastName()
                )
        );

        // Отображение имени во второй колонке
        firstNameColumn.setCellValueFactory(cellData ->
                new SimpleStringProperty(
                        cellData.getValue().getFirstName()
                )
        );

        // Обновление информации при выборе студента
        studentTable.getSelectionModel()
                .selectedItemProperty()
                .addListener((observable, oldValue, newValue) ->
                        showStudentDetails(newValue)
                );
    }

    public void setGroup(StudentGroup group) {
        this.group = group;

        groupNameLabel.setText(group.getGroupName());
        facultyLabel.setText(group.getFaculty());
        courseLabel.setText(String.valueOf(group.getCourse()));
        studyFormLabel.setText(group.getStudyForm());

        studentTable.getItems().setAll(group.getStudents());

        // Сразу выбираем первого студента,
        // чтобы его данные отображались справа
        if (!studentTable.getItems().isEmpty()) {
            studentTable.getSelectionModel().selectFirst();
        }
    }

    private void showStudentDetails(Student student) {
        if (student == null) {
            lastNameLabel.setText("");
            firstNameLabel.setText("");
            middleNameLabel.setText("");
            birthDateLabel.setText("");
            phoneLabel.setText("");
            emailLabel.setText("");
            return;
        }

        lastNameLabel.setText(student.getLastName());
        firstNameLabel.setText(student.getFirstName());
        middleNameLabel.setText(student.getMiddleName());
        birthDateLabel.setText(student.getBirthDate());
        phoneLabel.setText(student.getPhone());
        emailLabel.setText(student.getEmail());
    }
}
