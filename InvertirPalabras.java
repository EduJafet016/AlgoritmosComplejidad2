import java.util.Scanner;
import java.util.Stack;

public class InvertirPalabras {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese una frase
        System.out.println("Ingrese una frase:");
        String frase = scanner.nextLine();
        
        // Crear una pila para almacenar las palabras
        // AQUÍ SE IMPLEMENTA LA PILA - Se usa Stack de Java para almacenar las palabras
        Stack<String> pila = new Stack<>();
        
        // Dividir la frase en palabras y agregarlas a la pila
        String[] palabras = frase.split(" ");
        for (String palabra : palabras) {
            pila.push(palabra);
        }
        
        // Construir la frase invertida
        StringBuilder fraseInvertida = new StringBuilder();
        while (!pila.isEmpty()) {
            fraseInvertida.append(pila.pop());
            if (!pila.isEmpty()) {
                fraseInvertida.append(" ");
            }
        }
        
        // Mostrar el resultado
        System.out.println("Frase original: " + frase);
        System.out.println("Frase invertida: " + fraseInvertida.toString());
        
        scanner.close();
    }
}
