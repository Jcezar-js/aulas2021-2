package views;

import utils.excecao;
import Controllers.FormaController;
import models.circulo;

public class CadastrarCirculo {
    private static circulo Circulo;

    public static void renderizar() {
        Circulo = new circulo();

        System.out.println("\n".repeat(20));
        System.out.println("\n-- CADASTRAR CIRCULO --  \n");
        Circulo.setRaio(excecao.lerInteiro("Digite o raio do CIRCULO: "));

        FormaController.cadastrar(Circulo);
    }
}
