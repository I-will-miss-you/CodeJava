/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author code3
 */
public class Controller implements Initializable {

    public Button button;
    public ToggleGroup toggleGroup;

    public void handleButtonClick() throws NoSuchFieldException {
        System.out.println("Run some code the user doesn't see");
        button.setText("Stop touching me!");

        RadioButton selectedRadioButton = (RadioButton) toggleGroup.getSelectedToggle();
        String toogleGroupValue = selectedRadioButton.getText();
        System.out.println(toogleGroupValue);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Loanding user data...");
    }

}
