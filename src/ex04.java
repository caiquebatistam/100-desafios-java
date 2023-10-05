import java.util.Scanner;

public class ex04 {

    /**
     * Escreva um programa que calcule a média geométrica entre três
     * números informados pelo usuário.
     * @author Batista, C.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digites as três notas respectivamentes: ");

        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();

        double mediaGeometrica = Math.pow(n1*n2*n3, 1.0/3.0);

        System.out.println("A média geométrica é: "+ mediaGeometrica);

        scanner.close();
    }



}
