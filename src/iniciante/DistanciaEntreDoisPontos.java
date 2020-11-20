package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Author Charllys Emerenciano
 * @create 19/11/2020 22:45
 */
public class DistanciaEntreDoisPontos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distancia = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));

        DecimalFormat format = new DecimalFormat("0.0000");

        System.out.println(format.format(distancia));

    }
}
