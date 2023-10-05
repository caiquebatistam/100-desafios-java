import java.util.Scanner;

public class ex10 {

    /**
     * Escreva um programa que calcule o perímetro e a área de um
     * triângulo, utilizando as fórmulas |P= a + b + c| e |A=(b*h)/2|,
     * onde a,b e c são os lados do triângulo e h é altura relativa ao lado b.
     *
     * @author Batista, C.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado A do triângulo: ");
        double ladoA = scanner.nextDouble();
        System.out.println("Digite o lado B do triângulo: ");
        double ladoB = scanner.nextDouble();
        System.out.println("Digite o lado C do triângulo: ");
        double ladoC = scanner.nextDouble();

        System.out.println("Digite a altura 'h' relativa ao lado b do triângulo: ");
        double altura = scanner.nextDouble();

        double perimetro = ladoA+ladoB+ladoC;
        double area = (ladoB * altura) / 2;

        System.out.println("O perímetro do triângulo é: "+perimetro);
        System.out.println("A área do triângulo é: " +area);
        scanner.close();
    }

}
