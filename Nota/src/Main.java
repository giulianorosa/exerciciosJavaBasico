import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int note;

        System.out.println("Nota: ");
        note = scan.nextInt();

        while(note < 0 || note > 10) {
            System.out.println("Nota Inválida! ");
            note = scan.nextInt();
        }
    }
}
