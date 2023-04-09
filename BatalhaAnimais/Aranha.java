public class Aranha extends Animal{
    private int veneno;
    public Aranha(int vel, int massa, int forca, int veneno){
        super(vel, massa, forca);
        this.veneno = veneno;
    }

    @Override
    public void atacar(Animal a){
        if(this.getVida()){
            if(this.getForca()<a.getForca()){
                a.setMassa(this.getMassa()+a.getMassa());
                this.setVida(false);
            }else if((this.getForca()+this.veneno)>a.getForca() || this.getForca()>a.getForca()){
                this.setMassa(this.getMassa()+a.getMassa());
                a.setVida(false);
            }else{
                if(this.getMassa()>a.getMassa()){
                    a.setVida(false);
                    this.setMassa(this.getMassa()+a.getMassa());
                }else{
                    this.setVida(false);
                    a.setMassa(this.getMassa()+a.getMassa());
                }
            }
        }else{
            System.out.println("--------------------------------");
            System.out.println(this.getClass().toGenericString() + " está morto, não pode atacar.");
            System.out.println("--------------------------------");
        }
    }
    @Override
    public void info(){
        System.out.printf("Tipo: %s\n", getClass().toString());
        System.out.printf("Vivo: %s\n", this.getVida() ? "Sim" : "Não");
        System.out.printf("Massa: %d\n", this.getMassa());
        System.out.printf("Velocidade: %d\n", this.getVel());
        System.out.printf("Força: %d\n", this.getForca());
        System.out.printf("Veneno: %d\n", this.veneno);
        System.out.println("--------------------------------");

    }
}
