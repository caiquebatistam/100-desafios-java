import java.util.Scanner;

public class ex07 {

    /**
     * Escreva um programa que calcule a área de um círculo a partir de um raio.
     * @author Batista, C.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo é: " + area);

        scanner.close();
    }

}
