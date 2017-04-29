package pacote;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBoxTreeItem;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
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
    TreeView<String> tree;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("JavaFX");
       
        TreeItem<String> root , bucky , megan;
        
        //Root
        root = new TreeItem<>();
        root.setExpanded(true);
        
        //Bucky
        bucky = makeBranch("Bucky" , root);
        makeBranch("thenewboston", bucky);
        makeBranch("YouTube", bucky);
        makeBranch("Chicken", bucky);

        //Megan
         megan = makeBranch("Megan" , root);
        makeBranch("Glitter", megan);
        makeBranch("Makeup", megan);
        
        //Create tree
        tree = new TreeView<>(root);
        tree.setShowRoot(false);
        tree.getSelectionModel()
                .selectedItemProperty()
                .addListener(
                        (v, oldValue, newValue) -> {
                            if(newValue != null){
                                System.out.println(newValue.getValue());
                            }
                        });

        //Layout
        StackPane layout = new StackPane();
        layout.getChildren().add(tree);
        Scene scene = new Scene(layout, 300, 300);
        window.setScene(scene);
        window.show();
    }

    //Create branches
    public TreeItem<String> makeBranch(String title, TreeItem<String> parent){
        TreeItem<String> item = new CheckBoxTreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }



}
