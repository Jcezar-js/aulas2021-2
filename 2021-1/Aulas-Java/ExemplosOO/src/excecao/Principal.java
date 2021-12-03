package excecao;

import java.util.Scanner;

public class Principal {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int idade = lerInteiro("Digite a idade: ");	
		int quantidade = lerInteiro("Digite a quantidade: ");
		System.out.println("Idade: " + idade);
		System.out.println("Quantidade: " + quantidade);
	}

	public static int lerInteiro(String msg) {
		int valor = 0;
		boolean valorLido = false;
		do {
			try {
				System.out.println(msg);
				//Converter uma string para um inteiro
				valor = Integer.parseInt(sc.next());
				valorLido = true;
			} catch (NumberFormatException e) {
				System.out.println("\nApenas números\n");
			}
		}while(!valorLido);
		return valor;
	}
}












