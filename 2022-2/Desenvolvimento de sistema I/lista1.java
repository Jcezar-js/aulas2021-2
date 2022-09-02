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
    // Declarando variÃ¡vel scanner
    Scanner sc = new Scanner(System.in);

// ExercÃ­cio 1
    System.out.println("Lista de exercÃ­cios - Digite '1' para dar inicio");
    inicio = sc.nextInt();
    
    System.out.println("\n\n");
    System.out.println("Ãrea do retÃ¢ngulo");
    System.out.println("Digite a Largura: ");
    largura = sc.nextDouble();
    System.out.println("Digite a altura: ");
    altura = sc.nextDouble();

    area = largura * altura;

    System.out.println("Área do retÃ¢ngulo Ã©: " + area + "\n\n");


    // ExercÃ­cio 2 - conversor de moedas
    System.out.println("Digite 2 para ir ao prÃ³ximo exercÃ­cio");
    inicio = sc.nextInt();
    

    // limpa console
    if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    
    
    
    double VALOR_DOLAR = 5.17, VALOR_EURO = 6.14, VALOR_PESO = .06;
    double real, dolar, peso, euro;
    
    System.out.println("CONVERSOR DE MOEDAS");
    System.out.println("Digite o valor em Reais: ");
    real = sc.nextDouble();


    // cÃ¡lculos
    dolar = real / VALOR_DOLAR;
    euro = real / VALOR_EURO;
    peso = real / VALOR_PESO;    

    System.out.println("\n\n"); 
    System.out.println("DÃ³lar: " + dolar + "\n");
    System.out.println("Euro: " + euro + "\n");
    System.out.println("Peso: " + peso + "\n");
    
  
  
  // ExercÃ­cio 3
  System.out.println("\n\n");
  System.out.println("Digite 3 para ir ao prÃ³ximo exercÃ­cio");
  inicio = sc.nextInt();
  

  if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        

  int num1, num2;
  
    
    System.out.println("COMPARADOR DE NÃšMEROS");

    System.out.println("Digite o primeiro número: ");
    num1 = sc.nextInt();

    System.out.println("\n\n");

    System.out.println("Digite o segundo número: ");
    num2 = sc.nextInt();

    System.out.println("\n\n");

    if (num1 > num2) {
      System.out.println("O Número " + num1 + " Ã© maior que o número " + num2);
    } else {
      System.out.println("O número " + num2 + " Ã© maior que o número " + num1);
    }

  System.out.println("\n\n");
  System.out.println("Digite 4 para ir ao próximo exercí­cio");
  inicio = sc.nextInt();


  if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
     
  
    System.out.println("Validador de idade \n");
    
    
    System.out.println("Digite sua idade:  ");
    num1 = sc.nextInt();

    if (num1 <= 13) {
      System.out.println("Você é uma criança");
    } else if (num1 > 13 && num1 <= 18){
      System.out.println("Você é um adolescente");
    } else if (num1 > 18 && num1 <= 60){
      System.out.println("Você é um adulto");
    }else{
      System.out.println("Você é um idoso");
    }  


  System.out.println("\n\n");
  System.out.println("Digite 5 para ir ao próximo exercí­cio");
  inicio = sc.nextInt();

    if(System.getProperty("os.name").contains("Windows"))
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

    System.out.println("Sequência de fibonacci");
    System.out.println("Digite o limite da sequência: ");
    num1 = sc.nextInt();


    

  }
}