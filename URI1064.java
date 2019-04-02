import java.util.Scanner;

public class URI1064{
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        double a, soma=0;
        int aux=0;

        for(int i = 0; i < 6; i++){

            a = ler.nextDouble();

            if(a >= 0){
	            soma += a;
                aux++;
            }
        }
        
        double media = soma/aux;

        System.out.println(aux + " valores positivos");
        System.out.printf("%.1f\n", media);

    }
}