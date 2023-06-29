import java.util.Scanner;

public class Sueldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la categoría del empleado (A, B o C): ");
        String categoria = scanner.nextLine();

        System.out.print("Ingrese la antigüedad del empleado en años: ");
        int antiguedad = scanner.nextInt();

        System.out.print("Ingrese el sueldo bruto del empleado: ");
        double sueldoBruto = scanner.nextDouble();

        double aumentoAntiguedad;
        if (antiguedad >= 1 && antiguedad <= 5) {
            aumentoAntiguedad = 0.05;
        } else if (antiguedad >= 6 && antiguedad <= 10) {
            aumentoAntiguedad = 0.1;
        } else {
            aumentoAntiguedad = 0.3;
        }

        double aumentoCategoria;
        if (categoria.equalsIgnoreCase("A")) {
            aumentoCategoria = 1000;
        } else if (categoria.equalsIgnoreCase("B")) {
            aumentoCategoria = 2000;
        } else {
            aumentoCategoria = 3000;
        }

        double sueldoNeto = sueldoBruto + (sueldoBruto * aumentoAntiguedad) + aumentoCategoria;

        System.out.println("El sueldo neto del empleado es: " + sueldoNeto);
    }
}
