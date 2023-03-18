import java.security.SecureRandom;
public class Matrizes {
    public static void main(String[] args){
        final int linhas = 3;
        final int colunas = 5;
        int [][] num = {{10,20,30,40,50},{1,2,3,4,5},{100,200,300,400,500}};
        int[][] matriz = new int[linhas][colunas];
        for(int l=0; l<linhas; l++){
            for(int c=0; c<colunas; c++){
                matriz[l][c] = new SecureRandom().nextInt(100);
            }
        }
        for(int l=0; l<linhas; l++){
            for(int c=0; c<colunas; c++){
                System.out.printf("%2d ", matriz[l][c]);
            }
            System.out.print("\n");
        }
        for(int[] n:num){
            for(int v:n){
                System.out.printf("%3d ", v);
            }
            System.out.printf("\n");
        }
    }
}

