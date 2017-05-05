/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 *
 * @author code3
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private JFXTextField user;

    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXButton login;

    @FXML
    private JFXButton signup;

    @FXML
    void makeLogin(ActionEvent event) {
        String username = user.getText();
        String pass = password.getText();
        if (username.equals("Username") && pass.equals("Password")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong Pass");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
