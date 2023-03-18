
public class Condicoes{
    public static void main(String[] args){
        int nota = 65;
        String res;
        res = (nota>=60 ? "Aprovado" : "Reprovado");
        System.out.println("Resultado: " + res);
        
        int pos = 6;
        switch(pos){
            case 1:
                System.out.println("Primeiro lugar!");
                break;
            case 2:
                System.out.println("Segunda lugar!");
                break;
            case 3:
                System.out.println("Terceiro lugar!");
                break;
            case 4: case 5: case 6:
                System.out.println("Prêmio de participação!");
                break;
        }
    } 
}
