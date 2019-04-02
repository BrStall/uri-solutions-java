import java.util.Scanner;

public class URI1036{
    public static void main(String[] args){

    Scanner ler = new Scanner(System.in);

    double a, b, c, rUm, rDois;
    
    a = ler.nextDouble();
    b = ler.nextDouble();
    c = ler.nextDouble();

    if((a == 0) || (((b*b) - (4*a*c)) < 0)){
        System.out.println("Impossivel calcular");
    } else{
        rUm = ((-b + Math.sqrt(((b*b) - (4*a*c)))) / (2*a));
        rDois = ((-b - Math.sqrt(((b*b) - (4*a*c)))) / (2*a));

        System.out.printf("R1 = %.5f\n", rUm);
        System.out.printf("R2 = %.5f\n", rDois);
    }
    
    }
}