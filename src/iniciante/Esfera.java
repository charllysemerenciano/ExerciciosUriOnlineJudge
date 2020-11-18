package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * @Author Charllys Emerenciano
 * @create 17/11/2020 22:24
 */
public class Esfera {


    public static void main(String[] args) {

        final double PI = 3.14159;

        Scanner scanner = new Scanner(System.in);

        float R = scanner.nextFloat();

        double VOLUME = ((4.0 / 3) * PI * Math.pow(R, 3));

        DecimalFormat format = new DecimalFormat("0.000");

        System.out.println("VOLUME = " + format.format(VOLUME));
    }
}
