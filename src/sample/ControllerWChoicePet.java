package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ControllerWChoicePet extends BaseController implements Initializable {

    public static final String URL_FXML = "WindowChoicePet.fxml";

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView imageCat;

    @FXML
    private ImageView imageDog;

//    public static String getAnimal() {
//        return animal;
//    }
//
//    public static void setAnimal(String animal) {
//        ControllerWChoicePet.animal = animal;
//    }
//
//    private static String animal = null;
    static AnimalCat animalCat;

    @FXML
    void initializeCat(MouseEvent event) {
        //animal = "cat";
        ControllerWChoiceAge.setAgeMax(28);
        animalCat = new AnimalCat();
        choiceCast();
    }

    @FXML
    void initializeDog(MouseEvent event) {
        Main.getNavigation().load(ControllerChoiceDog.URL_FXML).Show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    protected void choiceCast() {
        ControllerWChoiceAge controllerWChoiceAge = (ControllerWChoiceAge) Main.getNavigation().load(ControllerWChoiceAge.URL_FXML);
        controllerWChoiceAge.Show();
    }
}
