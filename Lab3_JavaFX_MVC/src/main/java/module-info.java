
module com.example.lab3_javafx_mvc {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.lab3_javafx_mvc to javafx.fxml;
    opens com.example.lab3_javafx_mvc.controller to javafx.fxml;

    exports com.example.lab3_javafx_mvc;
}
