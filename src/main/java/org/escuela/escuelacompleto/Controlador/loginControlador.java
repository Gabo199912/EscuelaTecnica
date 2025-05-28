package org.escuela.escuelacompleto.Controlador;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import javax.swing.*;

public class loginControlador {

    @FXML
    private Button btnLogin;

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtContrasenia;

    @FXML
    private void verificacionContrasenia(){
        String usuario = txtUsuario.getText();
        String contrasenia = txtContrasenia.getText();

        JOptionPane.showMessageDialog(null, usuario + " " + contrasenia);
    }


}
