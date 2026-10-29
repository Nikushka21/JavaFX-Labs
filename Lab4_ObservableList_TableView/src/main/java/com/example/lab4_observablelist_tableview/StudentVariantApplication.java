
package com.example.lab4_observablelist_tableview;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentVariantApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                StudentVariantApplication.class.getResource(
                        "/com/example/lab4_observablelist_tableview/studentvariant/student-variant.fxml"
                )
        );

        Scene scene = new Scene(fxmlLoader.load());

        stage.setTitle("Лабораторная работа 4 — Студенческая группа и студент");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
