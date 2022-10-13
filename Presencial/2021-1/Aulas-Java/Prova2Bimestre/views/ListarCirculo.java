package views;

import Controllers.FormaController;
import models.circulo;

public class ListarCirculo {
    public static void renderizar() {

        System.out.println("\n ****** LISTAR CIRCULOS ******");

        for(circulo Circulos : FormaController.listarCirculos()) {
            System.out.print("Forma: CIRCULO: " + Circulos.CalcularArea());
        }
    }
}

