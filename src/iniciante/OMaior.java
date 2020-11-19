package iniciante;

import java.util.Scanner;

/**
 * @Author Charllys Emerenciano
 * @create 18/11/2020 22:59
 */
public class OMaior {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();
        int v3 = scanner.nextInt();


        int maior = maiorAB(v1, v2);
        maior = maiorAB(maior, v3);

        System.out.println(maior + " eh o maior");

    }

    private static int maiorAB(int A, int B) {
        return (A + B + Math.abs(A - B)) / 2;
    }
}
