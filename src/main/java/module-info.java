module com.rps.javafxrps {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.rps.javafxrps to javafx.fxml;
    exports com.rps.javafxrps;
}