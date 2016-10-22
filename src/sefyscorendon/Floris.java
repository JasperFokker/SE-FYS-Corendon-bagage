package sefyscorendon;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
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
        
//        scherm.setAlignment(Pos.CENTER);
        scherm.setHgap(10);
        scherm.setVgap(10);
        scherm.setPadding(new Insets(25, 25, 25, 25));
        
        //datum
        Label dateLabel = new Label("Datum");
        scherm.add(dateLabel, 0, 0, 2, 1);

        
        DatePicker dp = new DatePicker();
        scherm.add(dp, 1, 0);

        //luchthaven
        Label airportLabel = new Label("Luchthaven");
        scherm.add(airportLabel, 0, 1);
        
        ObservableList<String> airport
                = FXCollections.observableArrayList(
                        "AMS",
                        "ADA",
                        "KYA"
                );
        final ComboBox airportBox = new ComboBox(airport);
        scherm.add(airportBox, 1, 1);

        //combobox soort
        Label typeBagLabel = new Label("Soort");
        scherm.add(typeBagLabel, 0, 2);

        ObservableList<String> typeBag
                = FXCollections.observableArrayList(
                        "Tas",
                        "Koffer",
                        "Zak"
                );
        final ComboBox typeBagBox = new ComboBox(typeBag);
        scherm.add(typeBagBox, 1, 2);

        //invoer merk
        Label brandLabel = new Label("Merk");
        scherm.add(brandLabel, 0, 3);

        TextField brandField = new TextField();
        scherm.add(brandField, 1, 3);

        //comboboxes kleur
        Label color1Label = new Label("Kleur 1");
        scherm.add(color1Label, 0, 4);
        
        ObservableList<String> color
                = FXCollections.observableArrayList(
                        "Rood",
                        "Blauw",
                        "Geel"
                );
        final ComboBox color1Box = new ComboBox(color);
        scherm.add(color1Box, 1, 4);
        
        Label color2Label = new Label("Kleur 2");
        scherm.add(color2Label, 2, 4);
        
        final ComboBox color2Box = new ComboBox(color);
        scherm.add(color2Box, 3, 4);
        
        //combobox opdruk
        Label graphicLabel = new Label ("Opdruk");
        scherm.add(graphicLabel, 0, 5);
        
        ObservableList<String> graphic
                = FXCollections.observableArrayList(
                        "Effen kleur",
                        "Afbeelding",
                        "Patroon"
                );
        final ComboBox graphicBox = new ComboBox(graphic);
        scherm.add(graphicBox, 1, 5);
        
        //invoer opmerkingen
        Label commentLabel = new Label("Opmerkingen");
        scherm.add(commentLabel, 0, 6);
        
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
