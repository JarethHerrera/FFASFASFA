/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dafafaff;

/**
 *
 * @author eltro
 */
public class DAFAFAFF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Saludar");
            System.out.println("2. Sumar dos números");
            System.out.println("3. Mostrar fecha actual");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    saludar();
                    break;
                case 2:
                    sumar(sc);
                    break;
                case 3:
                    mostrarFecha();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 4); // ← esto hace que regrese al menú

        sc.close();
    }

    public static void saludar() {
        System.out.println("¡Hola! Bienvenido al programa.");
    }

    public static void sumar(Scanner sc) {
        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();

        double resultado = num1 + num2;
        System.out.println("La suma es: " + resultado);
    }

    public static void mostrarFecha() {
        LocalDateTime fecha = LocalDateTime.now();
        System.out.println("Fecha actual: " + fecha);
    }
}
    
    

