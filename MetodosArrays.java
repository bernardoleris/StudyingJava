import java.util.Arrays;
public class MetodosArrays {
    public static void main(String[] args){
        int[] num = {10, 5, 2, 40, 1, 11, 14, 16, 20, 37};
        final int tam = 10;
        int[] numeros = new int[tam];
        int p =2;
        for(int n:num){
            System.out.printf("%d - ", n);
        }
        System.out.print("\n");
        Arrays.sort(num);
        for(int n:num){
            System.out.printf("%d - ", n);
        }
        System.out.print("\n");
        Arrays.fill(numeros, 10);
        for(int n:numeros){
            System.out.printf("%d - ", n);
        }
        System.arraycopy(num, 0, numeros, 0, tam);
        System.out.print("\n");
        for(int n:numeros){
            System.out.printf("%d - ", n);
        }
        int pos = Arrays.binarySearch(numeros, p);
        System.out.printf("\nArrays são iguais: %s", Arrays.equals(num, numeros) ? "Sim" : "Não");
        System.out.printf("\nO elemento %d está no array? %s", p, pos>0 ? "Sim" : "Não");
    }
}