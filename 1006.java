import java.util.Scanner;
import java.io.IOException;

public class main{
      public static void main(String[] args){

      Scanner ler = new Scanner(System.in);

      double a, b, c, media;

      a = ler.nextDouble();
      b = ler.nextDouble();
      c = ler.nextDouble();

      media = ((a * 2) + (b * 3) + (c * 5)) / 10;

      System.out.printf("MEDIA = %.1f%n", media);

      }
}
