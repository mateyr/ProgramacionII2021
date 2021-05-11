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
import javax.swing.table.TableColumn;

/**
 *
 * @author Sistemas-07
 */
public class pnlCalcularDepreciacionController {
    private  pnlCalcularDepreciacion calcularDepreciacion;
    //private ComboBoxModel<String> cmbModel;
    private DefaultTableModel tableModel;
    private List<ActivoFijo> activos;
    
    public pnlCalcularDepreciacionController(pnlCalcularDepreciacion calcularDepreciacion) {
        this.calcularDepreciacion = calcularDepreciacion;
        InitComponent();
    }
    
    private void InitComponent(){
      
      activos =  new ArrayList<>();
        
      tableModel = (DefaultTableModel) calcularDepreciacion.getTblActivos().getModel();
      
      calcularDepreciacion.getCmbTipoActivo().addItem("Edificio");   
      calcularDepreciacion.getCmbTipoActivo().addItem("Vehiculo");
      calcularDepreciacion.getCmbTipoActivo().addItem("Maquinaria");
      calcularDepreciacion.getCmbTipoActivo().addItem("Mobiliario");
      calcularDepreciacion.getCmbTipoActivo().addItem("Equipo de Oficina");
      
      calcularDepreciacion.getBtnCalcular().addActionListener((e) -> {
          btnCalcularActionPerformed(e);
      });
       
      
    }
    
    private void btnCalcularActionPerformed(ActionEvent evt){
        String nombre = calcularDepreciacion.getTxtNombre().getText();
        int vActivo = Integer.parseInt(calcularDepreciacion.getTxtValorActivo().getText());
        int vSalv = Integer.parseInt(calcularDepreciacion.getTxtVSalv().getText());
        int selected = (int) calcularDepreciacion.getCmbTipoActivo().getSelectedIndex();
        
        ActivoFijo act = new ActivoFijo(nombre, vActivo, vSalv,selected);
       
        activos.add(act);
        
        
        
        
        int columnas = 0;
        /*switch(cmbSelected){
            case 0 :{ columnas = 20;break;}
            case 1 :{ columnas = 5;break;}
            case 2 :{ columnas = 8;break;}
            case 3 :{ columnas = 2;break;}
            case 4 :{ columnas = 1;break;}
        }/*
       
        for (int i = 0; i <= columnas ; i++) {
            
            TableColumn colum = new TableColumn();
            colum.setHeaderValue(i);
            calcularDepreciacion.getTblActivos().addColumn(colum);
            
        }
        
        
        
        
        
        
    }
}
