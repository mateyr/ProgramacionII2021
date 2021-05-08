/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mateyr.agendacontactos.Controller;

import com.mateyr.agendacontactos.models.Contacto;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.beans.property.ObjectProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MateyR
 */
public class NewContactoController implements Initializable {

    @FXML
    public Button btnAdd;
    @FXML
    public Button btnCancel;
    @FXML
    public TextField txtFirstName;
    @FXML
    public TextField txtLastName;
    @FXML
    public TextField txtCountry;
    @FXML
    public TextField txtAdress;
    @FXML
    public TextField txtPostalCode;
    @FXML
    public TextField txtBirthday;

    
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    public void btnAddAction(ActionEvent event) {
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String country = txtAdress.getText();
        String address = txtAdress.getText();
        String postalCode = txtPostalCode.getText();
        String birthday = txtBirthday.getText();
        ObjectProperty<LocalDate> bith = null;
        
        Contacto cont = new Contacto(firstName, lastName, address,Integer.parseInt(postalCode), country,bith);
        
        ConctactosViewController.contactos.add(cont);
        
        cleanFields();
        
    }

    @FXML
    public void btnCancelAction(ActionEvent event) {
       Stage stage = (Stage) this.btnCancel.getScene().getWindow();
       stage.close();
    }
    
    public void cleanFields(){
        txtFirstName.setText("");
        txtLastName.setText("");
        txtAdress.setText("");
        txtPostalCode.setText("");
        txtCountry.setText("");
        txtBirthday.setText("");  
    }
   
}
