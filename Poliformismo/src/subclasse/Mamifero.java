package subclasse;

import superclasse.Animal;

public class Mamifero extends Animal{

    private String cordePelo;

    public Mamifero(double peso, int idade, int numeroMembro, String cordePelo) {
        super(peso, idade, numeroMembro);
        this.cordePelo = cordePelo;        
    }

    public void alimentar(){
        System.out.println("Mamifero está mamando..");
    }
    public void locomover(){
        System.out.println("Mamifero está andando..");
    }
    
    public void emitirSom(){
        System.out.println("Mamifero está conversando.");
    }

    public String getCordePelo() {
        return cordePelo;
    }

    public void setCordePelo(String cordePelo) {
        this.cordePelo = cordePelo;
    
    }
    
}