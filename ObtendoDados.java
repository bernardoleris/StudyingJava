import java.util.Scanner;

public class ObtendoDados{
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            int n1 = 0;
            int n2 = 0;
            int res = 0;
            final int media = 60; //isso é uma constante
            String nome = "";
            System.out.println("Digite a primeira nota:");
            n1 = scan.nextInt();
            System.out.println("Digite a segunda nota:");
            n2 = scan.nextInt();
            res = n1+ n2;
            System.out.println("Digite o nome do aluno:");
            nome = scan.next();
            System.out.println(nome);
            if(res>=media){
                System.out.printf("A nota total do aluno %s foi %d, sendo assim, ele foi aprovado!", nome, res);
            }else{
                System.out.printf("A nota total do aluno %s foi %d, sendo assim, ele foi reprovado!", nome, res);
            }
        }
    }
}
