/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textEditor.panels;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author MateyR
 */
public class PnlTextEditor extends javax.swing.JPanel {

    /**
     * Creates new form PnlTextEditor
     */
    public PnlTextEditor() {
        initComponents();
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JLabel getLbLetters() {
        return lbLetters;
    }

    public void setLbLetters(JLabel lbLetters) {
        this.lbLetters = lbLetters;
    }

    public JLabel getLbLines() {
        return lbLines;
    }

    public void setLbLines(JLabel lbLines) {
        this.lbLines = lbLines;
    }

    public JLabel getLbWords() {
        return lbWords;
    }

    public void setLbWords(JLabel lbWords) {
        this.lbWords = lbWords;
    }

    public JTextArea getTxtAEditor() {
        return txtAEditor;
    }

    public void setTxtAEditor(JTextArea txtAEditor) {
        this.txtAEditor = txtAEditor;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbLines = new javax.swing.JLabel();
        lbLetters = new javax.swing.JLabel();
        lbWords = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAEditor = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(500, 420));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbLines.setText("Lines:");
        jPanel1.add(lbLines);

        lbLetters.setText("Letters:");
        jPanel1.add(lbLetters);

        lbWords.setText("Words:");
        jPanel1.add(lbWords);

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        txtAEditor.setColumns(20);
        txtAEditor.setRows(5);
        jScrollPane1.setViewportView(txtAEditor);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbLetters;
    private javax.swing.JLabel lbLines;
    private javax.swing.JLabel lbWords;
    private javax.swing.JTextArea txtAEditor;
    // End of variables declaration//GEN-END:variables
}
