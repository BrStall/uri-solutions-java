import java.util.Scanner;

public class URI1070 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int a = ler.nextInt(), aux = 6, i = 0;

        while (i < aux) {

            if (a % 2 == 1) {
                System.out.println(a);
                i++;
            }
            a++;
        }

    }
}