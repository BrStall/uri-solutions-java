import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    double a, b, media;

    a = ler.nextDouble();
    b = ler.nextDouble();
    media = ((a * 3.5) + (b * 7.5)) / 11;
    
    System.out.printf("MEDIA = %.5f", media );

  }
}
