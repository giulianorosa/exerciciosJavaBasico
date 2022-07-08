import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada do: " + tabuada);

        for (int i = 1; i <=10; i++) {
            int resultado;

            resultado = tabuada * i;

            System.out.println(tabuada + " X " + i + " = " + resultado);
        }
    }
}
