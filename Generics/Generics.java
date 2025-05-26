package Generics;
import java.util.ArrayList;
public class Generics {
    public static void main(String[] args) {
        // Con generics se puede definir que tipo de datos
        // guardará una coleccion o clase desde el inicio
        // Se usan "<>" para definir su tipo
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Que tal");
        lista.add("Saludos");
        String elemento = lista.get(0);
        System.out.println(elemento);
        System.out.println(lista.get(1));

        Caja_generica<String> CajaDeString = new Caja_generica<>();
        // Guarda un objeto de tipo String
        CajaDeString.set("Helicoptero");
        CajaDeString.set("Auto");
        System.out.println(CajaDeString.get());

        Caja_generica<Integer> CajaDeEnteros = new Caja_generica<>();
        CajaDeEnteros.set(777);
        System.out.println(CajaDeEnteros.get());
        // No se pueden usar tipos como int, char o double con generics
        // Se deben escribir como Integer, Character, Double, etc

        // En resumen con generics se permite especificar el tipo que usaremos en arreglos, clases, etc.
        // Evitando así errores en tiempo de ejecucion
    }

}
