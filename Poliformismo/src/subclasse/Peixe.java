package subclasse;

import superclasse.Animal;

public class Peixe extends Animal{

    private String corEscama;

    public Peixe(double peso, int idade, int numeroMembro, String corEscama){
        super(peso, idade, numeroMembro);
        this.corEscama = corEscama;
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public void locomover() {
        System.out.println("Peixe está nadando.");
    }

    public void alimentar() {
        System.out.println("Peixe está filtrando a água.");
    }

    public void emitirSom() {
        System.out.println("glub glub glub");
    }
    public void soltarBolha(){
        System.out.println("Blou blou blou");
    }
}