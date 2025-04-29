package while_;
public class main4 {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        int sequencia = 0;
        int quantidade = 0;

        while(quantidade <+ 10){
            System.out.printf("%d ",sequencia);
            num1 = num2;
            num2 = sequencia;
            sequencia += num1;
            quantidade++;

        }
    }
}
