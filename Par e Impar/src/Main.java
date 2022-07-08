import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int numerosPar = 0;
        int numerosImpar = 0;
        int count = 0;

        System.out.println("Quantos números iremos utilziar? ");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0){
                numerosPar++;
            } else if (numero % 2 == 1) {
                numerosImpar++;
            }

            count++;
        } while (count < quantNumeros);

            System.out.println("Quantidade de números pares: " + numerosPar);
            System.out.println("Quantidade de números impares: " + numerosImpar);

    }
}
