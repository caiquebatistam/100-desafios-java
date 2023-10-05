import java.util.Scanner;

public class ex11 {

    /**
     * Escreva um programa que calcule a velocidade média de um objeto,
     * utilizando a fórmula v = delta.s / delta.t, onde v é a velocidade
     * média, delta.s é a variação de espaço e delta.t é variação de tempo.
     *
     * @param args
     * @author Batista, C.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de deltaS :");
        double variacaoEspaco = scanner.nextDouble();
        System.out.println("Digite o valor de deltaT :");
        double variacaoTempo = scanner.nextDouble();

        double velocidadeMedia = variacaoEspaco / variacaoTempo;

        System.out.println("A velocidade média é: "+velocidadeMedia);

        scanner.close();
    }
}
