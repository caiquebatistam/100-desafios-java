import java.util.Scanner;

public class ex17 {

    /**
     * STRING
     *
     * Faça um programa que receba uma palavra e exiba cada letra
     * separadamente :
     * @author Batista, C.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a palavra : ");
        String palavra = scanner.nextLine();

        /* for (int i = 0; i < palavra.length(); i++) {
            System.out.println(palavra.charAt(i));
        }*/

        char[] letras = palavra.toCharArray();

        for(char index : letras){
            System.out.println(index);
        }
        scanner.close();
    }
}
