package com.nishAppZyad;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SwitchSceneController {

    @FXML
    Button student;
    @FXML
    Button professor;
    @FXML
    Button employee;


    public void student() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("student.fxml"));
        Stage window = (Stage) student.getScene().getWindow();
        window.setScene(new Scene(root,1400,750));
    }
    public void professor() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("professor.fxml"));
        Stage window = (Stage) professor.getScene().getWindow();
        window.setScene(new Scene(root,1400,750));
    }
    public void employee() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("employee.fxml"));
        Stage window = (Stage) employee.getScene().getWindow();
        window.setScene(new Scene(root,1400,750));
    }
}

