import java.util.Scanner;

public class IdentificarPuesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el puesto obtenido (1, 2, 3): ");
        int puesto = sc.nextInt();
        
        String mensaje;
        
        switch (puesto) {
            case 1:
                mensaje = "Las maquinas obtienen la medalla de oro.";
                break;
            case 2:
                mensaje = "Los cebollitas obtienen la medalla de plata.";
                break;
            case 3:
                mensaje = "El tercero obtiene la medalla de bronce.";
                break;
            default:
                mensaje = "Para el resto, sigan participando. Son malos.";
                break;
        }
        
        System.out.println(mensaje);
        
        sc.close();
    }
}
