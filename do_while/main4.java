package do_while;
import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char resposta = '\0';
        char s = 's', n = 'n';
        float nota = 0, media = 0, total = 0;
        int tnotas = 0;
        

        do{
            
            System.out.println("Digite a nota:");

            nota = scan.nextFloat();
            total += nota;
            tnotas++;

            System.out.println("Deseja continuar inserindo notas? [s/n]");
            resposta = scan.next().charAt(0);

            if(resposta == n){
                System.out.println("Operacao cancelada");
                scan.close();
            }else if(resposta != 's' && resposta != 'n'){
                System.out.println("Resposta inválida");
            }

            media = total / tnotas;

        }while(resposta == s);

        scan.close();

        System.out.printf("A media de todas as notas e: %.2f",media);
        
    }
    
}
