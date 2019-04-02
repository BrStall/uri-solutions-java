import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        String nome = ler.next();
        
        double sFixo, tVendas, salario;
        
        sFixo = ler.nextDouble();
        tVendas = ler.nextDouble();
        salario = sFixo+tVendas*0.15;

        System.out.printf("TOTAL = R$ %.2f\n", salario);
    }
}