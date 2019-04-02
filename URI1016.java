import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    
    Scanner ler = new Scanner(System.in);

    int distancia = ler.nextInt();
    int tempo = (int) (distancia / ((90/60.0)-60/60.0));

    System.out.println(tempo + " minutos");

    }
}