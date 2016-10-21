/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sefyscorendon;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Floris Wichers
 */
public class Floris extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        returnScherm();
    }
    
    public static GridPane returnScherm() {
        GridPane scherm = new GridPane();
        scherm.setPrefSize(600, 450);
        
        scherm.setAlignment(Pos.CENTER);
        scherm.setHgap(10);
        scherm.setVgap(10);
        scherm.setPadding(new Insets(25, 25, 25, 25));
        
        //datum
        Text dateText = new Text("Datum");
        scherm.add(dateText, 0, 0, 2, 1);

        
        DatePicker dp = new DatePicker();
        scherm.add(dp, 1, 0);

        //luchthaven
        Text airportText = new Text("Luchthaven");
        scherm.add(airportText, 0, 1);
        
        ObservableList<String> airport
                = FXCollections.observableArrayList(
                        "AMS",
                        "ADA",
                        "KYA"
                );
        final ComboBox airportBox = new ComboBox(airport);
        scherm.add(airportBox, 1, 1);

        //combobox soort
        Text typeBagText = new Text("Soort");
        scherm.add(typeBagText, 0, 2);

        ObservableList<String> typeBag
                = FXCollections.observableArrayList(
                        "Tas",
                        "Koffer",
                        "Zak"
                );
        final ComboBox typeBagBox = new ComboBox(typeBag);
        scherm.add(typeBagBox, 1, 2);

        //invoer merk
        Text brandText = new Text("Merk");
        scherm.add(brandText, 0, 3);

        TextField brandField = new TextField();
        scherm.add(brandField, 1, 3);

        //comboboxes kleur
        Text color1Text = new Text("Kleur 1");
        scherm.add(color1Text, 0, 4);
        
        ObservableList<String> color
                = FXCollections.observableArrayList(
                        "Rood",
                        "Blauw",
                        "Geel"
                );
        final ComboBox color1Box = new ComboBox(color);
        scherm.add(color1Box, 1, 4);
        
        Text color2Text = new Text("Kleur 2");
        scherm.add(color2Text, 2, 4);
        
        final ComboBox color2Box = new ComboBox(color);
        scherm.add(color2Box, 3, 4);
        
        //combobox opdruk
        Text graphicText = new Text ("Opdruk");
        scherm.add(graphicText, 0, 5);
        
        ObservableList<String> graphic
                = FXCollections.observableArrayList(
                        "Effen kleur",
                        "Afbeelding",
                        "Patroon"
                );
        final ComboBox graphicBox = new ComboBox(graphic);
        scherm.add(graphicBox, 1, 5);
        
        //invoer opmerkingen
        Text commentText = new Text("Opmerkingen");
        scherm.add(commentText, 0, 6);
        
        TextField commentField = new TextField();
        scherm.add(commentField, 1, 6);

        //opslaan
        Button save = new Button();
        save.setText("Opslaan");
        scherm.add(save, 0,7);

        //clear
        Button clear = new Button();
        clear.setText("Leegmaken");
        scherm.add(clear, 1,7);
        clear.setOnAction(new EventHandler<ActionEvent>() {
            @Override 
            public void handle(ActionEvent event) {
                dp.setValue(null);
                airportBox.setValue(null);
                typeBagBox.setValue(null);
                brandField.setText(null);
                color1Box.setValue(null);
                color2Box.setValue(null);
                graphicBox.setValue(null);
                commentField.setText(null);
            }
        });
        
        return scherm;
    }
}
