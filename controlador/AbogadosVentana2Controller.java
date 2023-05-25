package controlador;

import static controlador.UsuarioNuevoController.abogados;
import static controlador.UsuarioNuevoController.clientes;
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
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import modelo.Abogado;
import modelo.Asunto;
import modelo.Cliente;

public class AbogadosVentana2Controller implements Initializable {

    private static String ingresoUsuario;

    static List<String> bitacora = new ArrayList<>();

    @FXML
    private RadioButton rbAsunto1;

    @FXML
    private TextArea txArea;

    @FXML
    private Button btRegresar, btNuevo, btEditar;

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
        System.out.println("Nuevo asunto creado");

        RadioButton radioButton = new RadioButton("Nuevo Asunto");

        radioButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txArea.setText("Asunto vacio");
                AbogadosVentana3Controller a =new AbogadosVentana3Controller();
                a.setTextArea("Asunto vacio");
            }
        });

        vbAsuntos.getChildren().add(radioButton);
    }
    
    @FXML
    public void onAsunto1(ActionEvent event) {
        Asunto s = new Asunto("432", "pendiente", "12 de agosto de 1993", " el 5 de febrero de 1999");

        Cliente c = clientes.get(0);
        Abogado a = abogados.get(0);

        String mensaje = s.consultarAsunto(c, a);
        txArea.setText(mensaje);
        AbogadosVentana3Controller ab =new AbogadosVentana3Controller();
        ab.setTextArea(mensaje);
    }
    
    @FXML
    public void onEditar(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/AbogadosVentana3.fxml"));

        Parent root = loader.load();

        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.show();
        Stage myStage = (Stage) this.btEditar.getScene().getWindow();
        myStage.close();
    }

    public void Registro() {
        Date fechaActual = new Date();
        bitacora.add("Usuario: " + ingresoUsuario + ", Fecha de ingreso: " + fechaActual.toString());

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
