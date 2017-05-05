/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputvalidation;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.NumberValidator;
import com.jfoenix.validation.RequiredFieldValidator;
import com.sun.javafx.scene.control.skin.FXVK;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author code3
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private JFXTextField name;

    @FXML
    private JFXTextField job;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        RequiredFieldValidator validator = new RequiredFieldValidator();
        NumberValidator numValidator = new NumberValidator();

        job.getValidators().add(numValidator);
        numValidator.setMessage("Only Number are supported");
        job.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if (!newValue) {
                    job.validate();
                }
            }
        });

        name.getValidators().add(validator);
        validator.setMessage("No Input Given");
        name.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if (!newValue) {
                    name.validate();
                }
            }
        });

        Image icon = new Image(getClass().getResource("Error25.png").toString());
        validator.setIcon(new ImageView(icon));
        numValidator.setIcon(new ImageView(getClass().getResource("Error25.png").toString()));
    }

}
