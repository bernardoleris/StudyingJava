import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
public class SalaEspera {
    ArrayList<Paciente> listaDePacientes;
    Scanner ler = new Scanner(System.in);
    
    public SalaEspera(){
        this.listaDePacientes = new ArrayList<>();
    }

    void inserePaciente(Paciente novoPaciente){
        listaDePacientes.add(novoPaciente);
    }

    void ordenarLista(){
        Collections.sort(listaDePacientes);
        System.out.println("\nOrdem de atendimento conforme urgência:");
        for(Paciente pacienteNaLista:listaDePacientes){
            pacienteNaLista.listar();
        }
    }

    public void removerPaciente(String cpf) {
        for (Iterator<Paciente> iterator = listaDePacientes.iterator(); iterator.hasNext();) {
            Paciente paciente = iterator.next();
            if (paciente.getCpf().equals(cpf)) {
                iterator.remove();
                return;
            }
        }
    }

    public void rastrearInfo(String cpf) {
        for (Iterator<Paciente> iterator = listaDePacientes.iterator(); iterator.hasNext();) {
            Paciente paciente = iterator.next();
            if (paciente.getCpf().equals(cpf)) {
                paciente.listar();
                return;
            }
        }
    }

    public int buscaCpf(String cpf) {
        for (Iterator<Paciente> iterator = listaDePacientes.iterator(); iterator.hasNext();) {
            Paciente paciente = iterator.next();
            if (paciente.getCpf().equals(cpf)) {
                return 1;
            }
        }
        return 0;
    }
    
    public ArrayList<Paciente> getListPaciente() {
        return listaDePacientes;
    }

}
