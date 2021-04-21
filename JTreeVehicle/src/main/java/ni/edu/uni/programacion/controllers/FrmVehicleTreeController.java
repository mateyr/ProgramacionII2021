/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion.controllers;

import View.FrmVehicleTree;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import ni.edu.uni.programacion.backend.dao.implementation.JsonVehicleDaoImpl;
import ni.edu.uni.programacion.backend.pojo.Vehicle;
import ni.edu.uni.programacion.views.panels.PnlVehicle;


/**
 *
 * @author MateyR
 */
public class FrmVehicleTreeController {
    
    private FrmVehicleTree frmVehicleTree;
    private DefaultTreeModel VehicleModel;
    private DefaultMutableTreeNode root;
    private JsonVehicleDaoImpl jvdo;
    private List<Vehicle> vehicles;
    private PnlVehicle pnlVehicletTree;   //Se Debio Haber Implementado Otro panel este no es Correcto
    private PnlVehicleController pnlVehicleController;
     
    
    public FrmVehicleTreeController(FrmVehicleTree frmVehicleTree) throws IOException {
        this.frmVehicleTree = frmVehicleTree;
        initComponet();
    }
    
    
    public void initComponet() throws IOException{
        
        pnlVehicletTree = new PnlVehicle();
        pnlVehicleController = new PnlVehicleController(pnlVehicletTree);
        
               
        root = new DefaultMutableTreeNode("Vehicles",true);
        VehicleModel = new DefaultTreeModel(root);
        frmVehicleTree.getJTreeVehicles().setModel(VehicleModel);
        
        jvdo = new JsonVehicleDaoImpl();
        vehicles = jvdo.getAll().stream().collect(Collectors.toList());
       
        loadTreeVehicle();
        
        frmVehicleTree.getBtnView().addActionListener((ActionEvent evt)->{
            btnViewActionPerformed(evt);
        });
        
       frmVehicleTree.getJTreeVehicles().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                treeVehicleMouseListener(e);
            }
       
       
       });
        
    }
    
    
    public void loadTreeVehicle() throws FileNotFoundException, IOException{
       
        DefaultMutableTreeNode pontiac = new DefaultMutableTreeNode("Pontiac");
        DefaultMutableTreeNode chevrolet = new DefaultMutableTreeNode("Chevrolet");
        DefaultMutableTreeNode saab = new DefaultMutableTreeNode("Saab");
        DefaultMutableTreeNode mini = new DefaultMutableTreeNode("MINI");
        DefaultMutableTreeNode mercury = new DefaultMutableTreeNode("MercurY");
        DefaultMutableTreeNode dodge = new DefaultMutableTreeNode("Dodge");
        DefaultMutableTreeNode gmc = new DefaultMutableTreeNode("GMC");
        DefaultMutableTreeNode ford = new DefaultMutableTreeNode("Ford");
        DefaultMutableTreeNode jaguar = new DefaultMutableTreeNode("Jaguar");
        DefaultMutableTreeNode hyundai = new DefaultMutableTreeNode("Hyundai");
        DefaultMutableTreeNode bmw = new DefaultMutableTreeNode("BMW");
        DefaultMutableTreeNode mazda = new DefaultMutableTreeNode("Mazda");
        DefaultMutableTreeNode ferrari = new DefaultMutableTreeNode("Ferrari");
        DefaultMutableTreeNode toyota = new DefaultMutableTreeNode("Toyota");
        DefaultMutableTreeNode saturn = new DefaultMutableTreeNode("Saturn");
        DefaultMutableTreeNode mitsubishi = new DefaultMutableTreeNode("Mitsubishi");
        
        VehicleModel.insertNodeInto(pontiac, root, 0);
        VehicleModel.insertNodeInto(chevrolet, root, 1);
        VehicleModel.insertNodeInto(saab, root, 2);
        VehicleModel.insertNodeInto(mini, root, 3);
        VehicleModel.insertNodeInto(mercury, root, 4);
        VehicleModel.insertNodeInto(dodge, root, 5);
        VehicleModel.insertNodeInto(gmc, root, 6);
        VehicleModel.insertNodeInto(ford, root, 7);
        VehicleModel.insertNodeInto(jaguar, root, 8);
        VehicleModel.insertNodeInto(hyundai, root, 9);
        VehicleModel.insertNodeInto(bmw, root, 10);
        VehicleModel.insertNodeInto(mazda, root, 11);
        VehicleModel.insertNodeInto(ferrari, root, 12);
        VehicleModel.insertNodeInto(toyota, root, 13);
        VehicleModel.insertNodeInto(saturn, root, 14);
        VehicleModel.insertNodeInto(mitsubishi, root, 15);
        
        //Esto de aqui no es generico esta mal hecho
       
        for (int i = 0; i < vehicles.size(); i++) {
            
            String temp = vehicles.get(i).getMake();

            
            switch(temp){
                case "Pontiac": pontiac.insert(new DefaultMutableTreeNode(vehicles.get(i).getStockNumber()),pontiac.getChildCount()); break;
                case "Chevrolet": chevrolet.insert(new DefaultMutableTreeNode(vehicles.get(i).getStockNumber()),chevrolet.getChildCount()); break;
                case "Saab": saab.insert(new DefaultMutableTreeNode(vehicles.get(i).getStockNumber()),saab.getChildCount()); break;
                case "MINI": mini.insert(new DefaultMutableTreeNode(vehicles.get(i).getStockNumber()),mini.getChildCount()); break;
                case "Mercury": mercury.insert(new DefaultMutableTreeNode(vehicles.get(i).getStockNumber()),mercury.getChildCount()); break;
                case "Dodge": dodge.insert(new DefaultMutableTreeNode(vehicles.get(i).getStockNumber()),dodge.getChildCount()); break;
                case "GMC": gmc.insert(new DefaultMutableTreeNode(vehicles.get(i).getStockNumber()),gmc.getChildCount()); break;
                case "Ford": ford.insert(new DefaultMutableTreeNode(vehicles.get(i).getStockNumber()),ford.getChildCount()); break;
                case "Jaguar": jaguar.insert(new DefaultMutableTreeNode(vehicles.get(i).getStockNumber()),jaguar.getChildCount()); break;
                case "Hyundai": hyundai.insert(new DefaultMutableTreeNode(vehicles.get(i).getStockNumber()),hyundai.getChildCount()); break;
                case "BMW": bmw.insert(new DefaultMutableTreeNode(vehicles.get(i).getStockNumber()),bmw.getChildCount()); break;
                case "Mazda": mazda.insert(new DefaultMutableTreeNode(vehicles.get(i).getStockNumber()),mazda.getChildCount()); break;
                case "Ferrari": ferrari.insert(new DefaultMutableTreeNode(vehicles.get(i).getStockNumber()),ferrari.getChildCount()); break;
                case "Toyota": toyota.insert(new DefaultMutableTreeNode(vehicles.get(i).getStockNumber()),toyota.getChildCount()); break;
                case "Saturn": saturn.insert(new DefaultMutableTreeNode(vehicles.get(i).getStockNumber()),saturn.getChildCount()); break;
                case "Mitsubishi": mitsubishi.insert(new DefaultMutableTreeNode(vehicles.get(i).getStockNumber()),mitsubishi.getChildCount()); break;
                
               
            }
            
            
        }
      
             
    }
    
    
    public void btnAddActionPerformed(ActionEvent evt) throws FileNotFoundException, IOException{

    }
    @SuppressWarnings("empty-statement")
    public void btnViewActionPerformed(ActionEvent evt){   // This Method is still pending
    
     TreePath treeSelected = frmVehicleTree.getJTreeVehicles().getSelectionPath();
     
     if(treeSelected == null){
         return;
     }
     
     String temp = treeSelected.getLastPathComponent().toString();
     
     if(isNumeric(temp) == false){JOptionPane.showMessageDialog(null, "Wey Estas selecionando un Carpeta no un archivo");}
     
     if(isNumeric(temp) == true)
     {
         ShowPnlVehicle(temp);
 
     }
        
    
    }
     

    
    private static boolean isNumeric(String cadena){
	try 
        {
          Integer.parseInt(cadena);
          return true;
	} catch (NumberFormatException nfe){
	   return false;
        }
    }
    
    
    public void treeVehicleMouseListener(MouseEvent evt){
     
     if(evt.getButton() == MouseEvent.BUTTON3){
         TreePath treePath = frmVehicleTree.getJTreeVehicles().getPathForLocation(evt.getX(),evt.getY() );
         
         if(treePath == null){
             return;
         }
         
         String temp = treePath.getLastPathComponent().toString();
         if(isNumeric(temp) == false){JOptionPane.showMessageDialog(null, "Wey Estas selecionando un Carpeta no un archivo");}
         
         if(isNumeric(temp) == true)
        {
            ShowPnlVehicle(temp);
        }
         
    }
   
        
    }
    
    public void ShowPnlVehicle(String temp){
        for (int i = 0; i < vehicles.size(); i++) {
             if(vehicles.get(i).getStockNumber() == Integer.parseInt(temp)){
                 pnlVehicletTree.getTxtStock().setText(temp);
                 pnlVehicletTree.getSpnYear().setValue(vehicles.get(i).getYear());
                 pnlVehicletTree.getCmbMake().setSelectedItem(vehicles.get(i).getMake().toString());
                 pnlVehicletTree.getCmbModel().setSelectedItem(vehicles.get(i).getModel().toString().trim());
                 pnlVehicletTree.getTxtStyle().setText(vehicles.get(i).getStyle().toString().trim());
                 pnlVehicletTree.getFmtVin().setValue(vehicles.get(i).getVin().trim());
                 pnlVehicletTree.getCmbEColor().setSelectedItem(vehicles.get(i).getExteriorColor().toString().trim());
                 pnlVehicletTree.getCmbIColor().setSelectedItem(vehicles.get(i).getInteriorColor().toString().trim());
                 
                  Integer miles = Integer.parseInt(vehicles.get(i).getMiles().toString());
                  pnlVehicletTree.getSpnMiles().setValue(miles);
                 
                  pnlVehicletTree.getSpnPrice().setValue(vehicles.get(i).getPrice());
                  
             
                 if(vehicles.get(i).getTransmission().toString() == "AUTOMATIC"){pnlVehicletTree.getRbtnAut().setSelected(true);};
                 if(vehicles.get(i).getTransmission().toString() == "MANUAL"){pnlVehicletTree.getRbtnAut().setSelected(true);};
                pnlVehicletTree.getTxtEngine().setText(vehicles.get(i).getEngine().toString().trim());
                pnlVehicletTree.getTxtImage().setText(vehicles.get(i).getImage().toString().trim());
                pnlVehicletTree.getCmbStatus().setSelectedItem(vehicles.get(i).getStatus().toString().trim());
               
             }
             
             frmVehicleTree.getPnlContent().add(pnlVehicletTree);
             frmVehicleTree.getPnlContent().repaint();
        }
    }
  
    
}


