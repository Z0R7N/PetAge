package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class ControllerChoiceDog extends BaseController implements Initializable {

    public static final String URL_FXML = "WindowChoiceDog.fxml";

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView imgDogSmll;

    @FXML
    private ImageView imgDogMed;

    @FXML
    private ImageView imgDogBig;

    @FXML
    private Button buttonBack;

    @FXML
    void initializeBig(MouseEvent event) {
        setAnimal("DogBig");
        choiceCast();
    }

    @FXML
    void initializeMed(MouseEvent event) {
        setAnimal("DogMed");
        choiceCast();
    }

    @FXML
    void initializeSmall(MouseEvent event) {
        setAnimal("DogSmall");
        choiceCast();
    }

    @FXML
    void keyEnter(KeyEvent event) {
        Main.getNavigation().load(ControllerWChoicePet.URL_FXML).Show();
    }

    public static String getAnimal() {
        return animal;
    }

    public static void setAnimal(String animal) {
        ControllerChoiceDog.animal = animal;
    }

    private static String animal;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        buttonBack.setOnAction(event -> {
            Main.getNavigation().load(ControllerWChoicePet.URL_FXML).Show();
        });
    }

    protected void choiceCast() {
        ControllerWChoiceAge controllerWChoiceAge = (ControllerWChoiceAge) Main.getNavigation().load(ControllerWChoiceAge.URL_FXML);
        ControllerWChoiceAge.setPet(animal);
        controllerWChoiceAge.Show();
    }
}
