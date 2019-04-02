import java.util.Scanner;

public class URI1012{
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);

        float a, b, c;

        a = ler.nextFloat();
        b = ler.nextFloat();
        c = ler.nextFloat();

        System.out.printf("TRIANGULO: %.3f\n", (a*c)/2);
        System.out.printf("CIRCULO: %.3f\n", (c*c) * 3.14159);
        System.out.printf("TRAPEZIO: %.3f\n", ((a+b)/2)*c);
        System.out.printf("QUADRADO: %.3f\n", b*b);
        System.out.printf("RETANGULO: %.3f\n", a*b);

    }
}