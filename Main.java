
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== JUEGO DE LUCHA ===");

        // Seleccion del primer personaje
        System.out.println("\nSeleccione el personaje del jugador 1:");
        System.out.println("1. Guerrero");
        System.out.println("2. Ninja");
        int opcion1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nombre del jugador 1: ");
        String nombre1 = scanner.nextLine();

        // Seleccion del segundo personaje
        System.out.println("\nSeleccione el personaje del jugador 2:");
        System.out.println("1. Guerrero");
        System.out.println("2. Ninja");
        int opcion2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nombre del jugador 2: ");
        String nombre2 = scanner.nextLine();

        // Crear las fabricas
        FabricaPersonajes fabrica1;
        FabricaPersonajes fabrica2;

        if (opcion1 == 1) {
            fabrica1 = new FabricaGuerrero();
        } else {
            fabrica1 = new FabricaNinja();
        }

        if (opcion2 == 1) {
            fabrica2 = new FabricaGuerrero();
        } else {
            fabrica2 = new FabricaNinja();
        }

        // Crear los personajes
        Personaje jugador1 = fabrica1.crearPersonaje(nombre1);
        Personaje jugador2 = fabrica2.crearPersonaje(nombre2);

        // Iniciar el juego
        JuegoLucha juego = new JuegoLucha(jugador1, jugador2);

        juego.iniciarPelea();

        scanner.close();
    }
}
