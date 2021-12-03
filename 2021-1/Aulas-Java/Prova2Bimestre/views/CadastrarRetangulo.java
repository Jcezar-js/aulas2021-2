package views;

import Controllers.FormaController;
import models.Retangulo;
import utils.excecao;

public class CadastrarRetangulo {
    private static Retangulo retangulo;

    public static void renderizar() {
        retangulo = new Retangulo();

        System.out.println("\n".repeat(20));
		System.out.println("\n-- CADASTRAR RETÂNGULO --  \n");				
        retangulo.setLargura(excecao.lerInteiro("Digite a largura do retângulo: "));
        retangulo.setAltura(excecao.lerInteiro("Digite a altura do retângulo: "));
        
        FormaController.cadastrar(retangulo);
    }
}
