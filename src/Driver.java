import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Driver extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage firstStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("GUI.fxml"));

        Scene scene = new Scene(root);
        firstStage.setTitle("JewelleryStore");
        firstStage.setScene(scene);
        firstStage.show();
    }
}
 