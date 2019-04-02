import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Scanner ler = scanner;

        float a, b, c, d, media, nExame, nFinal;

        a = ler.nextFloat();
        b = ler.nextFloat();
        c = ler.nextFloat();
        d = ler.nextFloat();

        media = (((a*2) + (b*3) + (c*4) + (d*1))/10);

        System.out.printf("Media: %.1f\n", media);

        if(media >= 7){
            System.out.println("Aluno aprovado.");

        } else if (media >= 5.0 && media <= 6.9){

            System.out.println("Aluno em exame.");
            
            nExame = ler.nextFloat();
            
            System.out.printf("Nota do exame: %.1f\n", nExame);
            
            nFinal = (nExame + media)/2;

            if (nFinal >= 5){
                System.out.println("Aluno aprovado.");
            } else System.out.println("Aluno reprovado.");

            System.out.printf("Media final: %.1f\n", nFinal);
        
        } else System.out.println("Aluno reprovado.");
    }
}