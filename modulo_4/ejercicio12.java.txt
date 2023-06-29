import java.util.Scanner;

public class DeterminarDocena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
        int numero = sc.nextInt();
        
        // Utilizando operadores lógicos "and"
        if (numero >= 1 && numero <= 12) {
            System.out.println("El número pertenece a la primera docena.");
        } else if (numero >= 13 && numero <= 24) {
            System.out.println("El número pertenece a la segunda docena.");
        } else if (numero >= 25 && numero <= 36) {
            System.out.println("El número pertenece a la tercera docena.");
        } else {
            System.out.println("El número " + numero + " está fuera de rango.");
        }
        
        // Utilizando operadores lógicos "or"
        if ((numero >= 1 && numero <= 12) || (numero >= 13 && numero <= 24) || (numero >= 25 && numero <= 36)) {
            System.out.println("El número pertenece a alguna de las docenas.");
        } else {
            System.out.println("El número " + numero + " está fuera de rango.");
        }
        
        sc.close();
    }
}
