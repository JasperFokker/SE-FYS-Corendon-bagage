package sefyscorendon;

import javafx.scene.control.Button;
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
 * @author Jasper & Jimmy
 */
public class SeFYSCORENDON extends Application
{
    static BorderPane scherm = new BorderPane();
    static VBox menu = new VBox();
    
    //wissel scherm.
    public static void change(GridPane gridpane){
        scherm.setCenter(gridpane);
    }
    
    public static void menu(){
        scherm.setLeft(menu);
    }
    
    @Override
    public void start(Stage primaryStage)
    {
        GridPane zoekScherm = Rick.returnScherm();
        GridPane helpScherm = Jason.returnScherm();
        GridPane inlogScherm = Thom.returnScherm();
        GridPane formulierScherm = Floris.returnScherm();
        
        Button uitlogButton = new Button();
        uitlogButton.setText("Uitloggen");
        uitlogButton.setPrefSize(200, 112.5);
        uitlogButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override 
            public void handle(ActionEvent event) {
                //Veranderd het huidige scherm naar het inlogscherm en maakt het menu onzichtbaar.
                scherm.setCenter(inlogScherm);
                scherm.setLeft(null);
            }
        });
        
        Button zoekButton = new Button();
        zoekButton.setText("Zoeken");
        zoekButton.setPrefSize(200, 112.5);
        zoekButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override 
            public void handle(ActionEvent event) {
                scherm.setCenter(zoekScherm);
            }
        });
                    
        Button helpButton = new Button();
        helpButton.setText("Help");
        helpButton.setPrefSize(200, 112.5);
        helpButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override 
            public void handle(ActionEvent event) {
                scherm.setCenter(helpScherm);
            }
        });
        
        Button formulierButton = new Button();
        formulierButton.setText("Formulier");
        formulierButton.setPrefSize(200, 112.5);
        formulierButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override 
            public void handle(ActionEvent event) {
                scherm.setCenter(formulierScherm);
            }
        });
        
        menu.getChildren().addAll(zoekButton,helpButton,formulierButton,uitlogButton);
        
        scherm.setCenter(inlogScherm);
        
        Scene scene = new Scene(scherm, 800, 450);
        String css = SeFYSCORENDON.class.getResource("Theme.css").toExternalForm();
        scene.getStylesheets().add(css);
        
        primaryStage.setTitle("Main Screen");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }    
}
