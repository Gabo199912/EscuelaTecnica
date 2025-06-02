package org.escuela.escuelacompleto.Controlador;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.SplitMenuButton;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class administradorControlador implements Initializable {


    @FXML
    private DatePicker fechaInicio, fechaFinal;

    @FXML
    private SplitMenuButton splitUsuarios;


    @FXML
    public void opcionAdministrador(){
        splitUsuarios.setText("administrador");
    }

    @FXML
    public void opcionAlumno(){
        splitUsuarios.setText("alumno");
    }

    @FXML
    public void opcionMaestro(){
        splitUsuarios.setText("maestro");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        seteoFechas();
        setearTamañoSplit();
    }

    @FXML
    public void seteoFechas(){
        LocalDate fechaActual = LocalDate.now();
        fechaInicio.setValue(fechaActual);
        fechaFinal.setValue(fechaActual);
    }

    @FXML
    public void setearTamañoSplit(){
        splitUsuarios.setPrefSize(140, 20);
    }
}
