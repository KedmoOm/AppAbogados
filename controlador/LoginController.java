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

public class LoginController implements Initializable {

    //private UsuarioNuevoController usuarioN;

    private Button btContinuar;
    private Button btNuevoUsuario;

    private TextField txFieldUsuario;
    private TextField txFieldContraseña;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void onContinuar() throws IOException {
        String a = txFieldUsuario.getText();
        System.out.println(a);
        String b = txFieldContraseña.getText();

        //Abogado abogado1; buscar la manera de recuperar los datos
        if (a == "admin" && b == "admin") {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/AbogadosVentana2.fxml"));

            Parent root = loader.load();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();
            Stage myStage = (Stage) this.btContinuar.getScene().getWindow();
            myStage.close();
        } else {
            System.out.println("Opcion incorrecta");
        }
    }

    @FXML
    private void onNuevoUsuario() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/usuarioNuevo.fxml"));

        Parent root = loader.load();

        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.show();
        Stage myStage = (Stage) this.btContinuar.getScene().getWindow();
        myStage.close();
    }
}
