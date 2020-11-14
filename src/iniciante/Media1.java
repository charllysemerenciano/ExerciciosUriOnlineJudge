package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Author Charllys Emerenciano
 * @create 13/11/2020 23:15
 */
public class Media1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float A = scanner.nextFloat();
        float B = scanner.nextFloat();

        double MEDIA = ((A * 3.5) + (B * 7.5)) / 11;

        DecimalFormat formato = new DecimalFormat("0.00000");

        System.out.println("MEDIA = " + formato.format(MEDIA));
    }
}
