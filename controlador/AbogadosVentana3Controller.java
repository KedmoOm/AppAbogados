package controlador;

import static controlador.UsuarioNuevoController.abogados;
import static controlador.UsuarioNuevoController.clientes;
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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import modelo.Abogado;
import modelo.Asunto;
import modelo.Cliente;

public class AbogadosVentana3Controller implements Initializable {

    @FXML
    private TextArea txArea2;

    @FXML
    private DatePicker dpInicio, dpFinalizado;

    @FXML
    private Button btRegresar, btGuardar;

    @FXML
    private ComboBox cbAbogado, cbCliente, cbAsunto;

    private static String asunto;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txArea2.setText(asunto);
        for (Abogado u : abogados) {
            cbAbogado.getItems().add(u.getNombre());
        }
        for (Cliente p : clientes) {
            cbCliente.getItems().add(p.getNombre());
        }
        cbAsunto.getItems().addAll("En proceso", "Finalizado");
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
        String asunto = cbAsunto.getValue().toString();
        String fInicio = dpInicio.getValue().toString();
        String fFinalizado = dpFinalizado.getValue().toString();
        String ab = cbAbogado.getValue().toString();
        String cl = cbCliente.getValue().toString();

        System.out.println("Datos guardados");
        System.out.println("Asunto: " + asunto + ", Fecha de inicio: " + fInicio + ", Fecha de Finalizacion: " + fFinalizado);
        System.out.println("abogado elegido:" + cbAbogado.getValue().toString() + ", cliente elegido: " + cbCliente.getValue().toString());

        Asunto s = new Asunto("4321", asunto, fInicio, fFinalizado);

        Abogado temp1 = null;
        Cliente temp2 = null;

        for (Abogado u : abogados) {
            if (u.getNombre().equals(ab)) {
                temp1 = u;
            }
        }
        for (Cliente d : clientes) {
            if (d.getNombre().equals(cl)) {
                temp2 = d;
            }
        }
        txArea2.setText(s.consultarAsunto(temp2, temp1));
    }

    public void setTextArea(String texto) {
        asunto = texto;
    }
}
