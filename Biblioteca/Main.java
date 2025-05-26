package Biblioteca;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Agregar libros a cada libreria
        Libreria lib1 = new Libreria("Accion");
        lib1.agregarlibro(new Libro("StarWars", 249, lib1.getGeneros()));
        Libreria lib2 = new Libreria("Aventura");
        lib2.agregarlibro(new Libro("Konosuba", 329, lib2.getGeneros()));
        Libreria lib3 = new Libreria("Terror");
        lib3.agregarlibro(new Libro("LasMontañasDeLaLocura", 129, lib3.getGeneros()));
        Libreria lib4 = new Libreria("Romance");
        lib4.agregarlibro(new Libro("RomeoYJulieta", 159, lib4.getGeneros()));
        Libreria lib5 = new Libreria("Suspenso");
        lib5.agregarlibro(new Libro("Dracula", 291, lib5.getGeneros()));

        // Crear una biblioteca, la cual posee una libreria con libros y estará organizada por generos
        Map<String, Libreria> biblioteca = new HashMap<>();   
        biblioteca.put("Accion", lib1);
        biblioteca.put("Aventura", lib2);
        biblioteca.put("Terror", lib3);
        biblioteca.put("Romance", lib4);
        biblioteca.put("Suspenso", lib5);

        // Crear un usuario
        System.out.println("Catalogo de libros");
        int opcion = 0;
        System.out.println("Ingrese su nombre: ");
        String nombre = input.next();
        System.out.println("Ingrese su ID");
        int Id = input.nextInt();
        Usuario user = new Usuario(nombre,Id);

        // Menú interactivo
        while(opcion != 5){
            System.out.println("1)Consultar libro, 2)Agregar libro, 3)Pedir libro, 4)Ver biblioteca, 5)Salir");
            opcion = input.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Introduzca el nombre del libro");
                    String name = input.next();
                    ConsultarLibro(name, biblioteca);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del libro: ");
                    String titulo = input.next();
                    System.out.println("Ingrese el numero de paginas: ");
                    int paginas = input.nextInt();
                    System.out.println("Ingrese el genero: ");
                    String theme = input.next();
                    Libro textbook = new Libro(titulo,paginas,theme);
                    // Agregar el libro en su respectiva libreria, si es que existe
                    IngresarLibro(textbook, biblioteca);
                    break;
                case 3:
                    RetirarLibro(user,input, biblioteca);
                    user.MostrarLibros();
                    break;
                case 4:
                    VisualizarBiblioteca(biblioteca);
                    break;
                case 5:
                    System.out.println("Saliendo...."); 
                    break;
            }
        }
    }
    // Me salta error en este metodo
    public static void ConsultarLibro(String nombre, Map<String, Libreria> lib){
        try {
            for (Map.Entry<String, Libreria> libro : lib.entrySet()) {
                // Encontrar el libro en la libreria
                // Se obtiene el valor del map que es una libreria, se utiliza el metodo BuscarLibro que retorna
                // el libro, se usa el motodo getNombre para obtener el nombre del libro y por ultimo se compara
                // con el parametro nombre
                if(libro.getValue().BuscarLibro(nombre).getNombre().equalsIgnoreCase(nombre)){
                    System.out.println(libro.getValue().BuscarLibro(nombre).toString());
                    break;
                }
            }
        } catch (NullPointerException e) {
           System.out.println(e);
        }
        
    }
    public static void IngresarLibro(Libro text, Map<String, Libreria> bibliotecas){
        // Recorrer la coleccion map
        try {
            for (Map.Entry<String, Libreria> libe : bibliotecas.entrySet()){
            if(libe.getValue().getGeneros().equalsIgnoreCase(text.getGenero())){
                libe.getValue().agregarlibro(text);
                System.out.println("Texto guardado con exito");
                break;
            }
        }
        } catch (NullPointerException e) {
            System.out.println("No se pudo guardar el texto");
        }
    }
    public static void VisualizarBiblioteca(Map<String, Libreria> bibliotecas){
        try {
            // Crear un iterador de colecciones con el metodo stream
            // primero se convierte al map en un conjunto de entradas
            for (Map.Entry<String, Libreria> entry : bibliotecas.entrySet()) {
            System.out.println("Género: " + entry.getKey());
            List<Libro> libros = entry.getValue().listado(); 
            if (libros.isEmpty()) {
                System.out.println("  No hay libros en esta librería.");
            } else {
                for (Libro libro : libros) {
                    System.out.println("  - " + libro);
                }
            }
            }
        }
        catch (Exception e) {
            System.out.println(e);
        
        } 
        

    }
    public static void RetirarLibro(Usuario user,Scanner input, Map<String, Libreria> entry){
        System.out.println("Buscar segun 1)Genero, 2)Nombre, 3)Salir");
        int opcion = input.nextInt();
        if(opcion == 3){
            return;
        }
        switch(opcion){
            case 1:
                System.out.println("Ingrese el genero que guste: ");
                String genero = input.next();
                try {
                    for (Map.Entry<String, Libreria> libe : entry.entrySet()){
                    if(libe.getKey().equalsIgnoreCase(genero)){
                        List<Libro> libros = libe.getValue().listado(); 
                        if (libros.isEmpty()) {
                            System.out.println("  No hay libros de este genero.");
                        } else {
                            for (Libro libro : libros) {
                                System.out.println("  - " + libro);
                            }
                            System.out.println("Elija un libro por su nombre: ");
                            String eleccion = input.next();
                            // Asumiendo que el nombre esta bien escrito
                            if(libe.getValue().BuscarLibro(eleccion).getEstado() == true){
                                // Se agrega el libro a la lista del usuario
                                user.Agregarlibro(libe.getValue().BuscarLibro(eleccion));
                                // El estado del libro pasa a ser falso
                                libe.getValue().BuscarLibro(eleccion).CambiarEstado(false);
                                break;
                            } else {
                                System.out.println("El libro no se encuentra disponible por el momento");
                                break;
                            }
                        }
                        }
                    }
                
            } catch (NullPointerException e) {
                System.out.println("Libro no encontrado");
            }
                break;
            case 2:
                System.out.println("Ingrese el nombre del libro: ");
                String nombre = input.next();
                try {
                    for (Map.Entry<String, Libreria> libe : entry.entrySet()){
                        if(libe.getValue().BuscarLibro(nombre).getNombre().equalsIgnoreCase(nombre)){
                            if(libe.getValue().BuscarLibro(nombre).getEstado() == true){
                                user.Agregarlibro(libe.getValue().BuscarLibro(nombre));
                                libe.getValue().BuscarLibro(nombre).CambiarEstado(false);
                                break;
                            } else {
                                System.out.println("El libro no se encuentra disponible por el momento");
                                break;
                            }
                        }
                    }
                } catch (NullPointerException e) {
                   System.out.println("Libro no encontrado");
                   break;
                }
                break;
            
        }
    }
}
