import java.util.ArrayList;
public class Arreglo_de_listas {
    public static void main(String[] args) {
        // Crear un ArrayList de tipo String
        ArrayList<String> lista = new ArrayList<>();

        // Agregar elementos
        lista.add("Manzana");
        lista.add("Banana");
        lista.add("Naranja");

        // Acceder a elementos
        System.out.println("El primer elemento es: " + lista.get(0));

        // Eliminar un elemento
        lista.remove("Banana");

        // Imprimir la lista
        System.out.println("Lista actual: " + lista);
        // El importar la clase de Array list permite crear arreglos
        // sin preocuparce por el tamaño inicial y siendo
        // mas simple que los vectores tradicionales
    }
}

