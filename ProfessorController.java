package com.nishAppZyad;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.time.LocalDate;
import java.util.Locale;

public class  ProfessorController extends WorkersController implements Multi {

    @FXML
    TableView<Professor> tableProfessor;


    @FXML
    TableColumn<Professor, String> columnName = new TableColumn<>();
    @FXML
    TableColumn<Professor,String> columnEmail = new TableColumn<>();
    @FXML
    TableColumn<Professor,String> columnCity = new TableColumn<>();
    @FXML
    TableColumn<Professor,Integer> columnNumber = new TableColumn<>();
    @FXML
    TableColumn<Professor,String> columnDate = new TableColumn<>();
    @FXML
    TableColumn<Professor,String> columnSalary = new TableColumn<>();


    public void initialize(){

        Locale.setDefault(new Locale("tr"));

        city.getItems().addAll(
                "country1", "country2","country3"
        );


        columnName.setCellValueFactory(new PropertyValueFactory<>("name"));
        columnEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        columnCity.setCellValueFactory(new PropertyValueFactory<>("city"));
        columnNumber.setCellValueFactory(new PropertyValueFactory<>("number"));
        columnDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        columnSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        getItem();
        clear();

    }


    public void getItem(){
        tableProfessor.setOnMouseClicked(mouseEvent -> {
            name.setText(tableProfessor.getSelectionModel().getSelectedItem().getName());
            number.setText(String.valueOf(tableProfessor.getSelectionModel().getSelectedItem().getNumber()));
            date.setValue(LocalDate.parse((tableProfessor.getSelectionModel().getSelectedItem().getDate())));
            city.setValue(tableProfessor.getSelectionModel().getSelectedItem().getCity());
            email.setText(tableProfessor.getSelectionModel().getSelectedItem().getEmail());
            salary.setText(String.valueOf(tableProfessor.getSelectionModel().getSelectedItem().getSalary()));

        });


    }
    @FXML
    public void saveData(){
        int professorId=Integer.parseInt(number.getText());
        int professorSalary=Integer.parseInt(salary.getText());
        Professor professor = new  Professor(name.getText(),email.getText(),city.getSelectionModel().getSelectedItem(),date.getValue().toString(),professorId,professorSalary);
        tableProfessor.getItems().add(professor);
    }



}
