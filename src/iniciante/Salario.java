package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Author Charllys Emerenciano
 * @create 13/11/2020 23:36
 */
public class Salario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroFuncionario = scanner.nextInt();
        int horas = scanner.nextInt();
        double valorHora = scanner.nextDouble();

        double salario = valorHora * horas;


        DecimalFormat format = new DecimalFormat("0.00");


        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.println("SALARY = U$ " + format.format(salario));

    }
}
