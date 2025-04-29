package while_;
import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int senha = 12345;
        int tentaivas = 0;

        System.out.println("Digite a senha para acessar o sistema:");
        while(tentaivas != senha){
            tentaivas = scan.nextInt();
            if(tentaivas != senha){
                System.out.println("Senha incorreta!\nTente novamente:\n");
                
            }else{
                System.out.println("Acesso concedido!");
            }
        }

        scan.close();

    }
    
}
