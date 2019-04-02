import java.util.Scanner;

public class URI1015{
    public static void main(String[] args){

    Scanner ler = new Scanner(System.in);

    double x1, x2, y1, y2, distancia;

    x1 = ler.nextDouble();
    y1 = ler.nextDouble();
    x2 = ler.nextDouble();
    y2 = ler.nextDouble();

    distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

    System.out.printf("%.4f\n", distancia);

    }
}