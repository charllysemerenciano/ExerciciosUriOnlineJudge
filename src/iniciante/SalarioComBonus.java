package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Author Charllys Emerenciano
 * @create 13/11/2020 23:54
 */
public class SalarioComBonus {
    public static void main(String[] args) {

        final double comissao = 0.15;

        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();
        double salario = scanner.nextDouble();
        double vendas = scanner.nextDouble();

        double total = salario + (vendas * comissao);

        DecimalFormat format = new DecimalFormat("0.00");

        System.out.println("TOTAL = R$ " + format.format(total));

    }
}
