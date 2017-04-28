package aula06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author code36u4r60
 */
public class Aula06 extends Application {

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
        button.setOnAction(e -> {
            boolean result = ConfirmBox.display("Title of Window", "Are you sure you want to send naked pics?");
            System.out.println(result);
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();
    }

}
