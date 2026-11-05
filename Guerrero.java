
public class Guerrero extends Personaje {

    // Constructor
    public Guerrero(String nombre) {
        super(nombre);
    }

    // Metodo propio del Guerrero
    @Override
    public void atacar(Personaje oponente) {
        System.out.println("¡El guerrero utiliza su fuerza!");
        super.atacar(oponente);
    }
}
