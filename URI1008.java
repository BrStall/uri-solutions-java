import java.util.Scanner;

public class URI1008{
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int nFunc, nHoras;
        float hTrabalhada;

        nFunc = ler.nextInt();
        nHoras = ler.nextInt();
        hTrabalhada = ler.nextFloat();

        System.out.println("NUMBER = " + nFunc);
        System.out.printf("SALARY = U$ %.2f\n", (hTrabalhada*nHoras));
    }
}