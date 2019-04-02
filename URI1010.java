import java.util.Scanner;

public class URI1010{
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int cPum, numPum;
        float vPum;

        cPum = ler.nextInt();
        numPum = ler.nextInt();
        vPum = ler.nextFloat();

        int cPdois, numPdois;
        float vPdois;

        cPdois = ler.nextInt();
        numPdois = ler.nextInt();
        vPdois = ler.nextFloat();

        float valor = (numPum*vPum) + (numPdois*vPdois);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor);
    }
}