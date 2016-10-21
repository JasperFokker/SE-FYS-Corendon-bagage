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
        label.setText("Veelgevraagde vragen:");
        
        Label text1 = new Label();
        
        Label text2 = new Label();
        
        Button btn = new Button();
        btn.setText("Kan het gewicht niet invoeren.");
        btn.setPrefSize(300, 20);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override 
            public void handle(ActionEvent event) {
                text1.setText("Vul het gewicht afgerond in in kilogrammen");
                text2.setText("");
            }
        });
        
       
        Button btn2 = new Button();
        btn2.setText("De koffer heeft geen merk.");
        btn2.setPrefSize(300, 20);
        btn2.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                text2.setText("Dit geeft niet, dit kan gewoon leeg gelaten worden.");
                text1.setText("");
            }
        });
        
        scherm.add(text1,0,10);
        scherm.add(text2,0,10);
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
