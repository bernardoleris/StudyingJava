public class Paciente implements Comparable<Paciente>{
    String cpf, nome, doenca;
    int grau;
    
    public Paciente(){}
    
    public Paciente(String cpf, String nome, String doenca, int grau){
        setNome(nome);
        setCpf(cpf);
        setDoenca(doenca);
        setGrau(grau);
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getDoenca(){
        return doenca;
    }
    
    public void setDoenca(String doenca){
        this.doenca = doenca;
    }
    
    public int getGrau(){
        return grau;
    }
    
    public void setGrau(int grau){
        this.grau = grau;
    }

    public void listar(){
        System.out.println("\nNome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Doença: " + this.doenca);
        System.out.println("Grau de emergência: " + this.grau);
    }

    public int compareTo(Paciente outro){
        int urgenciaComparada = Integer.compare(outro.grau, this.grau);
            return urgenciaComparada;
    }
    @Override
    public String toString(){
            String pacienteStr = "CPF: " + this.getCpf() + ", Nome: "+ this.getNome() + ", Doença: " + this.getDoenca() + ", Grau de urgência: " + this.getGrau();
            return pacienteStr;
    }
   
}

