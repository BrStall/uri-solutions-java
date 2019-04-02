import java.util.Scanner;

public class URI1042{
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int a, b, c, maior=0, mid=0, menor=0;

        a = ler.nextInt();
        b = ler.nextInt();
        c = ler.nextInt();

        if(a > b && a > c){
            maior = a;
        }
        
        if(a > b && a < c){
            mid = a;
        } else if(a < b && a > c){
            mid = a;
        }
        
        if(a < b && a < c){
            menor = a;
        }
        
        if(b > a && b > c){
            maior = b;
        }
        
        if(b > a && b < c){
            mid = b;
        } else if(b < a && b > c){
            mid = b;
        }
        
        if(b < b && b < c){
            menor = b;
        }
        
        if(c > a && c > b){
            maior = c;
        }
        
        if(c > a && c < b){
            mid = c;
        } else if(c < a && c > b){
            mid = a;
        }
        
        if(c < a && c < b){
            menor = c;
        }

        System.out.print(menor + "\n" + mid + "\n" + maior + "\n\n");
        System.out.print(a + "\n" + b + "\n" + c + "\n");

        }
    }