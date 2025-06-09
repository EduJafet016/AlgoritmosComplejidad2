import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SuperMercado {
    public static void main(String[] args) {
        Queue<String> filaClientes = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int contadorClientes = 1; // Para asignar números únicos a clientes
        
        do {
            System.out.println("\n--- Menú Supermercado ---");
            System.out.println("1. Agregar cliente a la fila");
            System.out.println("2. Atender siguiente cliente");
            System.out.println("3. Mostrar fila actual");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente
            
            switch(opcion) {
                case 1:
                    String nombreCliente = "Cliente " + contadorClientes++;
                    filaClientes.add(nombreCliente);
                    System.out.println(nombreCliente + " agregado a la fila.");
                    break;
                case 2:
                    if (filaClientes.isEmpty()) {
                        System.out.println("No hay clientes en la fila.");
                    } else {
                        String atendido = filaClientes.poll();
                        System.out.println("Atendiendo a: " + atendido);
                    }
                    break;
                case 3:
                    if (filaClientes.isEmpty()) {
                        System.out.println("La fila está vacía.");
                    } else {
                        System.out.println("Clientes en la fila: " + filaClientes);
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
            
        } while (opcion != 4);
        
        scanner.close();
    }
}
