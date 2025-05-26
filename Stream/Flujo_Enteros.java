package Stream;

import java.util.stream.IntStream;

public class Flujo_Enteros {
    public static void main(String[] args) {
        int[] numeros = {6, 3, 10, 73, 29, 50};
        // Voy a trabajar con Streams que permiten manejar datos de entrada(escribir) y salida(leer), en este caso de enteros
        // Tambien voy a usar expresiones lambda: (Parametros) -> (Funcion)

        IntStream.of(numeros).forEach(num -> System.out.printf("%d ", num)); 
        //Se vincula el flujo de enteros con el vector numeros
        // Por cada elemento del vector se ejecuta la funcion lambda del interior
        System.out.println();

        // Numero de elementos
        System.out.printf("Cuenta: %d%n",IntStream.of(numeros).count());

        // El numero minimo representado como entero(ya que se esta trabajando con enteros)
        System.out.printf("Minimo: %d%n",IntStream.of(numeros).min().getAsInt());

        // Suma
        System.out.printf("Suma: %d%n",IntStream.of(numeros).sum());

        // El promedio obtenido como double
        System.out.printf("Promedio: %.2f%n",IntStream.of(numeros).average().getAsDouble());

        // Mostrar los valores en orden ascendente
        System.out.println("Lista ordenada: ");
        IntStream.of(numeros).sorted().forEach(num -> System.out.printf("%d ", num));
    }
}
