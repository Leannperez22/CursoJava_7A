import java.util.Scanner;

public class ImprimirMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa el primer número entero: ");
        int num1 = sc.nextInt();
        
        System.out.print("Ingresa el segundo número entero: ");
        int num2 = sc.nextInt();
        
        System.out.print("Ingresa el tercer número entero: ");
        int num3 = sc.nextInt();
        
        int mayor = num1; // Suponemos que el primer número es el mayor
        
        if (num2 > mayor) {
            mayor = num2;
        }
        
        if (num3 > mayor) {
            mayor = num3;
        }
        
        System.out.println("El número mayor es: " + mayor);
        
        sc.close();
    }
}
