
public class FabricaGuerrero extends FabricaPersonajes {

    @Override
    public Personaje crearPersonaje(String nombre) {
        return new Guerrero(nombre);
    }

}
