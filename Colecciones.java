import java.util.ArrayList;
import java.util.Iterator;

public class Colecciones {
    public static void main(String[] args) {
        // Las colecciones son formas de almacenar, sacar y manipular datos

        // Java incluye interfases y clases para trabajar con colecciones
        // Algunas son: List(Con clases como ArrayList o LinkedList; Set: No permite datos duplicados(Con clases como HashSet);
        // Map: Es como un diccionario guardas elemento con una llave y un valor; Queue: Almacena datos en orden

        // Se usan iteradores para recorrer colecciones
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");

        Iterator<String> iterador = lista.iterator();
    
        // has.next() recorre un iterador segun su numero de elementos
        while (iterador.hasNext()) {
            String elemento = iterador.next();
            System.out.println(elemento); // Imprime A, B, C
            if(elemento.equals("C")){
                System.out.print(" mamut");
            }
        }
    }
}
