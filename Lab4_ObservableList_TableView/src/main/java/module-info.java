
module com.example.lab4_observablelist_tableview {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.lab4_observablelist_tableview to javafx.fxml;
    opens com.example.lab4_observablelist_tableview.tutorial to javafx.fxml;
    opens com.example.lab4_observablelist_tableview.studentvariant to javafx.fxml;

    exports com.example.lab4_observablelist_tableview;
    exports com.example.lab4_observablelist_tableview.tutorial;
    exports com.example.lab4_observablelist_tableview.studentvariant;
}
