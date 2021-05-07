/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.conversionfx.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Sistemas-05
 */
public class CurrencyFXMLController implements Initializable {

    @FXML
    public ComboBox<String> cmbCurrency;
    @FXML
    public TextField txtValor;
    @FXML
    public TextField txtResultado;
    @FXML
    public Button btnConvertir;

    ObservableList<String> items = FXCollections.observableArrayList();

    public CurrencyFXMLController() {
        items.addAll("Cordoba","Dolares","Euros","Colones");
      
    }
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     //items.addAll("Cordoba","Dolares","Euros","Colones");
     cmbCurrency.setItems(items);
     
    }   

    @FXML
    public void btnConvertirAction(ActionEvent event) {
    }
    
}
