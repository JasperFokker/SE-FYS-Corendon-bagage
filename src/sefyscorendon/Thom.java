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
 * @author jimmy
 */
public class Thom extends Application
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
        label.setText("Hello World");
        
        
        Button btn = new Button();
        btn.setText("Hello World");
        btn.setPrefSize(300, 20);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override 
            public void handle(ActionEvent event) {
                //event handle voor de button
                System.out.println("Hello World");
            }
        });
                    
        scherm.add(label, 0, 0);
        scherm.add(btn, 0, 1);
        
        
        
        
        
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
