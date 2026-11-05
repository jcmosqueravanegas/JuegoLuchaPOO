
public class Ninja extends Personaje {

    // Constructor
    public Ninja(String nombre) {
        super(nombre);
    }

    // Metodo propio del Ninja
    @Override
    public void atacar(Personaje oponente) {
        System.out.println("¡El ninja realiza un ataque veloz!");
        super.atacar(oponente);
    }
}
