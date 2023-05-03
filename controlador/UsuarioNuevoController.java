package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelo.Abogado;

public class UsuarioNuevoController implements Initializable {

    private TextField txFieldUsuario;
    private TextField txFieldNombre;
    private TextField txFieldDireccion;
    private TextField txFieldContraseña;
    private Button btGuardar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void onGuardar() throws IOException {
        Abogado abogado1 = new Abogado("123", txFieldNombre.getText(), txFieldDireccion.getText());
        abogado1.setUsuario(txFieldUsuario.getText());
        abogado1.setContraseña(txFieldContraseña.getText());

        System.out.println("datos guardados correctamente");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/Login.fxml"));

        Parent root = loader.load();

        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.show();
        Stage myStage = (Stage) this.btGuardar.getScene().getWindow();
        myStage.close();
    }
}
