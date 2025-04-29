package do_while;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int opcao = 0;

        do{
            System.out.println("Escolha umas das opções abaixo:\n1.Adicionar\n2.Remover\n3.Sair");

            opcao = scan.nextInt();

            if(opcao == 1){
                System.out.println("Acao executa com exito!\n\n");
            }else if(opcao == 2){
                System.out.println("Acao executa com exito!\n\n");
            }else if(opcao == 3){
                System.out.println("Voce saiu!\n\n");
            }
        }while(opcao != 3);


        
    }
}
