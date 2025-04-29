package do_while;
import java.util.Random;
import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int num = random.nextInt(20) + 1;
        int adivinha = 0;


        System.out.println("Adivinhe o número entre 1 e 20!");
        System.out.println("Digite um número: ");
        do{
            adivinha = scan.nextInt();
            if(adivinha < num){
                System.out.println("O número é maior!");
            }else if(adivinha > num){
                System.out.println("O número é menor!");

            }
        }   while(adivinha != num);
        System.out.println("Parabéns! Você adivinhou o número " + num + "!");
        scan.close();
        
    }
}
