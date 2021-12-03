package views;

import utils.excecao;
import Controllers.FormaController;
import models.triangulo;

public class CadastrarTriangulo {
    private static triangulo Triangulo;

    public static void renderizar() {
        Triangulo = new triangulo();

        System.out.println("\n".repeat(20));
		System.out.println("\n-- CADASTRAR TRIÂNGULO --  \n");				
        Triangulo.setBase(excecao.lerInteiro("Digite a Base do TRIÂNGULO: "));
        Triangulo.setAltura(excecao.lerInteiro("Digite a altura do TRIÂNGULO: "));
        
        FormaController.cadastrar(Triangulo);
    }
}
