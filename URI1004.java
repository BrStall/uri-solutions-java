import java.io.IOException;
import java.util.Scanner;
 
public class URI1004 {
 
    public static void main(String[] args) throws IOException {
 
     	Scanner scan = new Scanner(System.in);
		
		int a, b, prod;
		
		a = scan.nextInt();
		b = scan.nextInt();
		
		prod = a*b;
		
		System.out.println("PROD = " + prod);
 
    }
 
}