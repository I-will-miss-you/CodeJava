/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
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
       window.setTitle("JavaFX");
       
       //GridPane with 10px padding around edge
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setVgap(10);
        
        //Name Label - constrains use (child, column, row)
        Label nameLabel = new Label("Username: ");
        nameLabel.setId("bold-label");
        GridPane.setConstraints(nameLabel, 0, 0);
        
        //Name input
        TextField nameInput = new TextField("Username");
        GridPane.setConstraints(nameInput, 1, 0);
        
        
        //Password Input
        Label passLabel = new Label("Password: ");
        GridPane.setConstraints(passLabel, 0, 1);
        
        //Passord Input
        PasswordField passInput = new PasswordField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput, 1, 1);
        
        //Login
        Button loginButton = new Button("Login");
        GridPane.setConstraints(loginButton, 1, 2);
        
        //Sign Up
        Button signUpButton = new Button("Sign Up");
        signUpButton.getStyleClass().add("button-blue");
        GridPane.setConstraints(signUpButton, 1, 3);
        
        
        //Add everything to grid
        grid.getChildren().addAll(nameLabel,nameInput,passLabel,passInput,loginButton,signUpButton);
        Scene scene = new Scene(grid,300,200);
        scene.getStylesheets().add(getClass().getResource("Viper.css").toString());
        
        window.setScene(scene);
        window.setResizable(false);
        window.setOpacity(0.95);
        window.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
