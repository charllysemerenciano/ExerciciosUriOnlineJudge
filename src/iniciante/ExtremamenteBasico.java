package iniciante;

import java.util.Scanner;

/**
 * @Author Charllys Emerenciano
 * @create 13/11/2020 22:58
 */
public class ExtremamenteBasico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = a + b;

        System.out.println("X = " + x);
    }
}
