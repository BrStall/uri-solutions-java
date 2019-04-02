import java.util.Scanner;

public class URI1060{
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);
        double a;
        int aux=0;

        for(int i = 0; i < 6; i++){

            a = ler.nextDouble();

            if (a > 0){
                aux++;
            }
        }

        System.out.println(aux + " valores positivos");
    }
}