import java.util.Scanner;

public class URI1020{
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);

        int dias = ler.nextInt();
        int anos, meses, restoAnos, restoMeses;

        anos = dias/365;
        restoAnos = dias%365;
        
        meses = restoAnos/30;
        restoMeses = restoAnos%30;

        dias = restoMeses%30;

        System.out.println(anos + " ano(s)\n" + meses + " mes(es)\n" + dias + " dia(s)");

    }
}