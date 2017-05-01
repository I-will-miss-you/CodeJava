package pacote;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author code3
 */
public class Main extends Application {

    Stage window;

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Java FX");
        
        //Input labels
        TextField userInput = new TextField();
        userInput.setMaxWidth(200);
        Label firstLabel = new Label("Welcome to the site ");
        Label secondLabel = new Label();
        
        HBox bootomText = new HBox(firstLabel,secondLabel);
        bootomText.setAlignment(Pos.CENTER);
        
        secondLabel.textProperty().bind(userInput.textProperty());
        
        
        VBox vBox = new VBox(10, userInput,bootomText);
        vBox.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(vBox,300,200);
        window.setScene(scene);
        window.show();
        

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
