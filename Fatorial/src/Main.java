import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um Numero para Fatorial: ");
        int fatorial = scan.nextInt();

        int resultado = 1;

        for(int i = fatorial; i >= 1 ; i--) {
            resultado *= i;
        }
        System.out.println("Seu resultado é: " + resultado);
    }
}
