package views;

import Controllers.FormaController;
import models.triangulo;

public class ListarTriangulo {
    public static void renderizar() {

        System.out.println("\n ****** LISTAR TRIANGULOS ******");

        for(triangulo Triangulo : FormaController.listarTriangulos()) {
            System.out.print("Forma: TRIANGULO: " + Triangulo.CalcularArea());
        }
    }
}

