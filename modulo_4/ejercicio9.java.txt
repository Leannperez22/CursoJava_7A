import java.util.Scanner;

public class Ejercicio8 con sent. and{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Jugador 1:");
        System.out.print("Ingrese su elección (0 - piedra, 1 - papel, 2 - tijera): ");
        int eleccionJugador1 = scanner.nextInt();
        
        System.out.println("Jugador 2:");
        System.out.print("Ingrese su elección (0 - piedra, 1 - papel, 2 - tijera): ");
        int eleccionJugador2 = scanner.nextInt();
        
        if (eleccionJugador1 == eleccionJugador2) {
            System.out.println("Empate");
        } else if (eleccionJugador1 == 0 && eleccionJugador2 == 2) {
            System.out.println("Jugador 1 es el ganador");
        } else if (eleccionJugador1 == 1 && eleccionJugador2 == 0) {
            System.out.println("Jugador 1 es el ganador");
        } else if (eleccionJugador1 == 2 && eleccionJugador2 == 1) {
            System.out.println("Jugador 1 es el ganador");
        } else {
            System.out.println("Jugador 2 es el ganador");
        }
    }
}

