package utils;

import java.util.Scanner;

public class excecao {

    private static Scanner sc = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        int valor = 0;
        boolean valorLido = false;
        do {
            try {
                System.out.println(msg);
                // Converter uma string para um inteiro
                valor = Integer.parseInt(sc.next());
                valorLido = true;
            } catch (NumberFormatException e) {
                System.out.println("\nApenas n�meros\n");
            }
        } while (!valorLido);
        return valor;
    }

}
