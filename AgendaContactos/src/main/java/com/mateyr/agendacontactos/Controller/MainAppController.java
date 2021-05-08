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
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author MateyR
 */
public class MainAppController implements Initializable {

    @FXML
    public BorderPane pnlBorderPane;
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        try {
            AnchorPane ContactOverview = (AnchorPane) App.loadFXML("ConctactosView");
            pnlBorderPane.setCenter(ContactOverview);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
            
    }    
    
}
