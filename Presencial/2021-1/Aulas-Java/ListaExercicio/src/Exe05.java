import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {

		int limite, anterior = 0, atual = 1, proximo;
		Scanner sc = new Scanner(System.in); 

		System.out.println("Digite o valor limite da sequ�ncia fibonacci: ");
		limite = sc.nextInt();
		
		System.out.print(anterior + " ");
		System.out.print(atual + " ");
		
		do {
			proximo = anterior + atual;
			System.out.print(proximo + " ");
			anterior = atual;
			atual = proximo;
		}while(proximo < limite);

	}

}
