package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Author Charllys Emerenciano
 * @create 13/11/2020 23:16
 */
public class Media2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double MEDIA = ((A * 2) + (B * 3) + (C * 5)) / (2 + 3 + 5);

        DecimalFormat formato = new DecimalFormat("0.0");

        System.out.println("MEDIA = " + formato.format(MEDIA));

    }
}
