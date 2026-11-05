
public class JuegoLucha {

    private Personaje jugador1;
    private Personaje jugador2;

    // Constructor
    public JuegoLucha(Personaje jugador1, Personaje jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    // Metodo para iniciar la pelea
    public void iniciarPelea() {

        System.out.println("\n¡COMIENZA LA PELEA!");
        System.out.println(
            jugador1.getNombre() + " VS " + jugador2.getNombre()
        );

        while (jugador1.estaVivo() && jugador2.estaVivo()) {

            turno(jugador1, jugador2);

            if (jugador2.estaVivo()) {
                turno(jugador2, jugador1);
            }
        }

        // Determinar el ganador
        if (jugador1.estaVivo()) {
            System.out.println(
                "\n¡" + jugador1.getNombre() + " HA GANADO!"
            );
        } else {
            System.out.println(
                "\n¡" + jugador2.getNombre() + " HA GANADO!"
            );
        }
    }

    // Metodo para controlar cada turno
    private void turno(Personaje atacante, Personaje defensor) {

        System.out.println("\nTurno de " + atacante.getNombre());

        atacante.atacar(defensor);

        System.out.println(
            defensor.getNombre() + " tiene "
            + defensor.getPuntosDeVida() + " HP restantes."
        );
    }
}
