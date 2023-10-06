import java.util.Scanner;

public class ex18 {

    /**
     * Crie um programa que receba uma frase e substitua todas
     * as letras "a" por "e"
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase : ");
        String frase = scanner.nextLine();

        System.out.println(frase.replace("a","e"));
        
        scanner.close();
    }
}
