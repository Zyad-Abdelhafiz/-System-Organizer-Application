package com.nishAppZyad;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class PersonController {

    @FXML
    Button logOut;

    @FXML
    TextField name, email,number;

    @FXML
    DatePicker date;

    @FXML
    ComboBox<String> city;

    // clear, exit, leave
    @FXML
    void clear (){
        name.clear();
        date.getEditor().clear();
        email.clear();
        number.clear();
        city.getSelectionModel().clearSelection();
    }

    @FXML
    void exit () {
        System.exit(0);
    }

    public void leave() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Stage window = (Stage) logOut.getScene().getWindow();
        window.setScene(new Scene(root,1400,750));
    }
}

