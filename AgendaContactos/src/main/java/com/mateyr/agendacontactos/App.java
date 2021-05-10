package com.mateyr.agendacontactos;

import com.mateyr.agendacontactos.models.Contacto;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        
  
        scene = new Scene(loadFXML("MainTableFXML"), 640, 480);
        stage.setScene(scene);
        stage.show();
        
        
        /*FXMLLoader loader = new FXMLLoader(getClass().getResource("ConctactosView.fxml"));
         Parent root = loader.load();
         ConctactosViewController ven = loader.getController();
         ven.setStage(stage);
        
        scene = new Scene(root);*/   
        
        //    *This could be Another way to Block the Scene* 
        
        
        stage.setScene(scene);
        stage.show();
        
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    public static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
    
    
    
}