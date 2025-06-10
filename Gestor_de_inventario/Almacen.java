package Gestor_de_inventario;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Almacen {
    ArrayList<Productos> gondolaz;

    public Almacen(){
        this.gondolaz = new ArrayList<>();
    }
    public void AgregarProducto(Scanner input){
        System.out.println("Nombre del item: ");
        String nombre = input.next();
        System.out.println("Precio: ");
        Double precio = input.nextDouble();
        System.out.println("Categoria: ");
        String categoria = input.next();

        gondolaz.add(new Productos(nombre,precio,categoria));
    }
    public void MostrarProductos(){
        for(Productos items: gondolaz){
            System.out.println("| "+items.toString());
        }
    }
    public void OrdenarProductos(){
        try {
            gondolaz.sort(Comparator.comparing(Productos::getCategoria));
            System.out.println("Productos ordenados por categoría:");
            MostrarProductos();
        } catch (Exception e) {
            System.out.println(e);
        }
}
    
}
