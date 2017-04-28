package pacote;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author code3
 */
/**
 *
 * @author code36u4r60
 */
public class Main extends Application {

    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        window.setTitle("Buck's Meat Subs");

        //CheckBoxes
        CheckBox box1 = new CheckBox("Bacon");
        CheckBox box2 = new CheckBox("Tuna");
        box2.setSelected(true);
        
        //Button
        button = new Button("Order Now!");
        button.setOnAction(e -> handleOptions(box1,box2));
        
        //Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(box1,box2,button);

        scene = new Scene(layout, 300, 300);
        window.setScene(scene);
        window.show();
    }

    //Handel checbox options
    private void handleOptions(CheckBox ... box){
       StringBuilder str = new StringBuilder("Users Order:\n");
        for (CheckBox checkBox : box) {
            if(checkBox.isSelected()){
                str.append(checkBox.getText());
                str.append(";\n");
            }
        } 
        System.out.println(str);
    }
}
