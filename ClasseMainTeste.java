import java.nio.file.*;
import java.util.List;
public class ClasseMainTeste {
    public static void main(String[] args){
        Path arquivo = Paths.get("C:/Users/Bernardo Leris/Desktop/StudyingJava/texto.txt");
        
        try{
            List<String> linhas = Files.readAllLines(arquivo);
            for(String linha:linhas){
                System.out.println(linha);
            }
        }catch(Exception e){
            System.out.println("ERRO");
        }


    }
}
