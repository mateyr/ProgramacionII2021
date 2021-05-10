/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mateyr.agendacontactos.Controller;

import com.mateyr.pojo.Producto;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Sistemas-07
 */
public class ProductoFXMLController implements Initializable {

    @FXML
    public TextField txtNombre;
    @FXML
    public TextField txtDescription;
    @FXML
    public TextField txtPrecio;
    @FXML
    public TextField txtImage;
    @FXML
    public Spinner<Integer> spnCantidad;
    @FXML
    public TableView<Producto> tblProductos;
    @FXML
    public TableColumn<Producto, String> tblcId;
    @FXML
    public TableColumn<Producto, String> tblcNombre;
    @FXML
    public TableColumn<Producto, String> tblcDescription;
    @FXML
    public TableColumn<Producto, String> tblcCantidad;
    @FXML
    public TableColumn<Producto, String> tblcPrecio;
    
    public ObservableList<Producto> productos;
    @FXML
    public Button btnAdd;
    @FXML
    public Button btnDelete;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        productos = FXCollections.observableArrayList();
        tblcId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tblcNombre.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
        tblcDescription.setCellValueFactory(new PropertyValueFactory<>("Description"));
        tblcCantidad.setCellValueFactory(new PropertyValueFactory<>("Cantidad"));
        tblcPrecio.setCellValueFactory(new PropertyValueFactory<>("Precio"));
        
        productos.add(new Producto(1, "Rodian", "Matey",12, 12,"Alguna"));
        spnCantidad.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0,100,1));
        tblProductos.setItems(productos);
    }    

    @FXML
    public void btnAdd(ActionEvent event) {
        //int id = productos.size() - 1;
        int id = 0;
        String name = txtNombre.getText();
        String description = txtDescription.getText();
        int cant = spnCantidad.getValue();
        float precio = Integer.parseInt(txtPrecio.getText());
        String imagen = txtImage.getText();
        Producto last = productos.get(productos.size()- 1);
        if(last == null){
            id = 1;
        }
        
        Producto p = new Producto(last.getId() + 1, name, description, cant, precio, imagen);
        
        productos.add(p);
        
       
    }

    @FXML
    public void btnDeleteAction(ActionEvent event) {
    }
    
}
