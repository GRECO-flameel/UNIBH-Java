package for_;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro positivo: ");
        int numero = scanner.nextInt();
        int fatorial = 1;

        if (numero >= 0) {
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            System.out.println("O fatorial de " + numero + " e " + fatorial);
        } else {
            System.out.println("Numero invalido. Por favor, digite um numero inteiro positivo.");
        }

        scanner.close();
    }
}
