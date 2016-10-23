package sefyscorendon;

import java.awt.Color;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Thom
 */
public class WelkomScherm extends Application {

    @Override
    public void start(Stage primaryStage) {
        returnScherm();
    }

    public static GridPane returnScherm() {
        GridPane scherm = new GridPane();
        scherm.setPrefSize(600, 450);
        scherm.setHgap(10);
        scherm.setVgap(10);
        scherm.setPadding(new Insets(50, 25, 25, 25));

        Text welkombericht1 = new Text();
        welkombericht1.setText("Welkom bij het");
        welkombericht1.setFont(Font.font("Verdana", 36));
        
        Text welkombericht2 = new Text();
        welkombericht2.setText("Corendon bagagesysteem.");
        welkombericht2.setFont(Font.font("Verdana", 36));
        
        scherm.add(welkombericht1, 1, 10);
        scherm.add(welkombericht2, 1, 12);

        return scherm;
    }
}
