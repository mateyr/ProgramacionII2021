/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mateyr.agendacontactos.Controller;

import com.mateyr.agendacontactos.App;
import com.mateyr.agendacontactos.models.Contacto;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MateyR
 */
public class ConctactosViewController implements Initializable {

    @FXML
    public TableView<Contacto> tblContactos;
    @FXML
    public TableColumn<Contacto, String> columName;
    @FXML
    public TableColumn<Contacto, String> columnLastName;
    @FXML
    public Label lblFirstName;
    @FXML
    public Label lblLastName;
    @FXML
    public Label lbPostalCode;
    @FXML
    public Label lblAddress;
    @FXML
    public Label lblCountry;
    @FXML
    public Label lblBirthday;

    /**
     * Initializes the controller class.
     */
    
    public ObservableList<Contacto> contactos;
    @FXML
    public Button btnNew;
    
    @FXML
    public AnchorPane AnchorPane;
    
    
    public ConctactosViewController() {
     
    }    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
         
        contactos = FXCollections.observableArrayList();
        
        columName.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        columnLastName.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
        
    }

    @FXML
    public void tblContactosClicked(MouseEvent event) {
    
        Contacto cont = tblContactos.getSelectionModel().getSelectedItem();
        
        showPersonDetails(cont);
        
    }
    
    
    private void showPersonDetails(Contacto person) {
    if (person != null) {
        // Fill the labels with info from the person object.
        lblFirstName.setText(person.getFirstName());
        lblLastName.setText(person.getLastName());
        lblAddress.setText(person.getStreet().get());
        lbPostalCode.setText(Integer.toString(person.getPostalCode().get()));
        lblCountry.setText(person.getCity().get());

        // TODO: We need a way to convert the birthday into a String! 
        // birthdayLabel.setText(...);
    } else {
        // Person is null, remove all the text.
        lblFirstName.setText("");
        lblLastName.setText("");
        lblAddress.setText("");
        lbPostalCode.setText("");
        lblCountry.setText("");
        lblBirthday.setText("");
    }
 
}

    @FXML
    public void btnNewAction(ActionEvent event) throws IOException {
        nuevaVentana();
    }
    
    public void nuevaVentana() throws IOException {
        
        Stage stageSecundary = new Stage();   
        AnchorPane pane =  (AnchorPane) App.loadFXML("NewContacto");
        stageSecundary.setTitle("New Contact");
        stageSecundary.initModality(Modality.WINDOW_MODAL);
        stageSecundary.initOwner(((Stage) AnchorPane.getScene().getWindow()));
        Scene scene = new Scene(pane);

        stageSecundary.setScene(scene);
       
        stageSecundary.showAndWait();
    }

    
}
