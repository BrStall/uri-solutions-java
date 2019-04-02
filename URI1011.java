import java.util.Scanner;

public class URI1011{
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        double r, volume;

        r = ler.nextFloat();
        volume = ((4.0/3) * 3.14159 * (r*r*r));

        System.out.printf("VOLUME = %.3f\n", volume);
    }
}