import java.util.Scanner;

public class Meses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del mes: ");
        String nombreMes = scanner.nextLine();

        int cantidadDias = 0;
        switch (nombreMes.toLowerCase()) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                cantidadDias = 31;
                break;
            case "febrero":
                cantidadDias = 28;
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                cantidadDias = 30;
                break;
            default:
                System.out.println("Nombre de mes inválido.");
                System.exit(0);
        }

        System.out.println("El mes de " + nombreMes + " tiene " + cantidadDias + " días.");
    }
}
