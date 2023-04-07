package com.nishAppZyad;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.Objects;

public class LoginController {
    public TextField userName;
    public PasswordField password;
    @FXML
       Button login;

     @FXML
     void go() throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("switchScene.fxml")));
        Stage window = (Stage) login.getScene().getWindow();
        window.setScene(new Scene(root,1400,750));
    }



}
