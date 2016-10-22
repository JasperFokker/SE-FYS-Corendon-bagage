package sefyscorendon;

import java.util.Objects;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.text.Font;

/**
 *
 * @author Rick
 */
public class Rick extends Application {

    @Override
    public void start(Stage primaryStage) {

        returnScherm();
    }

    public static GridPane returnScherm() {

        //Zoekscherm met dropdown boxen en textfield
        GridPane scherm = new GridPane();
        scherm.setPrefSize(600, 450);
        scherm.setHgap(1);
        scherm.setVgap(10);
        scherm.setPadding(new Insets(25, 25, 25, 25));

        //Inhoud 1e combobox
        ObservableList<String> options = FXCollections.observableArrayList(
                "Samsonite",
                "Lacoste",
                "SuperTrash",
                "Visconti",
                "Converse"
        );
        //Inhoud 2e combobox
        ObservableList<String> kleuren = FXCollections.observableArrayList(
                "Blauw",
                "Rood",
                "Zwart",
                "Bruin",
                "Paars"
        );

        //Labels, Textvelden, buttons en comboboxen.
        final ComboBox comboBoxMerk = new ComboBox(options);
        final ComboBox comboBoxKleur = new ComboBox(kleuren);

        TextField textveld = new TextField();

        TextField textveld4 = new TextField();
        textveld4.setPromptText("In Kilogrammen");

        Label label = new Label();
        label.setText("Naam:");

        Label label2 = new Label();
        label2.setText("Merk:");

        Label label3 = new Label();
        label3.setText("Kleur:");

        Label label4 = new Label();
        label4.setText("Gewicht:");

        Button btn = new Button("Zoek");

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textveld.setText(null);
                comboBoxMerk.setValue(null);
                comboBoxKleur.setValue(null);
                textveld4.setText(null);
                SeFYSCORENDON.change(Rick.returnScherm2());

            }
        });

        //Dit kan korter, geen idee hoe.
        scherm.add(label, 0, 0);
        scherm.add(label2, 0, 1);
        scherm.add(label3, 0, 2);
        scherm.add(label4, 0, 3);
        scherm.add(textveld, 1, 0);
        scherm.add(comboBoxMerk, 1, 1);
        scherm.add(comboBoxKleur, 1, 2);
        scherm.add(textveld4, 1, 3);
        scherm.add(btn, 1, 4);

        return scherm;
    }

    public static GridPane returnScherm2() {
        //Tabelscherm dat linkt naar Tabeldata.java 
        GridPane scherm2 = new GridPane();
        scherm2.setPrefSize(600, 450);

        ObservableList<Tabeldata> data = FXCollections.observableArrayList(
                new Tabeldata("Anna de Bruin", "Samsonite", "Blauw", "17 KG"),
                new Tabeldata("Johann Visser", "Visconti", "Zwart", "21 KG"),
                new Tabeldata("Robin van Dijk", "Lacoste", "Rood", "24 KG"),
                new Tabeldata("Melissa Watergang", "SuperTrash", "Paars", "15 KG"),
                new Tabeldata("Dennis Bakker", "Converse", "Bruin", "12 KG")
        );

        final Label label = new Label("Zoekresultaten");
        label.setFont(new Font("Arial", 18));
        GridPane.setHalignment(label, HPos.CENTER);

        final TableView table = new TableView();
        table.setEditable(true);
        table.setPrefWidth(600);
        table.setPrefHeight(450);

        //Dit werkt, vraag me niet hoe.
        TableColumn naamCol = new TableColumn("Naam");
        naamCol.setCellValueFactory(new PropertyValueFactory<Tabeldata, String>("Naam"));

        TableColumn merkCol = new TableColumn("Merk");
        merkCol.setCellValueFactory(new PropertyValueFactory<Tabeldata, String>("Merk"));

        TableColumn kleurCol = new TableColumn("Kleur");
        kleurCol.setCellValueFactory(new PropertyValueFactory<Tabeldata, String>("Kleur"));

        TableColumn gewichtCol = new TableColumn("Gewicht");
        gewichtCol.setCellValueFactory(new PropertyValueFactory<Tabeldata, String>("Gewicht"));

        //Verdeeld de colommen gelijk over de gridpane.
        naamCol.prefWidthProperty().bind(table.widthProperty().multiply(0.25));
        merkCol.prefWidthProperty().bind(table.widthProperty().multiply(0.25));
        kleurCol.prefWidthProperty().bind(table.widthProperty().multiply(0.25));
        gewichtCol.prefWidthProperty().bind(table.widthProperty().multiply(0.246));

        table.setItems(data);
        table.getColumns().addAll(naamCol, merkCol, kleurCol, gewichtCol);

        scherm2.add(label, 0, 0);
        scherm2.add(table, 0, 1);

        return scherm2;

    }

}
