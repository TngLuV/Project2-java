module com.example.smartbook {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.sql;

    opens com.example.smartbook to javafx.fxml;
    exports com.example.smartbook;
    exports com.example.smartbook.book;
    opens com.example.smartbook.book to javafx.fxml;
    exports com.example.smartbook.people;
    opens com.example.smartbook.people to javafx.fxml;
}