/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextEditorDemo.io.view;

//import static com.sun.javadoc.Doclet.start;
import TextEditor.panel.PnlEditor;
import TextEditorDemo.io.IOString;
import java.awt.Font;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.AttributeSet;
import javax.swing.text.Element;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import say.swing.JFontChooser;

/**
 *
 * @author Sistemas-05
 */
public class FrmEditor extends javax.swing.JFrame {

    private int countTab;
    private FileNameExtensionFilter fileNameFileFilter;
    private JFileChooser fileChooser;
    private IOString ioString;
    private JFontChooser fontChooser;

    /**
     * Creates new form FrmEditor
     */
    public FrmEditor() {
        countTab = 1;
        fileNameFileFilter = new FileNameExtensionFilter("txt files", "txt");

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

        tbpContent = new javax.swing.JTabbedPane();
        jToolBar1 = new javax.swing.JToolBar();
        btnCloseTab = new javax.swing.JButton();
        tglBold = new javax.swing.JToggleButton();
        tglJustify = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnFile = new javax.swing.JMenu();
        mniNew = new javax.swing.JMenuItem();
        mniOpen = new javax.swing.JMenuItem();
        mniSaveAs = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniTextFormat = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Text Editor");

        jToolBar1.setRollover(true);

        btnCloseTab.setText("X");
        btnCloseTab.setFocusable(false);
        btnCloseTab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCloseTab.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCloseTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseTabActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCloseTab);

        tglBold.setText("Bold");
        tglBold.setFocusable(false);
        tglBold.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tglBold.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tglBold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoldActionPerformed(evt);
            }
        });
        jToolBar1.add(tglBold);

        tglJustify.setText("Justify");
        tglJustify.setFocusable(false);
        tglJustify.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tglJustify.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tglJustify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglJustifyActionPerformed(evt);
            }
        });
        jToolBar1.add(tglJustify);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        mnFile.setText("File");

        mniNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniNew.setText("New");
        mniNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNewActionPerformed(evt);
            }
        });
        mnFile.add(mniNew);

        mniOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniOpen.setText("Open");
        mniOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniOpenActionPerformed(evt);
            }
        });
        mnFile.add(mniOpen);

        mniSaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniSaveAs.setText("Save As");
        mniSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSaveAsActionPerformed(evt);
            }
        });
        mnFile.add(mniSaveAs);
        mnFile.add(jSeparator1);

        mniExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniExit.setText("Exit");
        mnFile.add(mniExit);

        jMenuBar1.add(mnFile);

        jMenu2.setText("Edit");

        mniTextFormat.setText("Text Format");
        mniTextFormat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTextFormatActionPerformed(evt);
            }
        });
        jMenu2.add(mniTextFormat);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mniNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNewActionPerformed
        PnlEditor pnlEditor = new PnlEditor();
        tbpContent.addTab("Editor " + countTab++, pnlEditor);
    }//GEN-LAST:event_mniNewActionPerformed

    private void btnCloseTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseTabActionPerformed
        if (tbpContent.getComponentCount() <= 0) {
            return;
        }

        int option = JOptionPane.showConfirmDialog(null,
                "Are you sure to delete this tab?",
                "Confirm Dialog",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (option == 1) {
            return;
        }

        int index = tbpContent.getSelectedIndex();
        tbpContent.remove(index);
    }//GEN-LAST:event_btnCloseTabActionPerformed

    private void mniOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniOpenActionPerformed
        int option = getFileChooser().showOpenDialog(this);

        if (option == JFileChooser.CANCEL_OPTION) {
            return;
        }

        File file = getFileChooser().getSelectedFile();
        ioString = new IOString(file);

        PnlEditor pnlEditor = new PnlEditor();
        try {
            pnlEditor.getTxtpEditor().setText(ioString.readString());
        } catch (IOException ex) {
            Logger.getLogger(FrmEditor.class.getName()).log(Level.SEVERE, null, ex);
        }
        tbpContent.addTab(file.getName(), pnlEditor);

    }//GEN-LAST:event_mniOpenActionPerformed

    private void mniSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSaveAsActionPerformed
        PnlEditor pnlEditor = (PnlEditor) tbpContent.getSelectedComponent();
        int index = tbpContent.getSelectedIndex();
        if (pnlEditor == null) {
            return;
        }
        try {
            int option = getFileChooser().showSaveDialog(this);

            if (option == JFileChooser.CANCEL_OPTION) {
                return;
            }

            File file = getFileChooser().getSelectedFile();
            ioString = new IOString(file);
            
            if(file.exists()){
                System.out.println("Option 1: Reemblazar");
                System.out.println("Option 2: Guardar el mismo archivo");
                System.out.println("Option 3: Cancelar");
                
                Scanner reader = new Scanner(System.in);
                
                int opt = 0;
                opt = reader.nextInt();
                
                switch(opt){
                    case 1:{
                        
                        ioString.writeString(pnlEditor.getTxtpEditor().getText());
                        
                        tbpContent.setTitleAt(index, file.getName());
                    }
                    
                    case 2:{
                        FileWriter write  =  new FileWriter(file,true);
                        tbpContent.setTitleAt(index, file.getName());
                    }
                    
                    case 3:{
                        return;
                    }
                }
            }

            ioString.writeString(pnlEditor.getTxtpEditor().getText(), false);

            tbpContent.setTitleAt(index, file.getName());
        } catch (IOException ex) {
            Logger.getLogger(FrmEditor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_mniSaveAsActionPerformed

    private void btnBoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoldActionPerformed
        PnlEditor pnlEditor = (PnlEditor) tbpContent.getSelectedComponent();
        if (pnlEditor == null) {
            return;
        }

        String text = pnlEditor.getTxtpEditor().getSelectedText();
        if (text == null) {
            return;
        }

        int start = pnlEditor.getTxtpEditor().getSelectionStart();
        StyledDocument style = pnlEditor.getTxtpEditor().getStyledDocument();

        Font font = new Font(Font.SERIF, tglBold.isSelected() ? Font.BOLD : Font.PLAIN, 12);        
        pnlEditor.getTxtpEditor().setStyledDocument(getStyledDocuemt(font,style, start, text.length()));
    }//GEN-LAST:event_btnBoldActionPerformed

    private void mniTextFormatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTextFormatActionPerformed
        PnlEditor pnlEditor = (PnlEditor) tbpContent.getSelectedComponent();
        if (pnlEditor == null) {
            return;
        }

        int option = getFontChooser().showDialog(this);
        if (option == JFontChooser.CANCEL_OPTION) {
            return;
        }

        String text = pnlEditor.getTxtpEditor().getSelectedText();
        if (text == null) {
            return;
        }

        Font font = getFontChooser().getSelectedFont();
        int start = pnlEditor.getTxtpEditor().getSelectionStart();
        StyledDocument style = pnlEditor.getTxtpEditor().getStyledDocument();
        pnlEditor.getTxtpEditor().setStyledDocument(getStyledDocuemt(font, style, start, text.length()));
    }//GEN-LAST:event_mniTextFormatActionPerformed

    private void tglJustifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglJustifyActionPerformed
        
        PnlEditor pnlEditor = (PnlEditor) tbpContent.getSelectedComponent();
        
        if(pnlEditor == null){
            return;
        }
        
        String text = pnlEditor.getTxtpEditor().getSelectedText();
        
        if (text == null) {
            return;
        }

        
        int start =  pnlEditor.getTxtpEditor().getSelectionStart();
                  
        StyledDocument doc =  pnlEditor.getTxtpEditor().getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(start, text.length(), center, false);
             
    }//GEN-LAST:event_tglJustifyActionPerformed

    private StyledDocument getStyledDocuemt(Font font, StyledDocument style, int start, int length){
        MutableAttributeSet attributeSet = getMutableAttributeSet(style, start);        
        
        attributeSet.addAttribute(StyleConstants.Bold, font.isBold());
        attributeSet.addAttribute(StyleConstants.Italic, font.isItalic());
        attributeSet.addAttribute(StyleConstants.Size, font.getSize());
        attributeSet.addAttribute(StyleConstants.Family, font.getFamily());
        attributeSet.addAttribute(StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);
        
        style.setCharacterAttributes(start, length, attributeSet, true);
        
        return style;        
    }

    private MutableAttributeSet getMutableAttributeSet(StyledDocument style, int start) {
        Element element = style.getCharacterElement(start);
        AttributeSet as = element.getAttributes();
        
        return new SimpleAttributeSet(as.copyAttributes());
    }
    
    private JFileChooser getFileChooser() {
        if (fileChooser == null) {
            fileChooser = new JFileChooser();
            fileChooser.addChoosableFileFilter(fileNameFileFilter);
            fileChooser.setFileFilter(fileNameFileFilter);
        }

        return fileChooser;
    }

    private JFontChooser getFontChooser() {
        if (fontChooser == null) {
            fontChooser = new JFontChooser();
        }
        return fontChooser;
    }

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
            java.util.logging.Logger.getLogger(FrmEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEditor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCloseTab;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu mnFile;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniNew;
    private javax.swing.JMenuItem mniOpen;
    private javax.swing.JMenuItem mniSaveAs;
    private javax.swing.JMenuItem mniTextFormat;
    private javax.swing.JTabbedPane tbpContent;
    private javax.swing.JToggleButton tglBold;
    private javax.swing.JToggleButton tglJustify;
    // End of variables declaration//GEN-END:variables
}
