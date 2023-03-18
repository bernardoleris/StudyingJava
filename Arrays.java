import java.util.Scanner;
public class Arrays {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            int [] vetor = new int [10];
            for(int i = 0; i<5; i++){
                vetor[i] = scan.nextInt();
            }
            for(int i = 0; i<5; i++){
                System.out.println(vetor[i]);
            }
        }
    }
}
