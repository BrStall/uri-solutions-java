import java.util.Scanner;

public class URI1066{
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);

        int a, par=0, impar=0, posi=0, nega=0;

        for (int i = 0; i < 5; i++){
            a = ler.nextInt();
            if(a%2 == 0){
                par++;
            } else impar++;

            if(a < 0){
                nega++;
            } else if(a > 0) posi++;
        }

        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(posi + " valor(es) positivo(s)");
        System.out.println(nega + " valor(es) negativo(s)");
    }
}