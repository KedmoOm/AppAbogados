package controlador;
//import modelo.Abogado;
//import modelo.Asunto;
//import modelo.Cliente;
//import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    // Scanner leer = new Scanner(System.in);
    //private int op;
    //  Cliente cliente1;
    //  Abogado abogado;
    // Asunto asunto1;
    // private Abogado[] abogados =new Abogado[3];
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/vista/AbogadosVentana1.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    /*
    public void menu() {
        abogados[0] =new Abogado("234", "Pérez","carrera 59");
        abogado = abogados[0];
        
        do {
            System.out.println("=======menu=======");
            System.out.println("1) Crear cliente");
            System.out.println("2) Consultar asunto");
            System.out.println("3) Finalizar programa");

            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese el nombre del cliente");
                    String n = leer.nextLine();
                    String p = leer.nextLine();
                    System.out.println("Ingrese la direccion del cliente");
                    String d = leer.nextLine();

                    System.out.println("Ingrese el estado del asunto del cliente: " + p);
                    String e = leer.nextLine();
                    System.out.println("Fecha de inicio");
                    String i = leer.nextLine();
                    System.out.println("Fecha que finalizo");
                    String f = leer.nextLine();
                    
                    Cliente cliente = new Cliente("234", p, d, "5463",e,i,f);
                    this.cliente1 = cliente;  
                    
                    break;
                case 2:
                    asunto1 = cliente1.getAsunto1();
                    asunto1.consultarAsunto(cliente1, abogado);
                    break;
                case 3:
                    System.out.println("Fin del programa");
                    op = -1;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (op != -1);
    }*/
}
