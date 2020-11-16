package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Author Charllys Emerenciano
 * @create 15/11/2020 22:41
 */
public class CalculoSimples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int codPeca1 = scanner.nextInt();
        int numPeca1 = scanner.nextInt();
        double valorPeca1 = scanner.nextDouble();


        int codPeca2 = scanner.nextInt();
        int numPeca2 = scanner.nextInt();
        double valorPeca2 = scanner.nextDouble();

        double valorTotal = (numPeca1*valorPeca1) + (numPeca2*valorPeca2);

        DecimalFormat format = new DecimalFormat("0.00");

        System.out.println("VALOR A PAGAR: R$ " + format.format(valorTotal));

    }
}
