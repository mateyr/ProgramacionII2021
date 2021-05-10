/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mateyr.agendacontactos.Controller;

import com.mateyr.agendacontactos.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Sistemas-07
 */
public class MainTableFXMLController implements Initializable {

    @FXML
    public VBox vboxContent;
    @FXML
    public Button btnProducto;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    public void btnProductoAction(ActionEvent event) throws IOException {
        Parent parent =  App.loadFXML("ProductoFXML");
        vboxContent.getChildren().clear();
        vboxContent.getChildren().add(parent);
        
    }
    
}
