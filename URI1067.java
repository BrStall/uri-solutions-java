import java.util.Scanner;

public class URI1067{
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int a = ler.nextInt();

        for(int i=0; i <= a; i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
}