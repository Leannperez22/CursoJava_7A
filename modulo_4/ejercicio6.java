import java.util.Scanner;

public class DeterminarCurso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el número de curso: ");
        int curso = sc.nextInt();
        
        String tipoCurso;
        
        if (curso == 0) {
            tipoCurso = "jardín de infantes";
        } else if (curso >= 1 && curso <= 6) {
            tipoCurso = "primaria";
        } else if (curso >= 7 && curso <= 12) {
            tipoCurso = "secundaria";
        } else {
            tipoCurso = "No se pudo determinar el tipo de curso";
        }
        
        System.out.println("Tipo de curso: " + tipoCurso);
        
        sc.close();
    }
}
