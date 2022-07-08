import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int year;
        int next;


        while(true){
            System.out.println("Nome: ");
            name = scan.next();
                if(name.equals("0")) break;
            System.out.println("Idade: ");
            year = scan.nextInt();
        }
    }
}
