import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {

		int numero1, numero2;
		Scanner sc = new Scanner(System.in); 

		System.out.println("Digite o primeiro número: ");
		numero1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		numero2 = sc.nextInt();

		if(numero1 > numero2) {
			System.out.println("Número um é maior: " + numero1);
			System.out.println("Número dois é menor: " + numero2);
		} else if(numero2 > numero1){
			System.out.println("Número dois é maior: " + numero2);
			System.out.println("Número um é menor: " + numero1);
		}else {
			System.out.println("Números iguais!");
		}
	}
}






