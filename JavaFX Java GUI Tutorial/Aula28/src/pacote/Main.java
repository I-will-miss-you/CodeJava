/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author code36u4r60
 */
public class Main extends Application {
    
    Stage window;
    Button button;
    
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("JavaFX");
        
        Person bucky = new Person();
        bucky.firstNameProperty().addListener(
                (v, oldValue, newValue) -> {
                    System.out.println(" Name chenged to " + newValue);
                    System.out.println(" First name Property: " + bucky.firstNameProperty());
                    System.out.println(" Get First Name: " + bucky.getFirstName());
                }
        );
        
        button = new Button("Submit");
        button.setOnAction(e -> bucky.setFirstName("Porky"));
        
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
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
