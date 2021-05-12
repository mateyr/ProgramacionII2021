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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sistemas-07
 */
public class pnlCalcularDepreciacionController {
    private  pnlCalcularDepreciacion calcularDepreciacion;
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
     
        for (int i = 0; i < activos.size(); i++) {
            tableModel.addRow(new Object[]{});
        }   
      
      calcularDepreciacion.getTblActivos().setModel(tableModel);
       
       for(int a = 0; a<activos.size();a++){
           calcularDepreciacion.getTblActivos().setValueAt(activos.get(a).getNombre(), a, 0);
            for (int i = 0; i < activos.get(a).getTipo(); i++) {
            calcularDepreciacion.getTblActivos().setValueAt(DepreciationValue(activos.get(a)), a, i+1);
        }
       }

    }
    
    private int DepreciationValue(ActivoFijo activo){
        
        int depreciacion = 0;
        
        depreciacion = (activo.getValorActivo() - activo.getValorSalv()) / activo.getTipo();
        
        return depreciacion;
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
