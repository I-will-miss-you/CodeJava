/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materialslider;

import com.jfoenix.controls.JFXSlider;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author code3
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private AnchorPane background;

    @FXML
    private Pane adcd;

    @FXML
    private JFXSlider red;

    @FXML
    private JFXSlider green;

    @FXML
    private JFXSlider blue;

    @FXML
    private void clicked(MouseEvent event) {
        double r = red.getValue();
        double g = green.getValue();
        double b = blue.getValue();
        System.out.println("Clicked");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
