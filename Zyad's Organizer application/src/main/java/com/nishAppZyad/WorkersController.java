package com.nishAppZyad;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class WorkersController extends PersonController {
    @FXML
    TextField salary;

    @Override
    @FXML
    public void clear (){
        name.clear();
        date.getEditor().clear();
        email.clear();
        number.clear();
        city.getSelectionModel().clearSelection();
        salary.clear();
    }


}
