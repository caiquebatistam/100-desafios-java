import java.util.Scanner;

public class ex19 {

    /**
     * Escreva um programa que receba um nome
     * e verifique se o mesmo começa com a letra
     *  "A".
     *
     * @author Batista, C.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome a ser verificado : ");

        String nome = scanner.nextLine();

        //String primeiraLetra = Character.toString(nome.charAt(0));

        /*if(primeiraLetra == "a" || primeiraLetra == "A"){
            System.out.println("Essa palavra começa com A");
        }else{
            System.out.println("Essa palavra não começa com A");
        }*/

        String nomeMinusculo = nome.toLowerCase();

        if(nomeMinusculo.startsWith("a")){
            System.out.println("Essa palavra começa com a letra A");
        }else{
            System.out.println("Essa palavra não começa com a letra A");
        }
        scanner.close();
    }

}
