import java.util.Scanner;

public class ex05 {

    /**
     *  Escreva um programa que calcule o IMC de um individuo,
     *  utilizando a fórmula IMC = peso / altura^2
     * @author Batista, C.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso : ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura : ");
        double altura = scanner.nextDouble();

        double imc = (peso / Math.pow(altura, 2));

        System.out.println("Seu imc é : " + imc);

        scanner.close();
    }
}
