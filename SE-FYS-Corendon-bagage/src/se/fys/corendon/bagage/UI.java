/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.fys.corendon.bagage;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author jimmy
 */
public class UI extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        returnScherm();
    }
    
    public static VBox returnScherm() {
        VBox scherm1 = new VBox();
        
        
        //DOE HIER JE SHIT
        Label label = new Label();
        label.setText("hoi");

        Button zoekButton = new Button();
        zoekButton.setPrefSize(250, 150);
        
        Button invoerButton = new Button();
        invoerButton.setPrefSize(250, 150);
        
        Button optieButton = new Button();
        optieButton.setPrefSize(250, 150);
        
        Button loguitButton = new Button();
        loguitButton.setPrefSize(250, 150);
        
        Button statusButton = new Button();
        statusButton.setPrefSize(250, 150);
                
                
        scherm1.setPrefSize(250, 750);
        scherm1.getChildren().addAll(zoekButton, invoerButton, optieButton, loguitButton, statusButton, label);
        
        return scherm1;
    }
}
