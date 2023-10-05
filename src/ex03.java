import java.util.Scanner;

public class ex03 {
    /**
     * Crie um programa que calcule e exiba a média aritmética
     * de três notas informadas pelo usuário.
     * @author Batista, C.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double n3 = scanner.nextDouble();

        double media = (n1+n2+n3)/3;

        System.out.println("A sua média é: "+ media);

        scanner.close();
    }
}
