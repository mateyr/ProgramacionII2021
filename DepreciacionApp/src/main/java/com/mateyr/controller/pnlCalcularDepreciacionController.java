/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mateyr.controller;

import com.mateyr.View.pnlCalcularDepreciacion;
import com.mateyr.pojo.ActivoFijo;
import java.util.List;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Sistemas-07
 */
public class pnlCalcularDepreciacionController {
    private  pnlCalcularDepreciacion calcularDepreciacion;
    //private ComboBoxModel<String> cmbModel;
    private DefaultTableModel tableModel;
    private List<ActivoFijo> activos;
    int columnas = 0;
    
    public pnlCalcularDepreciacionController(pnlCalcularDepreciacion calcularDepreciacion) {
        this.calcularDepreciacion = calcularDepreciacion;
        InitComponent();
    }
    
    private void InitComponent(){
      
      activos =  new ArrayList<>();
     
      calcularDepreciacion.getCmbTipoActivo().addItem("Edificio");   
      calcularDepreciacion.getCmbTipoActivo().addItem("Vehiculo");
      calcularDepreciacion.getCmbTipoActivo().addItem("Maquinaria");
      calcularDepreciacion.getCmbTipoActivo().addItem("Mobiliario");
      calcularDepreciacion.getCmbTipoActivo().addItem("Equipo de Oficina");
      
      calcularDepreciacion.getBtnCalcular().addActionListener((ActionEvent e) -> {
          btnCalcularActionPerformed(e);
      });
       
      
    }
    
    private void btnCalcularActionPerformed(ActionEvent evt){
                
        tableModel = new DefaultTableModel();
        
        String nombre = calcularDepreciacion.getTxtNombre().getText();
        int vActivo = Integer.parseInt(calcularDepreciacion.getTxtValorActivo().getText());
        int vSalv = Integer.parseInt(calcularDepreciacion.getTxtVSalv().getText());
        int tipo = calcularDepreciacion.getCmbTipoActivo().getSelectedIndex();
        
        
        ActivoFijo act = new ActivoFijo(nombre, vActivo, vSalv,establecerTipo(tipo));
       
        activos.add(act);
        
         for (int i = 0; i <activos.size(); i++) {
            if(columnas < activos.get(i).getTipo()){
                columnas = activos.get(i).getTipo();
            }
         }
      tableModel.addColumn("Activo");
      for (int i = 0; i < columnas; i++) {
        tableModel.addColumn(i+1);
          
       } 
     
      tableModel.addRow(new Object[]{});
      
      
      calcularDepreciacion.getTblActivos().setModel(tableModel);
      
      
       /*for (int i = 0; i < calcularDepreciacion.getTblActivos().getModel().getColumnCount(); i++) {
            
        calcularDepreciacion.getTblActivos().setValueAt(calcularDepreciacion.getTxtNombre().getText(), 0,i);
       }*/
       
        
    }
    
    private int establecerTipo(int est){
        switch (est) {
           case 0 : est = 20; break;  //Edificio
           case 1 : est = 5; break;   //Vehiculo 
           case 2 : est = 8; break;   //Maquinaria
           case 3 : est = 2; break;   //Mobiliario
           case 4 : est = 1; break;   //Equipo de Oficina
          
       }
        
      return est;
    } 
}
