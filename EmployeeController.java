package com.nishAppZyad;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.time.LocalDate;
import java.util.Locale;

public class EmployeeController extends WorkersController implements Multi {


    @FXML
     TableView<Employee> tableEmployee;

    @FXML
     TableColumn<Employee, String> columnName = new TableColumn<>();
    @FXML
     TableColumn<Employee,String> columnEmail = new TableColumn<>();
    @FXML
     TableColumn<Employee,String> columnCity = new TableColumn<>();
    @FXML
     TableColumn<Employee,Integer> columnNumber = new TableColumn<>();
    @FXML
     TableColumn<Employee,String> columnDate = new TableColumn<>();
    @FXML
     TableColumn<Employee,Integer> columnSalary= new TableColumn<>();


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
        tableEmployee.setOnMouseClicked(mouseEvent -> {
            name.setText(tableEmployee.getSelectionModel().getSelectedItem().getName());
            number.setText(String.valueOf(tableEmployee.getSelectionModel().getSelectedItem().getNumber()));
            salary.setText(String.valueOf(tableEmployee.getSelectionModel().getSelectedItem().getSalary()));
            date.setValue(LocalDate.parse((tableEmployee.getSelectionModel().getSelectedItem().getDate())));
            city.setValue(tableEmployee.getSelectionModel().getSelectedItem().getCity());
            email.setText(tableEmployee.getSelectionModel().getSelectedItem().getEmail());
        });


    }

    @FXML
     public void saveData(){
        int employeeID=Integer.parseInt(number.getText());
        int employeeSalary=Integer.parseInt(salary.getText());
        Employee employee = new Employee(name.getText(),email.getText(),city.getSelectionModel().getSelectedItem(),date.getValue().toString(),employeeID,employeeSalary);
        tableEmployee.getItems().add(employee);
    }

}
