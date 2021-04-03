/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DaoImplementation.JsonVehicleDaoImpl;
import Pojo.Vehicle;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author MateyR Utilizando AbstractTableModel
 */
public class TableVehicleModel extends AbstractTableModel{
    
    private JsonVehicleDaoImpl jdvo;
    private List<Vehicle> data ;
    
    private String[] ColumnsNames = {"StockNumber","Year","Make","Model","Style","Vin","ExteriorColor","InteriorColor","Miles","Price","Transmission","Enigne","Image","Status"};
    
    public  TableVehicleModel() throws FileNotFoundException, IOException{
       jdvo = new JsonVehicleDaoImpl();
       
       data = (List<Vehicle>) jdvo.getAll();
       
    }

    @Override
    public String getColumnName(int column) {
        return ColumnsNames[column];
    }
    

    @Override
    public int getRowCount() {
    
        return data.size();
        
    }

    @Override
    public int getColumnCount() {
        return ColumnsNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Vehicle v = data.get(rowIndex);
        
        switch(columnIndex){
         case 0: return v.getStockNumber();
         case 1: return v.getYear();
         case 2: return v.getMake();
         case 3: return v.getModel();
         case 4: return v.getStyle();
         case 5: return v.getVin();
         case 6: return v.getExteriorColor();
         case 7: return v.getInteriorColor();
         case 8: return v.getMiles();
         case 9: return v.getPrice();
         case 10: return v.getTransmission();
         case 11: return v.getEngine();
         case 12: return v.getImage();
         case 13: return v.getStatus();
         default: return null;
        
        }
    }
        
     /*switch(columnIndex){
         case 0: return data.get(rowIndex).getStockNumber();
         case 1: return data.get(rowIndex).getYear();
         case 2: return data.get(rowIndex).getMake();
         case 3: return data.get(rowIndex).getModel();
         case 4: return data.get(rowIndex).getStyle();
         case 5: return data.get(rowIndex).getVin();
         case 6: return data.get(rowIndex).getExteriorColor();
         case 7: return data.get(rowIndex).getInteriorColor();
         case 8: return data.get(rowIndex).getMiles();
         case 9: return data.get(rowIndex).getPrice();
         case 10: return data.get(rowIndex).getTransmission();
         case 11: return data.get(rowIndex).getEngine();
         case 12: return data.get(rowIndex).getImage();
         case 13: return data.get(rowIndex).getStatus();
         
         default: return null;
                             
         
     } 
    }*/
}     
    

      
