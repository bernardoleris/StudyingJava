import java.util.ArrayList;
import java.util.Collections;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoOrdemAtendimentos {
    public static void escreverOrdemAtendimentos(ArrayList<Paciente> listaPacientes) {
        // Ordena a lista pelo grau de emergência
        Collections.sort(listaPacientes);
        
        // Cria o arquivo de texto
        FileWriter arquivo = null;
        try {
            arquivo = new FileWriter("OrdemAtendimentos.txt");
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo.");
            e.printStackTrace();
        }
        
        // Escreve a lista de pacientes no arquivo
        try {
            for (Paciente paciente : listaPacientes) {
                arquivo.write(paciente.toString() + "\n");
            }
            arquivo.close();
            System.out.println("Arquivo criado com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo.");
            e.printStackTrace();
        }
    }
}