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
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class UsuarioNuevoController implements Initializable {

    @FXML
    private TextField tfUsuario, tfNombre, tfDireccion, tfContraseña;

    @FXML
    private Button btGuardar;
    
    @FXML
    private CheckBox cbAbogado, cbCliente;

    private static String nombre,direccion;
    private static String contraseña = "";
    private static String usuario = "";

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    public void onGuardar(ActionEvent event) throws IOException {

        usuario = tfUsuario.getText();
        nombre = tfNombre.getText();
        direccion = tfDireccion.getText();
        contraseña = tfContraseña.getText();

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

    @FXML
    public void onCliente(ActionEvent event){
        if(cbAbogado.isSelected()){
            System.out.println("el otro boton ya esta seleccionado");
            cbAbogado.setSelected(false);
        }
    }
    
    @FXML
    public void onAbogado(ActionEvent event){
        if(cbCliente.isSelected()){
            System.out.println("el otro boton ya esta seleccionado");
            cbCliente.setSelected(false);
        }
    }
    
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
    }
}
