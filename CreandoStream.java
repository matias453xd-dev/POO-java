import java.util.*;
import java.util.stream.Collectors;
// La interfaz Stream<T> es una secuencia de elementos que soporta diferentes operaciones para crear, transformar y manipular datos
// Contiene metodos para manipular colecciones, arreglos, etc
public class CreandoStream {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        // Crear un Stream a partir de una lista,
        // Esto es una copia temporal de la lista original  
        List<Integer> pares = numeros.stream()
                                     .filter(n -> n % 2 == 0) // Filtrar los numeros pares
                                     .collect(Collectors.toList()); // Recolectar los numeros pares en una coleccion, en este caso una lista

        System.out.println(pares); // [2, 4, 6]
        System.out.println(numeros); // [1, 2, 3, 4, 5, 6]
        
    }
}

