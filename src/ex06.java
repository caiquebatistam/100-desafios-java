import java.util.Scanner;

public class ex06 {
    /**
     * Crie um programa que calcule e exiba o perímetro de
     * um círculo, solicitando o raio ao usuário.
     *
     * @author Batista, C.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do círculo : ");
        double raio = scanner.nextDouble();

        double perimetro = 2 * Math.PI * raio;

        System.out.println("O perimetro do circulo é: " +perimetro);

        scanner.close();
    }
}
