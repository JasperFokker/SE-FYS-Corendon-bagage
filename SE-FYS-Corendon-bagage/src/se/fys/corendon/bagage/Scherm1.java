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
import javafx.stage.Stage;

/**
 *
 * @author jimmy
 */
public class Scherm1 extends Application
{

    @Override
    public void start(Stage primaryStage)
    {
        returnScherm();
    }

    public static GridPane returnScherm()
    {
        GridPane scherm1 = new GridPane();

        Button zoekButton = new Button();
        zoekButton.setPrefSize(750, 750);

        scherm1.setPrefSize(750, 750);
        scherm1.getChildren().addAll(zoekButton);

        return scherm1;
    }
}
