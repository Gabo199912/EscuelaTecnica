    module org.escuela.escuelacompleto {
        requires javafx.controls;
        requires javafx.fxml;
        requires javafx.web;

        requires org.controlsfx.controls;
        requires com.dlsc.formsfx;
        requires net.synedra.validatorfx;
        requires org.kordamp.ikonli.javafx;
        requires org.kordamp.bootstrapfx.core;
        requires eu.hansolo.tilesfx;
        requires javafx.graphics;
        requires java.desktop;

        opens org.escuela.escuelacompleto.Controlador to javafx.fxml;
        opens org.escuela.escuelacompleto to javafx.fxml;
        exports org.escuela.escuelacompleto;
    }