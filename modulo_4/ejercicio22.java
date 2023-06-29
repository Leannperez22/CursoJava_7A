public class Ejercicio22{
    public static void main(String[] args) {
        int contador = 1;

        while (contador <= 10) {
            System.out.println("Empleado " + contador + ":");

            String categoria = generarCategoriaAleatoria();
            int antiguedad = generarAntiguedadAleatoria();
            double sueldoBruto = generarSueldoBrutoAleatorio();

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

            System.out.println("Categoría: " + categoria);
            System.out.println("Antigüedad: " + antiguedad + " años");
            System.out.println("Sueldo Bruto: " + sueldoBruto);
            System.out.println("Sueldo Neto: " + sueldoNeto);
            System.out.println("-----------------------");

            contador++;
        }
    }

    public static String generarCategoriaAleatoria() {
        String[] categorias = {"A", "B", "C"};
        int indice = (int) (Math.random() * categorias.length);
        return categorias[indice];
    }

    public static int generarAntiguedadAleatoria() {
        return (int) (Math.random() * 15) + 1;
    }

    public static double generarSueldoBrutoAleatorio() {
        return Math.random() * 5000 + 1000;
    }
}
