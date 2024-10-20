package teste;

import java.util.Scanner;

public class teste02 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int contador = 0;
    System.out.print("Digite uma frase ou palavra: ");
    String input = scanner.nextLine();
    scanner.close();

    for (int i = 0; i < input.length(); i++) {
            char letra = input.charAt(i);
            if (letra == 'a' || letra == 'A') {
                contador++;
            }
        }
    
    if (contador > 0) {
        System.out.println("A letra 'a' aparece " + contador + " vez(es) na string.");
        } else {
         System.out.println("A letra 'a' não foi encontrada na string.");
        }
    }
}