import java.util.Scanner;

public class ex09 {

    /**
     * Escreva um programa que calcule o perímetro e a área de um retângulo, utilizando as fórmulas
     *  p = 2(l + c) e A = lc   l-> largura   c-> comprimento
     *
     * @author Batista, C.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a largura : ");
        double largura = scanner.nextDouble();

        System.out.println("Digite a altura : ");
        double comprimento = scanner.nextDouble();


        double perimetro = 2 * (largura + comprimento);
        double area = largura * comprimento;

        System.out.println("O perímetro do retângulo é: " + perimetro);
        System.out.println("A área do retângulo é: " +area);

        scanner.close();
    }
}
