
package com.example.lab3_javafx_mvc;

import com.example.lab3_javafx_mvc.controller.PersonOverviewController;
import com.example.lab3_javafx_mvc.model.AddressBookModel;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(
                HelloApplication.class.getResource("view/person-overview.fxml")
        );

        Parent root = loader.load();

        PersonOverviewController controller = loader.getController();
        controller.setModel(new AddressBookModel());

        Scene scene = new Scene(root);

        stage.setTitle("Адресная книга");
        stage.setScene(scene);
        stage.show();
    }
}
