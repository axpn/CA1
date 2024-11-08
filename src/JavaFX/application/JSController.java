package JavaFX.application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Alert;
import models.DisplayCase;
import models.JewelleryStore;

public class JSController {

    private JewelleryStore jewelleryStore;
    private TextField idField;
    private ComboBox<String>  typeComboBox;
    private ComboBox<String>  lightingComboBox;
    @FXML
    private Button addNewDisplayCase;
    private Button addNewDisplayTray;
    private Button addNewJewelleryItem;
    private Label statusLabel;

    public JSController(){
        jewelleryStore = new JewelleryStore();
    }

    @FXML
    private void handleAddNewDisplayCase() {
        String id = getID();
        String type = typeComboBox.getValue();
        String lighting = lightingComboBox.getValue();

        if (id == null || type == null || lighting == null) {
            showAlert
        }
        DisplayCase displayCase = new DisplayCase(id,type,lighting);
    }

    private String getID(){
        return idField.getText();
    }
}
