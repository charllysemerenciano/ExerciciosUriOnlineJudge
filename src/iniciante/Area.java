package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Author Charllys Emerenciano
 * @create 18/11/2020 22:45
 */
public class Area {
    public static void main(String[] args) {

        final double PI = 3.14159;

        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double triangulo = (A * C) / 2;
        double circulo = PI * Math.pow(C, 2);
        double trapezio = ((A + B) * C) / 2;
        double quadrado = Math.pow(B, 2);
        double retangulo = A * B;

        DecimalFormat format = new DecimalFormat("0.000");

        System.out.println("TRIANGULO: " + format.format(triangulo));
        System.out.println("CIRCULO: " + format.format(circulo));
        System.out.println("TRAPEZIO: " + format.format(trapezio));
        System.out.println("QUADRADO: " + format.format(quadrado));
        System.out.println("RETANGULO: " + format.format(retangulo));

    }
}
