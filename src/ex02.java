import java.util.Scanner;

public class ex02 {

    /**
     * Escreva um programa que calcule a média aritméica de dois números:
     * @author Batista, C.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os números respectivamente : ");

        double numX = scanner.nextDouble();
        double numY = scanner.nextDouble();

        double media = (numX + numY) / 2;

        System.out.println("Sua média é :");
        System.out.println(media);

        scanner.close();


    }
}
