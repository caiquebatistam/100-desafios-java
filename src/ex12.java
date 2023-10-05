import java.util.Scanner;

public class ex12 {
    /**
     * Escreva uma programa que calcule a energia cinética de um objeto
     * em movimento, utilizando a fórmula E= (mv^2) / 2, onde E é a energia
     * cinética, m é massa do objeto e v é velocidade.
     *
     * @author Batista, C.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor para massa : ");
        double massa = scanner.nextDouble();
        System.out.println("Digite o valor para velocidade : ");
        double velocidade = scanner.nextDouble();

        double energiaCinetica = massa * Math.pow(velocidade,2) / 2;

        System.out.println("Energia cinética é igual a : " +energiaCinetica);

        scanner.close();
    }

}
