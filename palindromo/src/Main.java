import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);
            System.out.print("Digite uma palavra e descubra se ela é um palíndromo: ");
            String palavra = sc.nextLine();
            StringBuilder sb = new StringBuilder(palavra);
            String palavraInv = sb.reverse().toString();

            if (palavra.equals(palavraInv)) {
                System.out.println("Essa palavra é um palíndromo! " + palavra + " | " +palavraInv);
            }
            else {
                System.out.println("Essa palavra não é um palíndromo! " + palavra + " | " + palavraInv);
            }
        }
    }