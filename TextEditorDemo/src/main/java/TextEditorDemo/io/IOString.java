/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextEditorDemo.io;

import TextEditorDemo.io.view.FrmEditor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Sistemas-05
 */
public class IOString {
    private File file;

    public IOString(File file) {
        this.file = file;
    }
    
    public void writeString(String text, boolean append) throws IOException{
        
        try (FileWriter fileWriter = new FileWriter(file, append)) {
            fileWriter.write(text);
        }
    }
    
    public String readString() throws FileNotFoundException, IOException{
        if(!file.exists()){
            return "";
        }
        
        String text = "";
        int n;
        try (FileReader fileReader = new FileReader(file)) {
            while((n = fileReader.read()) != -1){
                text +=(char) n;
            }
        }
        
        return text;
    }

    public void writeString(String text) {
         try{
            FileWriter write  =  new FileWriter(file);
        }catch (IOException ex) {
            Logger.getLogger(FrmEditor.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
}
