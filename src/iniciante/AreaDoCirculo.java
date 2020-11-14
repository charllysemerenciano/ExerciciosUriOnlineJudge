package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Author Charllys Emerenciano
 * @create 13/11/2020 23:00
 */
public class AreaDoCirculo {
    public static void main(String[] args) {
        final double n = 3.14159;

        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();

        double area = n * (raio * raio);

        DecimalFormat df = new DecimalFormat("0.0000");

        System.out.println("A=" + df.format(area));

    }
}
