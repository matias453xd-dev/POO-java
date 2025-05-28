package Biblioteca;

import java.util.ArrayList;
public class Libreria {
    // Cada libreria guardara libros de un solo genero
    String generos;
    ArrayList<Libro> libros;

    public Libreria(String generos){
        this.generos = generos;
        this.libros = new ArrayList<Libro>();
    }

    public String getGeneros(){
        return generos;
    }
    public void agregarlibro(Libro libro){
        if(libro.getGenero().equals(generos)){
            libros.add(libro);
        } else {
            System.out.println("El genero del libro no coincide con esta libreria");
        }

    }
    public void MostrarLibros(){
        for(Libro book: libros){
            System.out.println(book);
        }
    }
    public Libro BuscarLibro(String nombre){
        for(Libro book: libros){
            if(book.getNombre().equalsIgnoreCase(nombre)){
                return book;
            }
        }
        return null;
    }
    public ArrayList<Libro> listado(){
        return libros;
    }
}
