package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Author Charllys Emerenciano
 * @create 19/11/2020 22:41
 */
public class Consumo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int km = scanner.nextInt();
        double litros = scanner.nextDouble();

        double consumo = km / litros;

        DecimalFormat format = new DecimalFormat("0.000");

        System.out.println(format.format(consumo) + " km/l");

    }
}
