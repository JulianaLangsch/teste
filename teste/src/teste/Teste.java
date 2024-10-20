package teste;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numUsuario = scanner.nextInt();
        scanner.close();
        
        int anterior = 0;
        int posterior = 1;

        if (numUsuario == 0 || numUsuario == 1) {
            System.out.println("O número " + numUsuario + " pertence à sequência de Fibonacci.");
        }
        
          while (posterior < numUsuario) {
            int sequencia = posterior;
            posterior = anterior + posterior;
            anterior = sequencia;
        }
          
                if (posterior == numUsuario) {
            System.out.println("O número " + numUsuario + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numUsuario + " não pertence à sequência de Fibonacci.");
        }
    }
}