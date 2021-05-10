/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import TableModel.PersonTableModel;
import PnlView.PnlTablePerson;
import Pojo.Persona;
import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author MateyR
 */
public class PnlTablePersonController {
     private Gson gson;
    
    private PnlTablePerson pnlTablePerson;
    private PersonTableModel personTableModel;
    
    private List<Persona> personas;
    private String[] columnNames ={"Nombre","Apellido","Edad","Ocupacion"};

    public PnlTablePersonController(PnlTablePerson pnlTablePerson) throws FileNotFoundException {
        this.pnlTablePerson = pnlTablePerson;
        initComponet();
    }
    
    public void initComponet() throws FileNotFoundException{
       
           
     gson= new Gson();
     
     personas = new ArrayList<>();
     
     /*JsonReader jreader = new JsonReader(new BufferedReader(
     new InputStreamReader(getClass().getResourceAsStream("/json/PersonasData.json"))));*/
     
     /*Type listType = new TypeToken<ArrayList<Persona>>(){}.getType();
     
     personas = gson.fromJson(jreader,listType);*/
     
     
     
     
     personas.addAll(Arrays.asList(gson.fromJson(new FileReader("src/main/Resources/json/PersonasData.json"), Persona[].class)));
     
     personTableModel = new PersonTableModel(personas,columnNames);
     pnlTablePerson.getTblPerson().setModel(personTableModel);
    }
    
    
}
