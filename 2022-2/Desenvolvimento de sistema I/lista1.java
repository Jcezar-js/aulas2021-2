import java.util.Scanner;
import java.io.IOException;

/**
 * aula1
 */
public class lista1 {

  public static void main(String[] args) throws InterruptedException, IOException {

    
     // Declarando tipos primitivos
    double largura, altura, area;
    int inicio;
    // Declarando variável scanner
    Scanner sc = new Scanner(System.in);

// Exercício 1
    System.out.println("Lista de exercícios - Digite '1' para dar inicio");
    inicio = sc.nextInt();
    
    System.out.println("\n\n");
    System.out.println("Ýrea do retângulo");
    System.out.println("Digite a Largura: ");
    largura = sc.nextDouble();
    System.out.println("Digite a altura: ");
    altura = sc.nextDouble();

    area = largura * altura;

    System.out.println("�rea do retângulo é: " + area + "\n\n");


    // Exercício 2 - conversor de moedas
    System.out.println("Digite 2 para ir ao próximo exercício");
    inicio = sc.nextInt();
    

    // limpa console
    if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    
    
    
    double VALOR_DOLAR = 5.17, VALOR_EURO = 6.14, VALOR_PESO = .06;
    double real, dolar, peso, euro;
    
    System.out.println("CONVERSOR DE MOEDAS");
    System.out.println("Digite o valor em Reais: ");
    real = sc.nextDouble();


    // cálculos
    dolar = real / VALOR_DOLAR;
    euro = real / VALOR_EURO;
    peso = real / VALOR_PESO;    

    System.out.println("\n\n"); 
    System.out.println("Dólar: " + dolar + "\n");
    System.out.println("Euro: " + euro + "\n");
    System.out.println("Peso: " + peso + "\n");
    
  
  
  // Exercício 3
  System.out.println("\n\n");
  System.out.println("Digite 3 para ir ao próximo exercício");
  inicio = sc.nextInt();
  

  if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        

  int num1, num2;
  
    
    System.out.println("COMPARADOR DE NÚMEROS");

    System.out.println("Digite o primeiro n�mero: ");
    num1 = sc.nextInt();

    System.out.println("\n\n");

    System.out.println("Digite o segundo n�mero: ");
    num2 = sc.nextInt();

    System.out.println("\n\n");

    if (num1 > num2) {
      System.out.println("O N�mero " + num1 + " é maior que o n�mero " + num2);
    } else {
      System.out.println("O n�mero " + num2 + " é maior que o n�mero " + num1);
    }

  System.out.println("\n\n");
  System.out.println("Digite 4 para ir ao pr�ximo exerc�cio");
  inicio = sc.nextInt();


  if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
     
  
    System.out.println("Validador de idade \n");
    
    
    System.out.println("Digite sua idade:  ");
    num1 = sc.nextInt();

    if (num1 <= 13) {
      System.out.println("Voc� � uma crian�a");
    } else if (num1 > 13 && num1 <= 18){
      System.out.println("Voc� � um adolescente");
    } else if (num1 > 18 && num1 <= 60){
      System.out.println("Voc� � um adulto");
    }else{
      System.out.println("Voc� � um idoso");
    }  


  System.out.println("\n\n");
  System.out.println("Digite 5 para ir ao pr�ximo exerc�cio");
  inicio = sc.nextInt();

    if(System.getProperty("os.name").contains("Windows"))
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

    System.out.println("Sequ�ncia de fibonacci");
    System.out.println("Digite o limite da sequ�ncia: ");
    num1 = sc.nextInt();


    

  }
}