/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Pnl.PnlPersonaInfo;
import Pojo.Persona;
import View.FrmPersona;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Type;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author MateyR
 */
public class FrmPersonaController {
 
    private FrmPersona frmPersona;
    private PnlPersonaInfo pnlPersonaInfo;
    private List<Persona> personas;
    private Gson gson;
    private DefaultTreeModel personaTreeModel;
    private DefaultMutableTreeNode node;
    private List<String> Allocupaciones;
    private List<String> OcupacionesTree;
    public FrmPersonaController(FrmPersona frmPersona) {
        this.frmPersona = frmPersona;
        initComponet();
    }
    
     
    public void initComponet(){
        
        
        pnlPersonaInfo = new PnlPersonaInfo();
        frmPersona.getPnlContent().add(pnlPersonaInfo);
        
        node = new DefaultMutableTreeNode("Personas",true);
        personaTreeModel = new DefaultTreeModel(node);
        frmPersona.getTreePersona().setModel(personaTreeModel);
                           
        frmPersona.getTreePersona().addMouseListener(new MouseAdapter (){
            @Override
            public void mouseClicked(MouseEvent e) {
                TreePersonMouseClicked(e);
            }
          
        });
        
    }
    
    
    public void loadGson(){
        gson = new Gson();
        
        JsonReader jReader = new JsonReader(new BufferedReader(  
        new InputStreamReader(getClass().getResourceAsStream("/json/PersonasData.json"))));
           
        Type listType = new TypeToken<ArrayList<Persona>>(){}.getType();
 
        personas = gson.fromJson(jReader, listType);     
    } 
    
    public void loadTree(){
        loadGson();
        Allocupaciones = new ArrayList<>();
        OcupacionesTree = new ArrayList<>();
        
   
        for (int i = 0; i <Allocupaciones.size(); i++) {
          Allocupaciones.add(personas.get(i).getOcupacion());
        }
        
        for (int i = 0; i < Allocupaciones.size(); i++) {
            
            System.out.println(Allocupaciones.get(i));
        }
        
        /*for (int i = 0; i < Allocupaciones.size(); i++) {
            if(ValorUnico(Allocupaciones.get(i), Allocupaciones));
            {
             OcupacionesTree.add(Allocupaciones.get(i));
            }
        
        }*/
        
        for (int i = 0; i < OcupacionesTree.size(); i++) {
            System.out.println(OcupacionesTree.get(i));
        }
        
        /*OcupacionesTree.stream().forEach((t)->{
            System.out.println(t.toString());
        });*/
        
    }
    
    public boolean ValorUnico(String valor,ArrayList<String> list){
        int cont = 0;
         for (int i = 0; i < list.size(); i++)
         {
           if (list.get(i).equalsIgnoreCase(valor)){
               cont++;
           }
           
        }

        return cont == 1;
    }
    
    
    public void TreePersonMouseClicked(MouseEvent evt){
        
        loadTree();
        
    }
    
    
    
}
