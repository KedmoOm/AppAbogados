package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController implements Initializable {

    @FXML
    private Button btContinuar, btNuevoUsuario;

    @FXML
    private TextField tfUsuario, tfContraseña;

    private String usuario;
    private String contraseña;

    private String a;
    private String b;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    public void onContinuar(ActionEvent event) throws IOException {

        a = tfUsuario.getText();
        b = tfContraseña.getText();

        if (a.equals("admin") && b.equals("admin")) {
            
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/AbogadosVentana2.fxml"));

                Parent root = loader.load();

                Scene scene = new Scene(root);
                Stage stage = new Stage();

                stage.setScene(scene);
                stage.show();
                Stage myStage = (Stage) this.btContinuar.getScene().getWindow();
                myStage.close();
        }

        usuario = UsuarioNuevoController.getUsuario();
        System.out.println("valo de usuario: " + usuario);
        
        contraseña = UsuarioNuevoController.getContraseña();
        System.out.println("valo de usuario: " + contraseña);

        if (usuario.equals(a) && contraseña.equals(b)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/AbogadosVentana2.fxml"));

            Parent root = loader.load();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();
            Stage myStage = (Stage) this.btContinuar.getScene().getWindow();
            myStage.close();
        } else {
            System.out.println("Error de contraseña o usuario");
        }
    }

    @FXML
    public void onNuevoUsuario(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/usuarioNuevo.fxml"));

        Parent root = loader.load();

        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.show();
        Stage myStage = (Stage) this.btNuevoUsuario.getScene().getWindow();
        myStage.close();
    }
}
