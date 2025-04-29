package for_;

public class main3 {
    public static void main(String[] args) {
        int[] numeros = {5, 8, 2, 9, 1, 3, 7, 4, 6, 10};
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println("A soma dos elementos do vetor e: " + soma);
    }
}

