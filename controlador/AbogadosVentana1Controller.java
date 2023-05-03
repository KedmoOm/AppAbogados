package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AbogadosVentana1Controller implements Initializable {

    @FXML
    private Button btContinuar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void onContinuar() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/Login.fxml"));

        Parent root = loader.load();

        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.show();
        Stage myStage = (Stage) this.btContinuar.getScene().getWindow();
        myStage.close();
    }

}
