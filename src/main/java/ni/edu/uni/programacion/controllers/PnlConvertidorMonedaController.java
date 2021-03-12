/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ni.edu.uni.programacion.views.panels.PnlConvertDin;

/**
 *
 * @author MateyR
 */
public class PnlConvertidorMonedaController implements ActionListener  {
    
    private PnlConvertDin PnlConvertMoneda;

    public PnlConvertidorMonedaController(PnlConvertDin PnlConvertMoneda) {
        this.PnlConvertMoneda = PnlConvertMoneda;
        
        initComponent();
       
    }
    
    private void initComponent() {
        PnlConvertMoneda.getBtnConMo().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Convertir")) {
            double n1, n2;
            n1 = Double.parseDouble(PnlConvertMoneda.getTxtDolar().getText());
            n2 = Double.parseDouble(PnlConvertMoneda.getTxtCordoba().getText());
            PnlConvertMoneda.getTxtResultado().setText(String.valueOf(conversion(n2)));
        }
    }
    
    
    private double conversion(double a) {
        return (a * 35);
    }
    
    
  
}
