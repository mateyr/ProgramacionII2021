/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DaoImplementation.JsonVehicleDaoImpl;
import Panel.PnlVehicleView;
import Pojo.Vehicle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author MateyR
 */
public class PnlVehicleViewController {
    
   private PnlVehicleView pnlVehicleView;
   private List<Vehicle> data =  new ArrayList<>();
  String[] ColumnsNames = {"StockNumber","Year","Make","Model","Style","Vin","ExteriorColor","InteriorColor","Miles","Price","Transmission","Enigne","Image","Status"};
   private JsonVehicleDaoImpl jvdo;
   private DefaultTableModel dtm = new DefaultTableModel();
   
    
    
   public PnlVehicleViewController(PnlVehicleView pnlVehicleView) throws FileNotFoundException, IOException {
      
     this.pnlVehicleView = pnlVehicleView;
    
     
      jvdo = new JsonVehicleDaoImpl();
                 
      data = (List<Vehicle>) jvdo.getAll();
  
     
     
     initComponents();
         

    }
    
   public void initComponents() throws FileNotFoundException, IOException{
        
        Object[] datatable = new Object[15];
       
       
        for (int i = 0; i < ColumnsNames.length; i++) {
            
            dtm.addColumn(ColumnsNames[i]);
            
        }
        
         for(int i=0; i<data.size(); i++){
                             
         datatable[0] = data.get(i).getStockNumber();
         datatable[1] = data.get(i).getYear();
         datatable[2] = data.get(i).getMake();
         datatable[3] = data.get(i).getModel();
         datatable[4] = data.get(i).getStyle();
         datatable[5] = data.get(i).getVin();
         datatable[6] = data.get(i).getExteriorColor();
         datatable[7] = data.get(i).getInteriorColor();
         datatable[8] = data.get(i).getMiles();
         datatable[9] = data.get(i).getPrice();
         datatable[10] = data.get(i).getTransmission();
         datatable[11] = data.get(i).getEngine();
         datatable[13] = data.get(i).getImage();
         datatable[14] = data.get(i).getStatus();
         
              dtm.addRow(datatable);
        
        }
         
       pnlVehicleView.getTbVehicles().setModel(dtm);
       
       pnlVehicleView.getTxtSearch().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
               String text = pnlVehicleView.getTxtSearch().getText();
               Filter(text);
            }
        });
       
     }
   
    
    public void Filter(String text){
       TableRowSorter<DefaultTableModel> tbSorter = new TableRowSorter<DefaultTableModel>((DefaultTableModel) pnlVehicleView.getTbVehicles().getModel());
        
        pnlVehicleView.getTbVehicles().setRowSorter(tbSorter);
        
        tbSorter.setRowFilter(RowFilter.regexFilter(text));
    }
    
}

                    
