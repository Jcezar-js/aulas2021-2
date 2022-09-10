import java.util.Scanner;
import java.io.IOException;

import java.util.Random;
import java.util.Arrays;


/**
 * aula1
 */
public class lista1 {

  public static void main(String[] args) throws InterruptedException, IOException {

    
     // Declarando tipos primitivos
    double largura, altura, area;
    int inicio;
    try (// Declarando vari·vel scanner
    Scanner sc = new Scanner(System.in)) {
      // ExercÌcio 1
          System.out.println("Lista de exercicios - Digite qualquer numero para dar inicio");
          inicio = sc.nextInt();
          
          System.out.println("\n\n");
          System.out.println("Area do retangulo");
          System.out.println("Digite a Largura: ");
          largura = sc.nextDouble();
          System.out.println("Digite a altura: ");
          altura = sc.nextDouble();
      
          area = largura * altura;
      
          System.out.println("ùrea do retangulo: " + area + "\n\n");
      
      
          // ExercÌcio 2 - conversor de moedas
          System.out.println("Digite qualquer numero para o proximo ex");
          inicio = sc.nextInt();
          
      
          // limpa console
          if (System.getProperty("os.name").contains("Windows"))
                  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
          
          
          
          double VALOR_DOLAR = 5.17, VALOR_EURO = 6.14, VALOR_PESO = .06;
          double real, dolar, peso, euro;
          
          System.out.println("CONVERSOR DE MOEDAS");
          System.out.println("Digite o valor em Reais: ");
          real = sc.nextDouble();
      
      
          // c·lculos
          dolar = real / VALOR_DOLAR;
          euro = real / VALOR_EURO;
          peso = real / VALOR_PESO;    
      
          System.out.println("\n\n"); 
          System.out.println("Dolar: " + dolar + "\n");
          System.out.println("Euro: " + euro + "\n");
          System.out.println("Peso: " + peso + "\n");
          
        
        
        // ExercÌcio 3
        System.out.println("\n\n");
        System.out.println("Digite qualquer numero para o proximo ex");
        inicio = sc.nextInt();
        
      
        if (System.getProperty("os.name").contains("Windows"))
                  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
              
      
        int num1, num2;
        
          
          System.out.println("COMPARADOR DE NUMEROS");
      
          System.out.println("Digite o primeiro numero: ");
          num1 = sc.nextInt();
      
          System.out.println("\n\n");
      
          System.out.println("Digite o segundo numero: ");
          num2 = sc.nextInt();
      
          System.out.println("\n\n");
      
          if (num1 > num2) {
            System.out.println("O Numero " + num1 + " eh maior que o nùmero " + num2);
          } else {
            System.out.println("O Numero " + num2 + " eh maior que o nùmero " + num1);
          }
      
        System.out.println("\n\n");
        System.out.println("Digite qualquer numero para o proximo ex");
        inicio = sc.nextInt();
      
      
        if (System.getProperty("os.name").contains("Windows"))
                  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
           
        
          System.out.println("Validador de idade \n");
          
          
          System.out.println("Digite sua idade:  ");
          num1 = sc.nextInt();
      
          if (num1 <= 13) {
            System.out.println("Vocù ù uma crianùa");
          } else if (num1 > 13 && num1 <= 18){
            System.out.println("Vocù ù um adolescente");
          } else if (num1 > 18 && num1 <= 60){
            System.out.println("Vocù ù um adulto");
          }else{
            System.out.println("Vocù ù um idoso");
          }  
      
      
        System.out.println("\n\n");
        System.out.println("Digite qualquer numero para o proximo ex");
        inicio = sc.nextInt();
      
          if(System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      
            int limite, anterior = 0, atual = 1, proximo;
      
          System.out.println("Sequùncia de fibonacci");
          System.out.println("Digite o limite da sequùncia: ");
          limite = sc.nextInt();
      
          System.out.println(anterior + " ");
          System.out.println(atual + " ");
      
          do {
      
            proximo  = anterior + atual;
            System.out.println(proximo + " ");
            anterior = atual;
            atual = proximo;
          }while(proximo < limite);
       
        System.out.println("\n\n");
        System.out.println("Digite 6 para ir ao prùximo exercùcio");
        inicio = sc.nextInt();
      
      
        int i;
        Random gerador = new Random();
      
          if(System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      
            System.out.println("Ordenacao de vetores \n");
            System.out.println("Digite algum nùmero para iniciar a ordenaùùo: ");
            inicio = sc.nextInt();
      
            System.out.println("Recebendo valores...\n");
      
      
          int [] vetor = new int[1000];
         
      
          for (i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt();
      
            Arrays.sort(vetor);
            System.out.println(vetor[i]+",");
          }
          System.out.println("Seu Vetor ordenado! \n");
          System.out.println("Digite um nùmero para sair: \n");
          inicio = sc.nextInt();
    }

      System.out.println("saindo...");
  }
}