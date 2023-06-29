import java.util.Random;

public class NumerosAzar {
    public static void main(String[] args) {
        Random random = new Random();
        int contador = 0;
        int suma = 0;
        
        System.out.println("Números generados al azar:");
        
        while (contador < 10) {
            int numero = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
            System.out.println(numero);
            suma += numero;
            contador++;
        }
        
        double promedio = (double) suma / 10;
        
        System.out.println("Suma de los números: " + suma);
        System.out.println("Promedio de los números: " + promedio);
    }
}