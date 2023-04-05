package com.example.w23comp1008lhw9;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.ResourceBundle;

public class StudentViewController implements Initializable {

    @FXML
    private Label ageLabel;

    @FXML
    private Label firstNameLabel;

    @FXML
    private Label lastNameLabel;

    @FXML
    private ListView<Student> listView;

    @FXML
    private Label numStudentsLabel;

    @FXML
    void exportToCSV(ActionEvent event) {

        //any objects opened in the ( ) are automatically closed when complete
        try(
                Formatter formatter = new Formatter("students.csv");
        ){
            formatter.format("student num,first name,last name,age%n");
            for (Student student : listView.getItems())
            {
                formatter.format("%d,%s,%s,%d%n", student.getStudentNum(),
                                                student.getFirstName(),
                                                student.getLastName(),
                                                student.getAge());
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ArrayList<Student> students = DBUtility.getStudentsFromDB();

        listView.getItems().addAll(students);

        //add a listener for our ListView
        listView.getSelectionModel()
                .selectedItemProperty()
                .addListener((observable, oldValue, studentSelected) -> {
                    firstNameLabel.setText("First Name: "+studentSelected.getFirstName());
                    lastNameLabel.setText("Last Name: "+studentSelected.getLastName());
                    ageLabel.setText("Age: "+studentSelected.getAge());
                });
    }
}
