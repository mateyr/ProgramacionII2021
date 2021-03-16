/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ni.edu.uni.programacion.views.panels.PnlConversionesTemp;

/**
 *
 * @author MateyR
 */
public class PnlConvertirTempController implements ActionListener {
    
    private PnlConversionesTemp pnlconversionestemp;

    public PnlConvertirTempController(PnlConversionesTemp pnlconversionestemp) {
        this.pnlconversionestemp = pnlconversionestemp;
        initComponet();
    }
    
    public void initComponet(){
        
        pnlconversionestemp.getBtnConvertir().addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        int index = pnlconversionestemp.getjComboBox1().getSelectedIndex();
        
        switch(index){
            case 0:{
                if(e.getActionCommand().equalsIgnoreCase("Convertir")){
                  
                }
            }
            
            
            case 1:{
                if(e.getActionCommand().equalsIgnoreCase("Convertir")){
                  double cant ;
                  
                  cant = Double.parseDouble(pnlconversionestemp.getTxttemperatura().getText());
                  
                  pnlconversionestemp.getTxtResult().setText(String.valueOf(cant/35));
                  
                  pnlconversionestemp.getTxttemperatura().setText("");
                }
                
                break;
            }
            case 2:{
                if(e.getActionCommand().equalsIgnoreCase("Convertir")){
                  float cant ;
                  
                  cant = (float) Double.parseDouble(pnlconversionestemp.getTxttemperatura().getText());
                  
                  pnlconversionestemp.getTxtResult().setText(String.valueOf(32 + (cant*1.8);
                
                  pnlconversionestemp.getTxttemperatura().setText("");
                }
                break;
            }
            
        }
        
    }
    
    
    
        
    
    
}
