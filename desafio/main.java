package desafio;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite o valor do investimento inicial (P): ");
            double p = scanner.nextDouble();

            System.out.print("Digite a taxa de juros anual (r) em %: ");
            double r = scanner.nextDouble();

            System.out.print("Digite o periodo de investimento em anos (t): ");
            int t = scanner.nextInt();

            System.out.print("Digite o tipo de capitalizacao (simples ou composta): ");
            scanner.nextLine();
            String tipo = scanner.nextLine().toLowerCase();

            double montante = 0;

            if (tipo.equals("simples")) {
                montante = calcularSimples(p, r, t);
            } else if (tipo.equals("composta")) {
                montante = calcularComposta(p, r, t);
            } else {
                System.out.println("Tipo de capitalizacao invalido.");
                continue; 
            }

            System.out.printf("Montante final apos %d ano(s): R$ %.2f\n", t, montante);

            System.out.print("Deseja realizar um novo calculo? (s/n): ");
            String resposta = scanner.nextLine().toLowerCase();
            if (!resposta.equals("s")) {
                continuar = false;
            }
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }

    public static double calcularSimples(double p, double r, int t) {
        return p * (1 + (r / 100) * t);
    }

    public static double calcularComposta(double p, double r, int t) {
        return p * Math.pow(1 + (r / 100), t);
    }
}
