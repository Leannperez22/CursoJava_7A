import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa un número para obtener su tabla de multiplicar: ");
        int numero = sc.nextInt();
        
        System.out.println("Tabla de multiplicar del número " + numero + ":");
        
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
        sc.close();
    }
}
