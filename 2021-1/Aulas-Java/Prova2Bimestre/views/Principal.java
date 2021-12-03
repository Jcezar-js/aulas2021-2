package views;

import java.util.Scanner;

public class Principal {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int op;

		do {
			System.out.println("\n-- CADASTRO DE FORMAS GEOMÉTRICAS --  ");
			System.out.println("\n1 - Cadastrar Retângulo");
			System.out.println("2 - Cadastrar Triângulo");
			System.out.println("3 - Cadastrar Círculo");
			System.out.println("4 - Listar todos");
			System.out.println("5 - Listar Retângulo");
			System.out.println("6 - Listar Triângulo");
			System.out.println("7 - Listar Círculo");
			System.out.println("0 - Sair");
			System.out.println("\nDigite a op��o desejada: ");
			op = sc.nextInt();
			switch (op) {
				case 1:
					CadastrarRetangulo.renderizar();
					break;
				case 2:
					CadastrarTriangulo.renderizar();
					break;
				case 3:
					CadastrarCirculo.renderizar();
					break;
				case 4:
					ListarTudo.renderizar();
					break;
				case 5:
					ListarRetangulo.renderizar();
					break;
				case 6:
					ListarTriangulo.renderizar();
					break;
				case 7:
					ListarCirculo.renderizar();
					break;
				case 0:
					System.out.println("\nSaindo...");
					break;
				default:
					System.out.println("\nOp��o inv�lida!");
					break;
			}
		} while (op != 0);
	}

}
