import java.util.Scanner;

public class ex16 {

    /**
     * STRINGS
     *
     * Crie um programa que leia duas palavras e as concatene,
     * exibindo a palavra resultante :
     *
     * @author Batista, C.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira palavra : ");
        String primeiraPalavra = scanner.nextLine();

        System.out.println("Digite a segunda palavra : ");
        String segundaPalavra = scanner.nextLine();

        String concatenacao = primeiraPalavra + " " + segundaPalavra;

        System.out.println(concatenacao);

        scanner.close();
    }


}
