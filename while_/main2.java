package while_;
import java.util.Scanner;
public class main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 0;
        int soma = 0;

        System.out.println("Digite alguns numeros para serem somados\n Para parar digite -1");
        
        while(num >=  0){
         soma += num;
         num = scan.nextInt();
        }

        System.out.printf("A soma dos numeros e: %d",soma);

        scan.close();

    }
}
