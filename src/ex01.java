import java.util.Scanner;

public class ex01 {

    /**
     * Escreva um programa que solicite ao usuário dois números e exiba
     * a soma, subtração, multplicação e divisão entre eles.
     * @author Batista, C.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de x : ");
        double x = scanner.nextDouble();
        System.out.println("Digite o valor de y: ");
        double y = scanner.nextDouble();

        double soma = x + y;
        double subtracao = x- y;
        int multiplicacao = (int) ((int) x*y);
        double divisao = x / y;

        System.out.println("O resultado das operações entre "+x+"e"+y+" é :");
        System.out.println("Soma : "+ soma);
        System.out.println("Subtração : "+ subtracao);
        System.out.println("Multiplicação : "+ multiplicacao );
        System.out.println("Divisão :"+ divisao);

        scanner.close();
    }

}
