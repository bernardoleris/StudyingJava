abstract class Animal implements SerVivo{
    private Boolean vivo;
    private int massa;
    private int forca;
    private int vel;
    
    public Animal(int vel, int massa, int forca){
        this.vivo = true;
        this.vel = vel;
        this.massa = massa;
        this.forca = forca;
    }
    public void setVida(Boolean vivo){
        this.vivo = vivo;
    }
    public Boolean getVida(){
        return this.vivo;
    }
    public void setForca(int forca){
        this.forca = forca;
    }
    public int getForca(){
        return this.forca;
    }
    public void setMassa(int massa){
        this.massa = massa;
    }
    public int getMassa(){
        return this.massa;
    }
    public int getVel(){
        return this.vel;
    }
    
    public void atacar(Animal a){
        if(this.vivo){
            if(this.forca>a.forca){
                this.massa+=a.getMassa();
                a.vivo = false;
            }if(this.forca<a.forca){
                a.setMassa(a.massa+this.massa);
                this.vivo = false;
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

    public void comer(int massa){
        this.setMassa(this.getMassa()+massa);
    }
        
    public void info(){
        System.out.printf("Tipo: %s\n", getClass().toString());
        System.out.printf("Vivo: %s\n", this.getVida() ? "Sim" : "Não");
        System.out.printf("Massa: %d\n", this.massa);
        System.out.printf("Velocidade: %d\n", this.vel);
        System.out.printf("Força: %d\n", this.forca);
        System.out.println("--------------------------------");

    }
}
    

