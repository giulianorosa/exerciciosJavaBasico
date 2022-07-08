import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);

            numerosAleatorios[i] = numero;

        }

        System.out.println("\nNumeros Aleatórios: ");
        for (int num: numerosAleatorios
             ) {
            System.out.println(num + " ");
        }

        System.out.println("\n Sucessores de Numeros Aleatórios: ");
        for (int num: numerosAleatorios
        ) {
            System.out.println((num + 1) + " ");
        }
    }
}
