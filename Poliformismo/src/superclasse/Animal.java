package superclasse;

public abstract class Animal {

    protected double peso;
    protected int idade;
    protected int numeroMembro;

    public Animal(double peso, int idade, int numeroMembro) {
        this.peso = peso;
        this.idade = idade;
        this.numeroMembro = numeroMembro;
    }

    public abstract void locomover();
    

    public abstract void alimentar();

    public abstract void emitirSom();

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroMembro() {
        return numeroMembro;
    }

    public void setNumeroMembro(int numeroMembro) {
        this.numeroMembro = numeroMembro;
    }   
    
}
