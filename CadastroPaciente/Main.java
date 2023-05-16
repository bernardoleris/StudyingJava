import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int grau, numero;
        String nome, doenca, cpf;
        Paciente novoPaciente = new Paciente();
        Scanner ler;
        SalaEspera novaSala = new SalaEspera();
        ler = new Scanner(System.in);
        
        do{
            System.out.println("\n-------- MENU --------");
            System.out.println("Escolha uma opção:");
            System.out.println("1: Cadastrar paciente.");
            System.out.println("2: Informações sobre o paciente.");
            System.out.println("3: Ordem dos atendimentos.");
            System.out.println("4: Remover paciente.");
            System.out.println("5: Finalizar.");
            numero = ler.nextInt();
            ler.nextLine();
            switch(numero){
                case 1:

                    System.out.println("Nome: ");
                    nome = ler.nextLine();
                    System.out.println("CPF: ");
                    cpf = ler.nextLine();
                    System.out.println("Doença: ");
                    doenca = ler.nextLine();
                    System.out.println("Grau de emergência: ");
                    grau = ler.nextInt();
                    novoPaciente = new Paciente(cpf, nome, doenca, grau);
                    if(novaSala.buscaCpf(cpf)==0){
                        novaSala.inserePaciente(novoPaciente);
                    }else{
                        System.out.println("\nJá existe um paciente cadastrado com esse CPF.");
                    }
                break;
                case 2:
                System.out.println("Digite o CPF do paciente: ");
                cpf = ler.nextLine();
                if(novaSala.buscaCpf(cpf)==1){
                    novaSala.rastrearInfo(cpf);
                }else{
                    System.out.println("\nNão existe um paciente cadastrado com esse CPF.");
                }
                break;
                case 3:
                    novaSala.ordenarLista();
                break;
                case 4:
                    System.out.println("Digite o CPF do paciente que deseja remover: ");
                    cpf = ler.nextLine();
                    if(novaSala.buscaCpf(cpf)==1){
                        novaSala.removerPaciente(cpf);
                    }else{
                        System.out.println("\nNão existe um paciente cadastrado com esse CPF.");
                    }
            }
        }while(numero!=5);
        ler.close();
         
        ArquivoOrdemAtendimentos.escreverOrdemAtendimentos(novaSala.listaDePacientes);
        
    }
}