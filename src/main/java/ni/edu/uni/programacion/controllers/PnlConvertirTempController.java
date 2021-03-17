/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion.controllers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
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
        pnlconversionestemp.getTxttemperatura().setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Validaciones(pnlconversionestemp);
        
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
                  
                  pnlconversionestemp.getTxtResult().setText(String.valueOf((cant - 32) * ((float)5/9)));
                  
                  pnlconversionestemp.getTxttemperatura().setText("");
                }
                
                break;
            }
            case 2:{
                if(e.getActionCommand().equalsIgnoreCase("Convertir")){
                  double cant ;
                  
                  cant = Double.parseDouble(pnlconversionestemp.getTxttemperatura().getText());
                  
                  pnlconversionestemp.getTxtResult().setText(String.valueOf(1.8*cant + 32));
                
                  pnlconversionestemp.getTxttemperatura().setText("");
                }
                break;
            }
            
        }
        
       
  
}
    
    
     private void Validaciones(PnlConversionesTemp conversiontemplate){
        if(conversiontemplate.getTxttemperatura().getText().isEmpty()){
            JOptionPane.showMessageDialog(conversiontemplate,
                    "El campo: VALOR es requerido",
                    "Mensaje de error",
                    JOptionPane.ERROR_MESSAGE);
            conversiontemplate.getTxttemperatura().setBorder(BorderFactory.createLineBorder(Color.RED, 1));
         
            return;
        }
        
        String cadena = conversiontemplate.getTxttemperatura().getText();
        if(isNumeric(cadena) == false) {
            
            JOptionPane.showMessageDialog(conversiontemplate,
                    "El valor ingresado contiene letras",
                    "Mensaje de error",
                    JOptionPane.ERROR_MESSAGE);
            conversiontemplate.getTxttemperatura().setBorder(BorderFactory.createLineBorder(Color.RED, 1));
           
        }
 
    }
    
    private static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
    }
}
        
        
  
    
    
    
        
    
    

