import java.util.Scanner;

public class MenuRecursivo {

    // Función recursiva para calcular el factorial
    // La función se llama a sí misma una vez por cada número hasta llegar a 0.
    // Tiempo: O(n)
    //Espacio: O(n) debido al uso de la pila de llamadas recursivas. Por lo tanto, realiza n llamadas recursivas.

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Función recursiva para calcular un número de Fibonacci
    // Cada llamada a fibonacci(n) genera dos llamadas nuevas: fibonacci(n-1) y fibonacci(n-2).
    //Tiempo: O(2^n) → Exponencial, muy ineficiente para valores grandes de n.
    //Espacio: O(n) en la pila de llamadas (por la profundidad del árbol). Esto crea un árbol binario de llamadas.
    
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


// Para ingresar datos con el teclado
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Menú
            System.out.println("===== MENÚ =====");
            System.out.println("1. Calcular factorial");
            System.out.println("2. Calcular número de Fibonacci");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");

            // Validar si hay un entero como entrada
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingresa un número entero positivo para calcular su factorial: ");
                        int numFactorial = scanner.nextInt();
                        if (numFactorial < 0) {
                            System.out.println("⚠️ Debes ingresar un número positivo.");
                        } else {
                            int resultado = factorial(numFactorial);
                            System.out.println("El factorial de " + numFactorial + " es: " + resultado);
                        }
                        break;

                    case 2:
                        System.out.print("Ingresa la posición (mayor o igual a 0) en la serie de Fibonacci: ");
                        int posFibo = scanner.nextInt();
                        if (posFibo < 0) {
                            System.out.println("⚠️ Debes ingresar un número mayor o igual a 0.");
                        } else {
                            int resultado = fibonacci(posFibo);
                            System.out.println("El número de Fibonacci en la posición " + posFibo + " es: " + resultado);
                        }
                        break;

                    case 3:
                        System.out.println("👋 ¡Hasta luego, muchas gracias!");
                        break;

                    default:
                        System.out.println("❌ Opción no válida. Intenta de nuevo.");
                        break;
                }
            } else {
                System.out.println("❌ Entrada inválida. Por favor ingresa un número.");
                scanner.next(); // Limpiar entrada inválida
                opcion = 0; // Reiniciar para repetir el ciclo
            }

            System.out.println(); // Espacio entre repeticiones

        } while (opcion != 3);

        scanner.close();
    }
}
