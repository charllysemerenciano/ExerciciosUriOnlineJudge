package iniciante;

import java.util.Scanner;

/**
 * @Author Charllys Emerenciano
 * @create 13/11/2020 23:23
 */
public class Diferenca {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        int DIFERENCA = (A * B - C * D);

        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}
