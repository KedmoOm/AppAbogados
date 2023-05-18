package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AbogadosVentana2Controller implements Initializable {

    private static String ingresoUsuario;

    static List<String> bitacora = new ArrayList<>();

    @FXML
    private Button btRegresar, btNuevo;

    @FXML
    private VBox vbAsuntos;

    @FXML
    private ImageView fondo;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Registro();
    }

    @FXML
    public void onRegresar(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/Login.fxml"));

        Parent root = loader.load();

        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.show();
        Stage myStage = (Stage) this.btRegresar.getScene().getWindow();
        myStage.close();
    }

    @FXML
    public void onNuevo(ActionEvent event) {
        System.out.println("nuevo asunto creado");

        RadioButton radioButton = new RadioButton("Nuevo Asunto");

        radioButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("ejecutando asunto nuevo");
            }
        });

        vbAsuntos.getChildren().add(radioButton);
    }

    public void Registro() {
        Date fechaActual = new Date();
        bitacora.add("Usuario: " + ingresoUsuario+ ", Fecha de ingreso: " + fechaActual.toString());

        System.out.println("---------Bitacora----------");

        for (int i = 0; i < bitacora.size(); i++) {
            System.out.println(bitacora.get(i));
        }
        System.out.println("-------------------------");
    }

    public static void setIngreso(String ingreso) {
        AbogadosVentana2Controller.ingresoUsuario = ingreso;
    }

}
