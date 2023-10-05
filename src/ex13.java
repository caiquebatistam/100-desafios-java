import java.util.Scanner;

public class ex13 {

    /**
     * Escreva um programa que calcule o trabalho realizado por uma
     * força que atua sobre um objeto, utilizando a fórmula T = F * d,
     * onde T é o trabalho, F é a força aplicada e d é a distância
     * percorrida pelo objeto.
     * @param args
     *
     * @author Batista, C.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da força aplicada : ");
        double forca = scanner.nextDouble();
        System.out.println("Digite o valor da distância : ");
        double distancia = scanner.nextDouble();

        double trabalho = forca * distancia;

        System.out.println("O valor do trabalho é : "+trabalho);

        scanner.close();
    }


}
