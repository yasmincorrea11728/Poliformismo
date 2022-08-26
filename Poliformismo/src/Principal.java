import subclasse.Ave;
import subclasse.Cobra;
import subclasse.Mamifero;
import subclasse.Peixe;
import subclasse.Reptil;
import subclasse.Tartaruga;

public class Principal {
    public static void main(String[] args) throws Exception {
  
        //Animal a = new Animal(50.0, 17, 2, "preto");
        Mamifero m = new Mamifero(55.0, 17, 2, "preto");
        Reptil r = new Reptil(0.500, 4, 0, "Verde Neon");
        Peixe p = new Peixe(0.300, 1, 1, "Rosa");
        Ave a = new Ave(0.200, 5, 2, "Azul Celeste");
        
        m.alimentar();
        r.alimentar();
        p.alimentar();
        a.alimentar();

        Veterinario v = new Veterinario();
        v.atendeAnimal(m);
        v.atendeAnimal(r);
        v.atendeAnimal(p);
        v.atendeAnimal(a);

       Tartaruga t = new Tartaruga(100, 50, 4, "Verde");

       Cobra c = new Cobra(2, 3, 0, "Amarelo");

       c.locomover();

       t.locomover();
    }
}