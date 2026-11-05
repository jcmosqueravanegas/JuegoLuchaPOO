
public class FabricaNinja extends FabricaPersonajes {

    @Override
    public Personaje crearPersonaje(String nombre) {
        return new Ninja(nombre);
    }

}
