package designbuttons;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author code3
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private JFXButton disabledButton;

    @FXML
    private JFXButton raisedButton;

    @FXML
    private Label label;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        disabledButton.setDisable(false);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
