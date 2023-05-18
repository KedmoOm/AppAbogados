package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelo.Abogado;
import modelo.Cliente;

public class UsuarioNuevoController implements Initializable {

    @FXML
    private TextField tfUsuario, tfNombre, tfDireccion, tfContraseña;

    @FXML
    private Button btGuardar;

    @FXML
    private CheckBox cbAbogado, cbCliente;

    private static String nombre, direccion;
    private static String contraseña = "";
    private static String usuario = "";

    private boolean opcion;

    static ArrayList<Abogado> abogados = new ArrayList<>();
    static ArrayList<Cliente> clientes = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle rb) {}

    @FXML
    public void onGuardar(ActionEvent event) throws IOException {

        usuario = tfUsuario.getText();
        nombre = tfNombre.getText();
        direccion = tfDireccion.getText();
        contraseña = tfContraseña.getText();

        if (usuario.isEmpty() || contraseña.isEmpty() || direccion.isEmpty() || nombre.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING, "Campos sin rellenar");
            alert.show();
        } else {
            if (opcion) {
                abogados.add(new Abogado("123", nombre, direccion, contraseña, usuario));
            } else {
                clientes.add(new Cliente("123",nombre,direccion,contraseña,usuario));
            }
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/Login.fxml"));

            Parent root = loader.load();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();
            Stage myStage = (Stage) this.btGuardar.getScene().getWindow();
            myStage.close();
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Datos guardados correctamente");
            alert.show();
        }
    }

    @FXML
    public void onCliente(ActionEvent event) {
        if (cbAbogado.isSelected()) {
            System.out.println("el otro boton ya esta seleccionado");
            cbAbogado.setSelected(false);
            opcion = true;
        }
        tfUsuario.setDisable(false);
        tfContraseña.setDisable(false);
        tfDireccion.setDisable(false);
        tfNombre.setDisable(false);
        btGuardar.setDisable(false);
    }

    @FXML
    public void onAbogado(ActionEvent event) {
        if (cbCliente.isSelected()) {
            System.out.println("el otro boton ya esta seleccionado");
            cbCliente.setSelected(false);
            opcion = false;
        }
        tfUsuario.setDisable(false);
        tfContraseña.setDisable(false);
        tfDireccion.setDisable(false);
        tfNombre.setDisable(false);
        btGuardar.setDisable(false);
    }

    /*
    public static String getNombre() {
        return nombre;
    }

    public static String getDireccion() {
        return direccion;
    }

    public static String getContraseña() {
        return contraseña;
    }

    public static String getUsuario() {
        return usuario;
    }*/
}
