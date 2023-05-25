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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelo.Abogado;
import modelo.Cliente;

public class LoginController implements Initializable {

    @FXML
    private Button btContinuar, btNuevoUsuario;

    @FXML
    private TextField tfUsuario, tfContraseña;

    private String contraseña = "";
    private String usuario = "";

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        abogados.add(new Abogado("2", "Kevin fernando Sepulveda", "Calle 135 diagonal sur 46-34", "123", "kevinf"));
        abogados.add(new Abogado("3", "Carlos González Ruiz", "Calle 135 sur 63-53", "123", "carlosG"));
        abogados.add(new Abogado("4", "Juan García López", "Calle Primavera #10", "6346", "juanG"));
        abogados.add(new Abogado("5", "María Rodríguez Torres", "Avenida del Sol #5", "contraseña", "mariaR"));
        abogados.add(new Abogado("6", "Alejandro Martínez Herrera", "Paseo de los Pinos #3", "12345", "alejandroM"));
        clientes.add(new Cliente("7", "Hector Samuel", "Callejón de la Luna #8", "321", "hectorS"));
        clientes.add(new Cliente("8", "Laura Hernández García", "Boulevard de la Playa #2", "l4ura1993", "lauraH"));
        clientes.add(new Cliente("9", "Luis Ramírez Rodríguez", "Carrera de la Montaña #6", "1994", "luisR"));
        clientes.add(new Cliente("10", "Sofía Morales López", "Camino del Río #4", "scoth", "sofiaM"));
        clientes.add(new Cliente("11", "Pedro Castro Martínez", "Pasaje de la Estrella #1", "1442/35/34", "pedroC"));
    }

    @FXML
    public void onContinuar(ActionEvent event) throws IOException {
        usuario = tfUsuario.getText();
        contraseña = tfContraseña.getText();

        boolean fin = false;

        for (Abogado u : abogados) {
            if (u.getUsuario().equals(usuario) && u.getContraseña().equals(contraseña)) {

                AbogadosVentana2Controller.setIngreso(usuario);
                fin = true;

                FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/AbogadosVentana2.fxml"));

                Parent root = loader.load();

                Scene scene = new Scene(root);
                Stage stage = new Stage();

                stage.setScene(scene);
                stage.show();
                Stage myStage = (Stage) this.btContinuar.getScene().getWindow();
                myStage.close();
            }
        }
        for (Cliente p : clientes) {
            if (p.getUsuario().equals(usuario) && p.getContraseña().equals(contraseña)) {

                fin = true;
                AbogadosVentana2Controller.setIngreso(usuario);

                FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/AbogadosVentana2.fxml"));

                Parent root = loader.load();

                Scene scene = new Scene(root);
                Stage stage = new Stage();

                stage.setScene(scene);
                stage.show();
                Stage myStage = (Stage) this.btContinuar.getScene().getWindow();
                myStage.close();
            }
        }
        if (fin == false) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Error de contraseña o usuario");
            alert.show();
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
