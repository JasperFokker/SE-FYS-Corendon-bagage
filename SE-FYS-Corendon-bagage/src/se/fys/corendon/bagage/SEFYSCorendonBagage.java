package se.fys.corendon.bagage;

import java.awt.Button;
import java.awt.Label;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author jimmy
 */
public class SEFYSCorendonBagage extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        GridPane root = Scherm1.returnScherm();
        VBox rootUI = UI.returnScherm();
        
        //Scene scene = new Scene(rootUI);
        Scene scene = new Scene(new HBox((VBox)rootUI, root), 1000, 750);
        
        primaryStage.setTitle("Main Screen");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }    
}
