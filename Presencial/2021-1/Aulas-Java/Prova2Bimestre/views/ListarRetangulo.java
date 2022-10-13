package views;

import Controllers.FormaController;
import models.Retangulo;

public class ListarRetangulo {
    public static void renderizar() {

        System.out.println("\n ****** LISTAR RETANGULOS ******");

        for(Retangulo retangulo : FormaController.listarRetangulos()) {
            System.out.print("Forma: RETANGULO: " + retangulo.CalcularArea());
        }
    }
}

