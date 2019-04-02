import java.util.Scanner;

public class URI1038{
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int produto = ler.nextInt();
        int qnt = ler.nextInt();
        double total=0;

        switch(produto){
            case 1:
                total = (4.00*qnt);
                break;
            case 2:
                total = (4.50*qnt);
                break;
            case 3:
                total = (5.00*qnt);
                break;
            case 4:
                total = (2.00*qnt);
                break;
            case 5:
                total = (1.50*qnt);
                break;
        }

        System.out.printf("Total: R$ %.2f\n", total);

    }
}