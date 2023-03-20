package TesteVeiculos;
public class Veiculo{
    private String nome;
    private int tipo;
    public Veiculo(String nome, int tipo){
        this.nome = nome;
        this.tipo = tipo;
    }
    public void info(){
        System.out.printf("Nome do veículo: %s", nome);
        System.out.printf("\nTipo do veículo: %d", tipo);
    }
}
