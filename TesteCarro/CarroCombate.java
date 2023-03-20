package TesteCarro;
public class CarroCombate extends Carro{
    private final int max_armamento = 100;
    private final int min_armamento = 0;
    private int qtdArmamento;
    public CarroCombate(String nome, int blindagem){
        super(nome);
        setArmamento(true);
        setBlindagem(blindagem);
        this.qtdArmamento = 100;
    }

    public void setQtdArmamento(int qtdArmamento){
        this.qtdArmamento = qtdArmamento;
        if(this.qtdArmamento>max_armamento){
            this.qtdArmamento = max_armamento;
        }else if(this.qtdArmamento<min_armamento){
            this.qtdArmamento = min_armamento;
        }
    }
    
    public int getArmamento(int qtdArmamento){
        return this.qtdArmamento;
    }
    
    public void atirar(){
        if(this.qtdArmamento>min_armamento){
            setQtdArmamento(this.qtdArmamento-1);
        }else{
            System.out.println("Sem armamento!");
        }
    }

    public void info(){
        super.info();
        System.out.printf("Quantidade de armamento...:%d\n", this.qtdArmamento);
    }
}
