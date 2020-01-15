package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Navigation {

    private final Stage stage;
    private final Scene scene;

    public Navigation(Stage stage)
    {
        this.stage = stage;
        scene = new Scene(new Pane());
        stage.setMaxHeight(400);
        stage.setMaxWidth(600);
        stage.setResizable(false);
        stage.setScene(scene);
    }

    public Controller load(String sUrl)
    {
        try {

            //loads the fxml file
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(sUrl));
            Node root = fxmlLoader.load();

            Controller controller = fxmlLoader.getController();
            controller.setView(root);

            return controller;

        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void Show(Controller controller)
    {
        try {
            scene.setRoot((Parent) controller.getView());
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}