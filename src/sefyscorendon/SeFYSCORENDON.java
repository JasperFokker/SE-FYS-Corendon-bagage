package sefyscorendon;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author TEAM TWEE
 */
public class SeFYSCORENDON extends Application
{
    
    
    
    @Override
    public void start(Stage primaryStage)
    {
        BorderPane ui = new BorderPane();
        VBox menu = new VBox();
        GridPane rick = Rick.returnScherm();
        GridPane jason = Rick.returnScherm();
        GridPane thom = Rick.returnScherm();
        GridPane floris = Rick.returnScherm();
        
        
        Button btn1 = new Button();
        btn1.setText("UITLOGGEN");
        btn1.setPrefSize(200, 90);
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override 
            public void handle(ActionEvent event) {
                //event handle voor de button
                ui.setCenter(thom);
                ui.setLeft(null);
            }
        });
        
        Button btn2 = new Button();
        btn2.setText("RICK");
        btn2.setPrefSize(200, 90);
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override 
            public void handle(ActionEvent event) {
                //event handle voor de button
                ui.setCenter(rick);
            }
        });
        
        Button btn3 = new Button();
        btn3.setText("JASON");
        btn3.setPrefSize(200, 90);
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override 
            public void handle(ActionEvent event) {
                //event handle voor de button
                ui.setCenter(jason);
            }
        });
        
        Button btn4 = new Button();
        btn4.setText("THOM");
        btn4.setPrefSize(200, 90);
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override 
            public void handle(ActionEvent event) {
                //event handle voor de button
                ui.setCenter(thom);
                ui.setLeft(null);
            }
        });
        
        Button btn5 = new Button();
        btn5.setText("FLORIS");
        btn5.setPrefSize(200, 90);
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override 
            public void handle(ActionEvent event) {
                //event handle voor de button
                ui.setCenter(floris);
            }
        });
        
        
        menu.getChildren().addAll(btn1,btn2,btn3,btn4,btn5);
        
        ui.setLeft(menu);
        
        
        
        Scene scene = new Scene(ui, 800, 450);
        
        primaryStage.setTitle("Main Screen");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
   
    public static void main(String[] args)
    {
        launch(args);
    }    
}
