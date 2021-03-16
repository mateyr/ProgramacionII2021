/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion.views;

import java.awt.BorderLayout;
import ni.edu.uni.programacion.controllers.PnlCalculadoraController;
import ni.edu.uni.programacion.controllers.PnlConvertirTempController;
import ni.edu.uni.programacion.controllers.PnlCurrencyConverterController;
import ni.edu.uni.programacion.views.panels.PnlCalculadora;
import ni.edu.uni.programacion.views.panels.PnlConversionesTemp;
import ni.edu.uni.programacion.views.panels.PnlCurrencyConverter;


/**
 *
 * @author yasser.membreno
 */
public class StartFrame extends javax.swing.JFrame {
    private PnlCalculadora pnlCalculadora;
    private PnlCalculadoraController pnlCalculadoraController;
    private PnlCurrencyConverter pnlCurrencyConverter;
    private PnlCurrencyConverterController pnlCurrencyConverterController;
    private PnlConversionesTemp  pnlconversionestemp;
    private PnlConvertirTempController pnlconversionestempcontroller;
    /**
     * Creates new form StartFrame
     */
    public StartFrame() {
        
        initComponents();        
    }
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLeftButtons = new javax.swing.JPanel();
        btnCalc = new javax.swing.JButton();
        btnConvertM = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        pnlContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My App");
        getContentPane().setLayout(new java.awt.BorderLayout(3, 2));

        pnlLeftButtons.setBackground(new java.awt.Color(153, 153, 153));
        pnlLeftButtons.setPreferredSize(new java.awt.Dimension(200, 150));
        pnlLeftButtons.setLayout(new java.awt.GridLayout(3, 1, 2, 2));

        btnCalc.setText("Calculadora");
        btnCalc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });
        pnlLeftButtons.add(btnCalc);

        btnConvertM.setText("Convertidor");
        btnConvertM.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConvertM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertMActionPerformed(evt);
            }
        });
        pnlLeftButtons.add(btnConvertM);

        jButton3.setText("Convertido De Temperaturas");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        pnlLeftButtons.add(jButton3);

        getContentPane().add(pnlLeftButtons, java.awt.BorderLayout.LINE_START);

        pnlContent.setBackground(new java.awt.Color(255, 255, 255));
        pnlContent.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pnlContent, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(573, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        if(pnlCalculadora == null){
            pnlCalculadora = new PnlCalculadora();
            pnlCalculadoraController = new PnlCalculadoraController(pnlCalculadora);
        }
        if(pnlContent.getComponentCount() > 0){
            pnlContent.remove(0);
        }
        pnlContent.add(pnlCalculadora, BorderLayout.CENTER);
        this.validate();
    }//GEN-LAST:event_btnCalcActionPerformed

    private void btnConvertMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertMActionPerformed
        if(pnlCurrencyConverter == null){
            
            pnlCurrencyConverter = new PnlCurrencyConverter();
            
            pnlCurrencyConverterController = new PnlCurrencyConverterController(pnlCurrencyConverter);
        }
        
        if(pnlContent.getComponentCount() > 0) {
            pnlContent.remove(0);
        }
        
        pnlContent.add(pnlCurrencyConverter, BorderLayout.CENTER);
        this.validate();
    }//GEN-LAST:event_btnConvertMActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(pnlconversionestemp == null){
            
            pnlconversionestemp = new PnlConversionesTemp();
            
            pnlconversionestempcontroller = new PnlConvertirTempController(pnlconversionestemp);
        }
        
        if(pnlContent.getComponentCount() > 0) {
            pnlContent.remove(0);
        }
        
        pnlContent.add(pnlconversionestemp, BorderLayout.CENTER);
        this.validate();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton btnConvertM;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlLeftButtons;
    // End of variables declaration//GEN-END:variables
}
