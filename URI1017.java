import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner scan = new Scanner(System.in);
				
		double a, b, qtd;
		
		a = scan.nextDouble();
		b = scan.nextDouble();
		
		qtd = (a*b) / 12;
		
		System.out.printf("%.3f\n", qtd);
    }
 
}