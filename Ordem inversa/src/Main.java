import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] vetor= {120, 21, -3, 456, 51, 68};

        int count = 0;

        while(count < (vetor.length)) {
            System.out.println(vetor[count] + " ");
            count++;
        }

        System.out.println("\n ORDEM INVERSA !! \n");

        for (int i = (vetor.length - 1); i >= 0  ; i--){
            System.out.println(vetor[i] + " ");
        }

    }
}
