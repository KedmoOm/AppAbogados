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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class AbogadosVentana3Controller implements Initializable {

    @FXML
    private TextArea txArea2;

    @FXML
    private DatePicker dpInicio, dpFinalizado;

    @FXML
    private Button btRegresar, btGuardar;

    @FXML
    private ComboBox cbAbogado, cbCliente;

    @FXML
    private MenuButton mbAsunto;

    private static String asunto;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txArea2.setText(asunto);
    }

    @FXML
    private void onRegresar(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/AbogadosVentana2.fxml"));

        Parent root = loader.load();

        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.show();
        Stage myStage = (Stage) this.btRegresar.getScene().getWindow();
        myStage.close();
    }

    @FXML
    private void onGuardar(ActionEvent event) throws IOException {
        String asunto = mbAsunto.getText();
        String fInicio = dpInicio.getValue().toString();
        String fFinalizado = dpFinalizado.getValue().toString();
        System.out.println("Datos guardados");
        System.out.println("Asunto: " + asunto + ", Fecha de inicio: " + fInicio + ", Fecha de Finalizacion: " + fFinalizado);
    }

    public void setTextArea(String texto) {
        asunto = texto;
    }

}
