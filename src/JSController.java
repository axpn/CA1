import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import models.DisplayCase;
import models.DisplayTray;


public class JSController {

    @FXML
    private TextField caseIdField;
    @FXML
    private TextField typeField;
    @FXML
    private TextField lightingField;

    @FXML
    private void handleAddNewDisplayCase() {

        String caseId = caseIdField.getText();
        String type = typeField.getText();
        String lighting = lightingField.getText();

        if (caseId.isEmpty() || type.isEmpty() || lighting.isEmpty()) {
            showAlert(AlertType.ERROR, "INPUT ERROR", "CAN'T BE EMPTY");
            return;
        }

        DisplayCase newDisplayCase = new DisplayCase(caseId, type, lighting);

        System.out.println("Successfully added new display case" + newDisplayCase);

        showAlert(AlertType.INFORMATION, "Successfully", "Added new display case!");
    }



    @FXML
    private TextField trayIdField;
    @FXML
    private TextField materialColorField;
    @FXML
    private TextField widthField;
    @FXML
    private TextField depthField;

    @FXML
    private void handleAddNewDisplayTray(){


        String trayId = trayIdField.getText();
        String materialColor = materialColorField.getText();
        String widthText = widthField.getText();
        String depthText = depthField.getText();

        if (trayId.isEmpty() || materialColor.isEmpty() || widthText.isEmpty() || depthText.isEmpty()) {
            showAlert(AlertType.ERROR, "INPUT ERROR", "CAN'T BE EMPTY");
            return;
        }

        //GPT, otherwise there will be data type conflicts
        double width, depth;
        try {
            width = Double.parseDouble(widthText);
            depth = Double.parseDouble(depthText);
        } catch (NumberFormatException e) {
            showAlert(AlertType.ERROR, "输入错误", "宽度和深度必须是数字！");
            return;
        }

        DisplayTray newDisplayTray = new DisplayTray(trayId,materialColor,width,depth);

        showAlert(AlertType.INFORMATION, "Successfully", "Added new display tray!");
    }



    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

}
