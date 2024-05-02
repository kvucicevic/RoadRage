module com.example.roadrage {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.roadrage to javafx.fxml;
    exports com.example.roadrage;
}