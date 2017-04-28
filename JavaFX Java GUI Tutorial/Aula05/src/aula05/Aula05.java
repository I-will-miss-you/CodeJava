
package aula05;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 *
 * @author code36u4r60
 */
public class Aula05 extends Application{

    Stage window;
    Button button;
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("the new boston");
        
        button = new Button("Click me");
        button.setOnAction(e -> AlertBox.display("Title of Window", "Wow this alert box is awesome!"));
        
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout,300,200);
        window.setScene(scene);
        window.show();
    }
    
}
