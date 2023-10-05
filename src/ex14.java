import java.util.Scanner;

public class ex14 {

    /**
     * Escreva um programa que leia a posição x e y de dois pontos
     * no plano cartesiano, e calcule a distância entre ambos.
     *
     * @author Batista, C.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as coordenadas do primeiro ponto : ");
        System.out.println("Coordenada x: ");
        double x1 = scanner.nextDouble();
        System.out.println("Coordenada y: ");
        double y1 = scanner.nextDouble();

        System.out.println("Digite as coordenadas do segundo ponto : ");
        System.out.println("Coordenada x: ");
        double x2 = scanner.nextDouble();
        System.out.println("Coordenada y: ");
        double y2 = scanner.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("A distância entre os pontos é : "+distancia);

        scanner.close();
    }
}
