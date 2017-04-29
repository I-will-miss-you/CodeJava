package pacote;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sun.security.pkcs11.wrapper.Constants;

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
    ListView<String> listView;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
         window.setTitle("JavaFX");
        button = new Button("Submit");

        listView = new ListView<>();
        listView.getItems().addAll(
                "Iron Man",
                "Titanic",
                "Contact",
                "Surrogates"
        );
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        button.setOnAction(e -> buttonClicked());

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(listView, button);

        scene = new Scene(layout, 300, 300);
        window.setScene(scene);
        window.show();
    }

    private void buttonClicked() {
        StringBuilder str = new StringBuilder();
        ObservableList<String> movies;
        movies = listView.getSelectionModel().getSelectedItems();

        movies.forEach((m) -> {
            str.append(m).append("\n");
        });

        System.out.println(str);
    }

}
