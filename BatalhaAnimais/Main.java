import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        try (Scanner ler = new Scanner(System.in)) {
            int numero;
            Aranha a1 = null;
            Sapo s1 = null;
            Formiga f1 = null;
            do{
                System.out.println("1: Inserir animal.\n2: Alimentar animal.\n3: Atacar animal.\n4: Exibir informação sobre os animais.\n5: Finalizar sistema.");
                numero = ler.nextInt();
                if(numero==1){
                        System.out.println("1: Aranha.\n2: Sapo.\n3: Formiga.");
                        numero = ler.nextInt();
                        if(numero==1 && a1!=null){
                            System.out.println("Esse animal já foi inserido.\n");
                        }else if(numero==2 && s1!=null){
                            System.out.println("Esse animal já foi inserido.\n");
                        }else if(numero==3 && f1!=null){
                            System.out.println("Esse animal já foi inserido.\n");
                        }else{
                            if(numero==1){
                                System.out.println("Digite a velocidade, massa, força e o veneno da aranha;");
                                int velocidade = ler.nextInt();
                                int massa = ler.nextInt();
                                int forca = ler.nextInt();
                                int veneno = ler.nextInt();
                                a1 = new Aranha(velocidade, massa, forca, veneno);
                                a1.info();
                            }if(numero==2){
                                System.out.println("Digite a velocidade, massa e força do sapo;");
                                int velocidade = ler.nextInt();
                                int massa = ler.nextInt();
                                int forca = ler.nextInt();
                                s1 = new Sapo(velocidade, massa, forca);
                                s1.info();
                            }if(numero==3){
                                System.out.println("Digite a velocidade, massa e força da formiga;");
                                int velocidade = ler.nextInt();
                                int massa = ler.nextInt();
                                int forca = ler.nextInt();
                                f1 = new Formiga(velocidade, massa, forca);
                                f1.info();
                            }
                        }    
                }else if(numero==2){
                    System.out.println("Escolha um animal para alimentar:\n1: Aranha.\n2: Sapo.\n3: Formiga.");
                    numero = ler.nextInt();
                    System.out.println("Com quanta massa deseja alimentar o animal esolhido?");
                    int qtMassa = ler.nextInt();
                    if (numero == 1 && a1 != null) {
                        a1.comer(qtMassa);
                    } else if (numero == 2 && s1 != null) {
                        s1.comer(qtMassa);
                    } else if (numero == 3 && f1 != null) {
                        f1.comer(qtMassa);
                    } else {
                        System.out.println("Animal não encontrado.");
                    }
                }else if(numero==3){
                    System.out.println("Com qual animal deseja atacar? \n1: Aranha.\n2: Sapo.\n3: Formiga.");
                    numero = ler.nextInt();
                    System.out.println("Qual animal deseja atacar? \n1: Aranha.\n2: Sapo.\n3: Formiga.");
                    int animal2 = ler.nextInt();
                    if (numero == 1 && a1 != null && animal2==2 && s1 != null) {
                        a1.atacar(s1);
                    }else if(numero == 1 && a1 != null && animal2==3 && f1 != null){
                        a1.atacar(f1);
                    }else if(numero == 2 && s1 != null && animal2==1 && a1 != null){
                        s1.atacar(a1);
                    }else if(numero == 2 && s1 != null && animal2==3 && f1 != null){
                        s1.atacar(f1);
                    }else if(numero == 3 && f1 != null && animal2==1 && a1 != null){
                        f1.atacar(a1);
                    }else if(numero == 3 && f1 != null && animal2==2 && s1 != null){
                        f1.atacar(s1);
                    }else{
                        System.out.println("\nAlgum animal dessa relação não existe.\n");
                    }
                }else if(numero==4){
                    System.out.println("Deseja ver as informações de qual animal? \n1: Aranha.\n2: Sapo.\n3: Formiga.");
                    numero = ler.nextInt();
                    if(numero==1 && a1 != null){
                        a1.info();
                    }else if(numero==2 && s1 != null){
                        s1.info();
                    }else if(numero==3 && f1 != null){
                        f1.info();
                    }else{
                        System.out.println("\nEsse animal não existe.\n");
                    }
                }
            }while(numero!=5);
        }
    }
}

