public class Jogador{
    private int vidas = 0;
    private int num = 0;
    static boolean alerta = false;
    static int qtdJogadores = 0;
    static int pontosJogadores = 0;
    
    public Jogador(int num){
        this.num = num;
        this.vidas = 1;
        System.out.printf("Jogador de número %d criado.\n", num);
        pontos();
        Jogador.qtdJogadores++;
    }
    public int getVidas(){
        return this.vidas;
    }
    public void setVidas(int vidas){
        if(vidas>3){
            this.vidas = 3;
        }else if(vidas<0){
            this.vidas = 0;
        }else{
            this.vidas = vidas;
        }
    }
    public void pontos(){
        pontosJogadores+=10;
    }
    public void info(){
        System.out.printf("\nJogador de número: %d\n",  this.num);
        System.out.printf("Vidas: %d\n",  this.vidas);
        System.out.printf("Alerta: %s\n",  alerta ? "Sim" : "Não");
        System.out.printf("Jogadores: %d\n", qtdJogadores);
        System.out.printf("Pontos totais dos jogadores: %d\n", pontosJogadores);
        System.out.printf("-------------------------------------\n");
    }
    
}
 