import java.util.Scanner;

public class ex15 {

    /**
     * Crie um programa que solicite ao usuário o valor do raio de uma esfera
     * e calcule e exiba o seu volume:
     *
     * @author Batista, C.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do raio da esfera : ");
        double raio = scanner.nextDouble();

        // V = 4/3 π r³
        double volume = (4/3) * Math.PI * Math.pow(raio,3);

        System.out.println("O valor do volume é: "+volume);

        scanner.close();
    }

}
