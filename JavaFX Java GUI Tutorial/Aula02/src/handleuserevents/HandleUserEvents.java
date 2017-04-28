package handleuserevents;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author code36u4r60
 */
public class HandleUserEvents extends Application implements EventHandler<ActionEvent> {

    Button button;
    Button button2;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Title of the Window");

        button = new Button();//("Click me");
        button.setText("Click me");

        button.setOnAction(this);

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == button) {
            System.out.println("OOOOoooOOOoooo i love it when u touch me there.... ");
        }
        if (event.getSource() == button2) {
            System.out.println("You clicked button 2 ");
        }
    }

}
