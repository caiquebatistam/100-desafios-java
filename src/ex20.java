import java.util.Scanner;

public class ex20 {

    /**
     * Faça um programa que leia uma palavra e verifique
     * se a mesma é palíndromo(se pode ser lida da mesma forma
     * de trás para frente).
     *
     * @author Batista,C.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra : ");
        String palavra = scanner.nextLine();

        String palavraFormatada = palavra.replace("\\s+", "").toLowerCase();
        boolean polindromo = true;

        for(int i = 0; i < palavraFormatada.length() / 2; i++){
            char a = palavraFormatada.charAt(i);
            char b = palavraFormatada.charAt(palavraFormatada.length() - i - 1);
            if (a != b){
                polindromo = false;
                break;
            }
        }
        if(polindromo){
            System.out.println("A palavra é um políndromo");
        }else{
            System.out.println("A palavra não é um políndromo");
        }

        scanner.close();
    }

}
