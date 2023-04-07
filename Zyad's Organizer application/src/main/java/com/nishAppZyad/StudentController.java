package com.nishAppZyad;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.Locale;

public class StudentController extends PersonController implements Multi {

    @FXML
    TableView<Student> tableStudent;
    @FXML
    TableColumn<Student, String> columnName = new TableColumn<>();
    @FXML
    TableColumn<Student,String> columnEmail = new TableColumn<>();
    @FXML
    TableColumn<Student,String> columnCity = new TableColumn<>();
    @FXML
    TableColumn<Student,Integer> columnNumber = new TableColumn<>();
    @FXML
    TableColumn<Student,String> columnDate = new TableColumn<>();

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
        getItem();
        clear();

    }

    public void getItem(){
        tableStudent.setOnMouseClicked(mouseEvent -> {
            name.setText(tableStudent.getSelectionModel().getSelectedItem().getName());
            number.setText(String.valueOf(tableStudent.getSelectionModel().getSelectedItem().getNumber()));
            date.setValue(LocalDate.parse((tableStudent.getSelectionModel().getSelectedItem().getDate())));
            city.setValue(tableStudent.getSelectionModel().getSelectedItem().getCity());
            email.setText(tableStudent.getSelectionModel().getSelectedItem().getEmail());
        });
    }

    @FXML
    public void saveData(){
        int studentId=Integer.parseInt(number.getText());
        Student student = new Student(name.getText(),email.getText(),city.getSelectionModel().getSelectedItem(),date.getValue().toString(),studentId);
        tableStudent.getItems().add(student);
    }

}


