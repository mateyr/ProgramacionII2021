/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ni.edu.uni.programacion.views.panels.PnlCalculadora;

/**
 *
 * @author Sistemas-05
 */
public class PnlCalculadoraController implements ActionListener {
    private PnlCalculadora pnlCalculadora;

    public PnlCalculadoraController(PnlCalculadora pnlCalculadora) {
        this.pnlCalculadora = pnlCalculadora;
        initComponent();
        //this.pnlCalculadora.getBtnCalc().addActionListener(this);
    }

    private void initComponent() {
        pnlCalculadora.getBtnCalc().addActionListener(this);  //This para decir que es la variable de instancia  No la variable local, Ademas es la clase la que implementa la
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Calcular")) {
            double n1, n2;
            n1 = Double.parseDouble(pnlCalculadora.getTxtNumber1().getText());
            n2 = Double.parseDouble(pnlCalculadora.getTxtNumber2().getText());

            //pnlCalculadora.getTxtResult().setText(String.valueOf(suma(n1, n2)));
            pnlCalculadora.getTxtResult().setText(String.valueOf(n1 + n2));
        }
    }

    private double suma(double a, double b) {
        return a + b;
    }
    
    

}
