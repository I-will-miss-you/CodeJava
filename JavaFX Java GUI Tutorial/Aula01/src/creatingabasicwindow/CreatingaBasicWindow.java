package creatingabasicwindow;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author code36u4r60
 */
public class CreatingaBasicWindow extends Application {

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Title of the Window");

        button = new Button();//("Click me");
        button.setText("Click me");

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
    
        Scene scene = new Scene(layout,300,250);
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }

}
