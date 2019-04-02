import java.io.IOException;
import java.util.Scanner;
public class URI1003{
    public static void main(String[] args) throws IOException {
 
       	Scanner scan = new Scanner(System.in);
		
		int a, b, soma;
		
		a = scan.nextInt();
		b = scan.nextInt();
		
		soma = a+b;
		
		System.out.println("SOMA = " + soma);
 
    }
 
}