package views;

import Controllers.FormaController;
import models.*;


public class ListarTudo {
    public static void renderizar() {

        System.out.println("\n ====== LISTAR RETANGULOS ======");

        for (Retangulo retangulos : FormaController.listarRetangulos()) {
            System.out.println("Forma: Retangulo: " + retangulos.CalcularArea());
        }
        for(triangulo Triangulo : FormaController.listarTriangulos()) {
            System.out.println("Forma: TRIANGULO: " + Triangulo.CalcularArea());
        }
        for(circulo Circulos : FormaController.listarCirculos()) {
            System.out.println("Forma: CIRCULO: " + Circulos.CalcularArea());
        }
    }
}
