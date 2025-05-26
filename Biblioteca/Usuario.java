package Biblioteca;

import java.util.ArrayList;

public class Usuario {
    String nombre;
    int ID;
    ArrayList<Libro> LibrosAdquiridos;

    public Usuario(){
    }
    public Usuario(String nombre, int ID){
        this.nombre = nombre;
        this.ID = ID;
        this.LibrosAdquiridos = new ArrayList<Libro>();
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public ArrayList<Libro> getLibrosAdquiridos(){
        return LibrosAdquiridos;
    }
    public void Agregarlibro(Libro libro){
        LibrosAdquiridos.add(libro);
    }
    public void EliminarLibro(Libro libro){
        LibrosAdquiridos.remove(libro);
    }
    public void MostrarLibros(){
        System.out.println("Libros adquiridos:");
        for(Libro book: LibrosAdquiridos){
            System.out.println(book);
        }
    }
}
