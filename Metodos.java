public class Metodos {
    public static void main(String [] args){
        System.out.println(soma( 10, 20, 30, 40));
    }

    public static int soma(int... numeros){
        int res = 0;
        for(int n:numeros){
            res+=n;
        }
        return res;
    }
}
