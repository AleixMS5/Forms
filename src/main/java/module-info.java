module com.example.forms {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.forms to javafx.fxml;
    exports com.example.forms;
}