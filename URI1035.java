import java.util.Scanner;

public class URI1035{
    public static void main(String[] args){

    Scanner ler = new Scanner(System.in);
    
    int a, b, c, d;

    a = ler.nextInt();
    b = ler.nextInt();
    c = ler.nextInt();
    d = ler.nextInt();

    if((b > c) && 
       (d > a) && 
       (c + d > a + b) && 
       (c > 0) && 
       (c > 0) && 
       (a % 2 == 0)){

        System.out.println("Valores aceitos");

       } else System.out.println("Valores nao aceitos");
    }
}