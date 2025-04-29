package do_while;
import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = 0;

        System.out.println("Digite um numero que esteja dentro da sequencia de 0 - 100:");

        do{

            num1 = scan.nextInt();

            if(num1 >= 0 && num1 <= 100){
                System.out.println(("numero dentro da sequencia"));
        }else{
            System.out.println("Numero fora da sequencia");
        }

        }while(num1 >= 0 || num1 <= 100);

    }
}
