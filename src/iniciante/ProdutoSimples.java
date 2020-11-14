package iniciante;

import java.util.Scanner;

/**
 * @Author Charllys Emerenciano
 * @create 13/11/2020 23:17
 */
public class ProdutoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int PROD = A * B;

        System.out.println("PROD = " + PROD);
    }
}
