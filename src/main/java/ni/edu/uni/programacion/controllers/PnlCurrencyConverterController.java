/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Double.parseDouble;
import ni.edu.uni.programacion.views.panels.PnlCurrencyConverter;

/**
 *
 * @author MateyR
 */
public class PnlCurrencyConverterController implements ActionListener {
    
    private PnlCurrencyConverter pnlcurrencyconverter;

    public PnlCurrencyConverterController(PnlCurrencyConverter pnlCurrencyConverter) {
        this.pnlcurrencyconverter = pnlCurrencyConverter;
        initComponent();  
    }
    
    private void initComponent() {
      pnlcurrencyconverter.getBtnConvertir().addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        int index = pnlcurrencyconverter.getCmbDe().getSelectedIndex();
        
        switch(index){
            case 0:{
                if(e.getActionCommand().equalsIgnoreCase("Convertir")){
                  
                }
            }
            
            
            case 1:{
                if(e.getActionCommand().equalsIgnoreCase("Convertir")){
                  double cant ;
                  
                  cant = Double.parseDouble(pnlcurrencyconverter.getTxtCantidad().getText());
                  
                  pnlcurrencyconverter.getTxtResult().setText(String.valueOf(cant/35));
                  
                  pnlcurrencyconverter.getTxtCantidad().setText("");
                }
                
                break;
            }
            case 2:{
                if(e.getActionCommand().equalsIgnoreCase("Convertir")){
                  double cant ;
                  
                  cant = Double.parseDouble(pnlcurrencyconverter.getTxtCantidad().getText());
                  
                  pnlcurrencyconverter.getTxtResult().setText(String.valueOf(cant*35));
                
                  pnlcurrencyconverter.getTxtCantidad().setText("");
                }
                break;
            }
            
        }
    }
    
  
    
    
}
        
             
              
    
    
    
    

    
    
    
    /*
    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getActionCommand().equalsIgnoreCase("Convertir")){
            double cordobas , result; 
            
            cordobas = parseDouble(pnlCurrencyConverter.getTxtCordobas().getText());
            //pnlCurrencyConverter.getTxtResult().setText(String.valueOf(multiplicacion(cordobas,35)));  // No hay necesidad de crear un Metodo Multiplicacion
            pnlCurrencyConverter.getTxtResult().setText(String.valueOf(cordobas * 35));
            
        }
    }

    public double multiplicacion (double a , double b){
        
        return (a*b); 
    }
    */

    
    
    
   
    
