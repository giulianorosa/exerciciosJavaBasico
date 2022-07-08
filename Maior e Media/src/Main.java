import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;

        int media;
        int soma = 0;

        do {
            System.out.println("Digite um numero: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if(numero > maior) {
                maior = numero;
            }
            count++;
            media = soma / count;
        } while(count < 5);
        System.out.println("Seu maior numero foi: " + maior);
        System.out.println("A media desses numeros é: " + media);
    }
}
