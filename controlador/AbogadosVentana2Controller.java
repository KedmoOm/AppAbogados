package controlador;

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;

public class AbogadosVentana2Controller implements Initializable {

    private static String ingreso;

    @FXML
    private ImageView fondo;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        Registro();

    }

    public void Registro() {
        List<String> bitacora = new ArrayList<>();
        bitacora.add(ingreso);
        Date fechaActual = new Date();

        System.out.println("---------Bitacora----------");

        for (int i = 0; i < bitacora.size(); i++) {
            System.out.println("Usuario: " + bitacora.get(i) + " Fecha de ingreso: " + fechaActual.toString());
        }
        System.out.println("-------------------------");
    }

    public static void setIngreso(String ingreso) {
        AbogadosVentana2Controller.ingreso = ingreso;
    }

}
