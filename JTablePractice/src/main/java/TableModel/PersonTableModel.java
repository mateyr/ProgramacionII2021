package TableModel;


import Pojo.Persona;
import java.util.List; 
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MateyR
 */
public class PersonTableModel extends AbstractTableModel{

     private List<Persona> data;
     private String[] columnNames ;

    public PersonTableModel(List<Persona> data, String[] columnNames) {
        this.data = data;
        this.columnNames = columnNames;
    }
     
    @Override
    public int getRowCount() {
         return data.size();
    }

    @Override
    public String getColumnName(int column) {
       return columnNames[column];
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
     return data == null ? null : data.isEmpty() ? null : data.get(rowIndex).asArray()[columnIndex];
  
    }
    
   
    
}
