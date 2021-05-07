/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.conversionfx.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import ni.edu.uni.fcys.programacion2.conversionfx.core.TemperatureConversion;

/**
 * FXML Controller class
 *
 * @author Sistemas-05
 */
public class TemperatureFXMLController implements Initializable {
    @FXML
    public TextField txtCelsius;
    @FXML
    public TextField txtFha;
    @FXML
    public Button btnCompute;
    @FXML
    public Button btnClean;
    @FXML
    public RadioButton rbtnCelsius;
    @FXML
    public RadioButton rbtnFha;
    @FXML
    public ToggleGroup temperature;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void btnComputeAction(){
        float value;
        if(rbtnCelsius.isSelected()){
            value = Float.parseFloat(txtCelsius.getText());            
            txtFha.setText(String.valueOf(TemperatureConversion.fromCToF(value)));
        }else if(rbtnFha.isSelected()){
            value = Float.parseFloat(txtFha.getText());            
            txtCelsius.setText(String.valueOf(TemperatureConversion.fromFToC(value)));
        }
    }
    
    @FXML
    public void btnCleanAction(){
         cleanTextFields();
    }

    @FXML
    public void rbtnCelsiusAction(ActionEvent event) {
        activateTextFields();
    }

    @FXML
    public void rbtnFhaAction(ActionEvent event) {
        activateTextFields();
    }
    
    private void activateTextFields(){
        if(rbtnCelsius.isSelected()){
            txtCelsius.setEditable(true);
            txtFha.setEditable(false);            
            txtCelsius.requestFocus();
        }else if(rbtnFha.isSelected()){
            txtCelsius.setEditable(false);
            txtFha.setEditable(true);            
            txtFha.requestFocus();
        }
        
        cleanTextFields();
    }

    private void cleanTextFields() {
        txtCelsius.setText("");
        txtFha.setText("");
    }
}
