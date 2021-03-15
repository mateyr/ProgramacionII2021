/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.AncestorListener;
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
        /*pnlCalculadora.getBtnCalc().addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {                         // Action Listener es una interfaz que contiene un 1Solo metodo actionperform(ActionEvent e)
                if (e.getActionCommand().equalsIgnoreCase("Calcular")) {         //Entonces este metodo tomo como parametro un action event que es con el que se trabaja       
            double n1, n2;                                                       // "Por logica No ahaha" ahora en este apartado se podria hacer al momento en que esta desde el init ccomponents 
                                                                                 // Pero eso lo volveria desosdenado  entonces hacemos los metodos fuera del init components
            n1 = Double.parseDouble(pnlCalculadora.getTxtNumber1().getText());   // De hecho neatbeans haci lo hace por defecto
            n2 = Double.parseDouble(pnlCalculadora.getTxtNumber2().getText());

            //pnlCalculadora.getTxtResult().setText(String.valueOf(suma(n1, n2)));
            pnlCalculadora.getTxtResult().setText(String.valueOf(n1+ n2));
        }
                
        }
            
        }); */ 
     
        /*pnlCalculadora.getBtnNew().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //btnNewActionPerformed(evt);
                 if(evt.getActionCommand().equalsIgnoreCase("Nuevo")){
                 pnlCalculadora.getTxtNumber1().setText("");
                 pnlCalculadora.getTxtNumber2().setText("");
                 pnlCalculadora.getTxtResult().setText("");
            
        }
               
            }
        });*/
          
        pnlCalculadora.getBtnCalc().addActionListener(this);  //This para decir que es la variable de instancia  No la variable local, Ademas es la clase la que implementa la
        pnlCalculadora.getBtnNew().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {           
            btnNewActionPerformed(e);          }
        });
    }

    //@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Calcular")) {
            double n1, n2;
          
            n1 = Double.parseDouble(pnlCalculadora.getTxtNumber1().getText());
            n2 = Double.parseDouble(pnlCalculadora.getTxtNumber2().getText());

            //pnlCalculadora.getTxtResult().setText(String.valueOf(suma(n1, n2)));
            pnlCalculadora.getTxtResult().setText(String.valueOf(n1+ n2));
        }
    }

    private double suma(double a, double b) {
        return a + b;
    }
    
      
    
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(evt.getActionCommand().equalsIgnoreCase("Nuevo")){
            pnlCalculadora.getTxtNumber1().setText("");
            pnlCalculadora.getTxtNumber2().setText("");
            pnlCalculadora.getTxtResult().setText("");
            
        }
    } 


    
     
    


}