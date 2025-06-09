import java.util.LinkedList;
import java.util.Scanner;

public class ListaTareas {
    private LinkedList<String> tareas;
    private Scanner scanner;

    public ListaTareas() {
        tareas = new LinkedList<>();
        scanner = new Scanner(System.in);
    }

    // Método para agregar una tarea desde la consola
    public void agregarTarea() {
        System.out.print("Ingrese la nueva tarea: ");
        String tarea = scanner.nextLine();
        tareas.add(tarea);
        System.out.println("Tarea agregada: " + tarea);
    }

    // Método para eliminar una tarea mostrando la lista numerada
    public void eliminarTarea() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas para eliminar.");
            return;
        }

        mostrarTareas();
        System.out.print("Ingrese el número de la tarea a eliminar: ");
        
        try {
            int numero = Integer.parseInt(scanner.nextLine());
            if (numero > 0 && numero <= tareas.size()) {
                String tareaEliminada = tareas.remove(numero - 1);
                System.out.println("Tarea eliminada: " + tareaEliminada);
            } else {
                System.out.println("Número de tarea inválido.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor ingrese un número válido.");
        }
    }

    // Método para mostrar todas las tareas
    public void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas pendientes");
        } else {
            System.out.println("\nLista de tareas pendientes:");
            for (int i = 0; i < tareas.size(); i++) {
                System.out.println((i + 1) + ". " + tareas.get(i));
            }
        }
    }

    // Método para mostrar el menú
    public void mostrarMenu() {
        System.out.println("\n--- MENÚ LISTA DE TAREAS ---");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Eliminar tarea");
        System.out.println("3. Mostrar tareas");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public void iniciar() {
        boolean salir = false;
        
        while (!salir) {
            mostrarMenu();
            String opcion = scanner.nextLine();
            
            switch (opcion) {
                case "1":
                    agregarTarea();
                    break;
                case "2":
                    eliminarTarea();
                    break;
                case "3":
                    mostrarTareas();
                    break;
                case "4":
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        ListaTareas lista = new ListaTareas();
        lista.iniciar();
    }
}