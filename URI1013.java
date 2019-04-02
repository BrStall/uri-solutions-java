import java.util.Scanner;

public class URI1013{
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int a, b, c, maior;

        a = ler.nextInt();
        b = ler.nextInt();
        c = ler.nextInt();

        maior = a;
        if (a < b || a < c){
            if (b < c){
                maior = c;
            }
            else{
                maior = b;
            }
        }

        System.out.println(maior + " eh o maior");

    }
}