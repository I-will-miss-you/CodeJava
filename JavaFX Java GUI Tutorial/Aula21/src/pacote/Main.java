/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

import com.sun.javafx.scene.control.GlobalMenuAdapter;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author code3
 */
public class Main extends Application {

    Stage window;
    BorderPane layout;

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("JavaFX");

        //File Menu
        Menu fileMenu = new Menu("File");

        //Meni items
        MenuItem newFile = new MenuItem("New...");
        newFile.setOnAction(e -> System.out.println("New "));
        fileMenu.getItems().add(newFile);
        
        fileMenu.getItems().add(new MenuItem("Open.."));
        fileMenu.getItems().add(new MenuItem("Save..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Settings..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Exit..."));

        //Edit Menu
        Menu editMenu = new Menu("_Edit");
        editMenu.getItems().addAll(new MenuItem("Cut"));
        editMenu.getItems().addAll(new MenuItem("Copy"));
        
        MenuItem paste = new MenuItem("Paste");
        paste.setOnAction(e -> System.out.println("Paste "));
        paste.setDisable(true);
        editMenu.getItems().add(paste);
        
        
        //Help Menu
        Menu helpMenu = new Menu("Help");
        CheckMenuItem showLines = new CheckMenuItem("Show Line Numbers");
        showLines.setOnAction(e -> {
        if(showLines.isSelected()){
            System.out.println("Program will now display line numbers");
        }else{
            System.out.println("Giding line numbers");
        }
        });
        CheckMenuItem autoSave = new CheckMenuItem("Enable Autosave");
        autoSave.setSelected(true);
        helpMenu.getItems().addAll(showLines,autoSave);
       
        //Difficulty RadioMenuItems
        Menu difficultyMenu = new Menu("Difficulty");
        ToggleGroup difficultyToggle = new ToggleGroup();
        
        RadioMenuItem easy = new RadioMenuItem("Easy");
        RadioMenuItem medium = new RadioMenuItem("Medium");
        RadioMenuItem hard = new RadioMenuItem("Hard");
        
        easy.setToggleGroup(difficultyToggle);
        medium.setToggleGroup(difficultyToggle);
        hard.setToggleGroup(difficultyToggle);

        difficultyMenu.getItems().addAll(easy,medium,hard);
                
        
                
        
        //Main Menu Bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu,editMenu,helpMenu,difficultyMenu);

        layout = new BorderPane();
        layout.setTop(menuBar);
        Scene scene = new Scene(layout, 400, 300);
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
