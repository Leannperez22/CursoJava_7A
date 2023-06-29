public class CaracteristicasAuto {
    public static void main(String[] args) {
        char claseAuto = 'b'; // Puedes cambiar el valor aquí para probar diferentes casos
        
        System.out.println("Características del auto:");
        
        switch (claseAuto) {
            case 'a':
                System.out.println("- Tiene 4 ruedas y un motor.");
                break;
            case 'b':
                System.out.println("- Tiene 4 ruedas y un motor.");
                System.out.println("- Cierre centralizado y aire acondicionado.");
                break;
            case 'c':
                System.out.println("- Tiene 4 ruedas y un motor.");
                System.out.println("- Cierre centralizado, aire acondicionado y airbag.");
                break;
            default:
                System.out.println("Clase de auto no válida.");
                break;
        }
    }
}
