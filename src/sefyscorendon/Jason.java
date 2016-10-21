/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sefyscorendon;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Jason
 */
public class Jason extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        returnScherm();
    }
    
    public static GridPane returnScherm() {
        GridPane scherm = new GridPane();
        scherm.setPrefSize(600, 450);
        
        /* 
        +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        =====================================================================
        HIERONDER WERK JE!!
        HIERONDER WERK JE!!
        +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        =====================================================================
        */
        
        
        
        Label label = new Label();
        label.setText("Instellingen");
        
        
        Button btn = new Button();
        btn.setText("Taal:");
        btn.setPrefSize(300, 20);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override 
            public void handle(ActionEvent event) {
                //event handle voor de button
                System.out.println("Taal:");
            }
        });
        
       
        Button btn2 = new Button();
        btn2.setText("Achtergrondkleur:");
        btn2.setPrefSize(300, 20);
        btn2.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Achtergrondkleur:");
            }
        });
                    
        scherm.add(label, 0, 0);
        scherm.add(btn, 0, 1);
        scherm.add(btn2, 0, 2);
        
        
        
        
        
        /* 
        +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        =====================================================================
        HIERONDER WERK JE NIET!!
        HIERONDER WERK JE NIET!!
        +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        =====================================================================
        */
        return scherm;
    }
}
