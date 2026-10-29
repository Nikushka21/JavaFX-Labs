
package com.example.lab3_javafx_mvc;

import com.example.lab3_javafx_mvc.controller.StudentInfoController;
import com.example.lab3_javafx_mvc.model.Student;
import com.example.lab3_javafx_mvc.model.StudentGroup;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StudentInfoApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(
                StudentInfoApplication.class.getResource(
                        "/com/example/lab3_javafx_mvc/view/student-info.fxml"
                )
        );

        Scene scene = new Scene(loader.load());

        // Создаём студенческую группу
        StudentGroup group = new StudentGroup(
                "ИСТ-331",
                "КТ и ИБ",
                3,
                "Очная"
        );

        // Добавляем студентов в группу
        group.addStudent(new Student(
                "Иванова",
                "Анна",
                "Сергеевна",
                "12.05.2003",
                "+7 900 123-45-67",
                "anna@example.com"
        ));

        group.addStudent(new Student(
                "Петров",
                "Иван",
                "Александрович",
                "20.08.2002",
                "+7 900 234-56-78",
                "ivan@example.com"
        ));

        group.addStudent(new Student(
                "Смирнова",
                "Мария",
                "Алексеевна",
                "15.03.2003",
                "+7 900 345-67-89",
                "maria@example.com"
        ));

        // Передаём группу контроллеру
        StudentInfoController controller = loader.getController();
        controller.setGroup(group);

        stage.setTitle("Студенческая группа и студент");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
