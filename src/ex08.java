import java.util.Scanner;

public class ex08 {

    /**
     * Escreva um programa que calcule o delta de uma equação de um segundo grau:
     * @author Batista, C.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        double a = scanner.nextDouble();
        System.out.println("Digite o valor de b: ");
        double b = scanner.nextDouble();
        System.out.println("Digite o valor de c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b,2) - 4*a*c;

        System.out.println("O valor de delta é :" +delta);

        scanner.close();
    }
}
