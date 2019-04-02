import java.util.Scanner;

public class URI1065{
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int aux=0, a;

        for(int i = 0; i < 5; i++){

            a = ler.nextInt();

            if(a%2 == 0){
                aux++;
            }
        }

        System.out.println(aux + " valores pares");

    }
}