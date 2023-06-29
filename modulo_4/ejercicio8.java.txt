import java.util.Scanner;

public class JuegoPiedraPapelTijera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Competidor 1: Ingresa tu elección (0 - Piedra, 1 - Papel, 2 - Tijera): ");
        int competidor1 = sc.nextInt();
        
        System.out.print("Competidor 2: Ingresa tu elección (0 - Piedra, 1 - Papel, 2 - Tijera): ");
        int competidor2 = sc.nextInt();
        
        if (competidor1 == competidor2) {
            System.out.println("¡Es un empate!");
        } else if ((competidor1 == 0 && competidor2 == 2) || (competidor1 == 1 && competidor2 == 0) || (competidor1 == 2 && competidor2 == 1)) {
            System.out.println("¡El competidor 1 es el ganador!");
        } else {
            System.out.println("¡El competidor 2 es el ganador!");
        }
        
        sc.close();
    }
}
