import java.util.Scanner;

public class URI1014{
    public static void main(String[] args){

    Scanner ler = new Scanner(System.in);

	double dTotal, tGasosa, total;

        dTotal = ler.nextInt();
        tGasosa = ler.nextFloat();
        total = dTotal/tGasosa;

        System.out.printf("%.3f km/l\n", total);

    }
}