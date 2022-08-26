package subclasse;

import javax.print.DocFlavor.STRING;

import superclasse.Animal;

public class Ave extends Animal{

private String corPena;

public Ave(double peso, int idade, int numeroMembro, String corPena) {
    super(peso, idade, numeroMembro);
    this.corPena = corPena;
}

public void locomover() {
    System.out.println("Ave está voando.");
}

public void alimentar() {
    System.out.println("Ave está alimentando.");
}

public void emitirSom() {
      System.out.println("piu piu piu");
    }
    public void fazendo(){
        System.out.println("Ave acaba de comprar a casa propria pela MRV");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
} 