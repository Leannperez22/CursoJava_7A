import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primera evaluación: ");
        double evaluacion1 = scanner.nextDouble();

        System.out.println("Ingrese la segunda evaluación: ");
        double evaluacion2 = scanner.nextDouble();

        System.out.println("Ingrese la tercera evaluación: ");
        double evaluacion3 = scanner.nextDouble();

        double promedio = (evaluacion1 + evaluacion2 + evaluacion3) / 3;

        System.out.println("El promedio del alumno es: " + promedio);

        if (promedio >= 7) {
            System.out.println("El alumno está aprobado.");
        } else {
            System.out.println("El alumno está reprobado.");
        }
    }
}
