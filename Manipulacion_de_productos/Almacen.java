package Manipulacion_de_productos;

import java.util.ArrayList;

public class Almacen {
    private ArrayList<Producto> items;

    public Almacen(){
        this.items = new ArrayList<>();
    }
    public void agregarItem(Producto producto){
        items.add(producto);
    }
    public void MostrarItems(){
        if(items == null){
            System.out.println("No hay productos");
            return;
        }
        for(Producto a: items){
            System.out.println(a.toString());
        }
    }
    public void removerItem(String nombre){
        for(Producto i: items){
            if(i.getNombre().equalsIgnoreCase(nombre)){
                items.remove(i);
                System.out.println("Producto removido exitosamente");
                return;
            }
        }
        System.out.println("Producto no encontrado");
    }
    public void ordenarItems(){
        System.out.println("Productos en orden");
        items.stream()
            // Los ordena segun sus nombres
            .sorted((x,y) -> x.getNombre().compareTo(y.getNombre()))
            .forEach(x -> System.out.println(x.toString()));
    }
    // Filtrar segun el precio
    public void FiltrarItems(int value) {
        System.out.printf("Productos que valen entre %d y %d:\n", value - 200, value);
        items.stream()
             .filter(x -> x.getPrecio() >= (value - 200) && x.getPrecio() <= value)
             .forEach(x -> System.out.println(x));
    }
    // Numero de productos en el almacen
    public void ContarItems(){
        long contador = items.stream()  
                            .count();
        System.out.println("Hay "+ contador+" productos");
    }
    // Cambiar precio
    public void CambiarPrecio(String n, int a){
        for(Producto i: items){
            if(i.getNombre().equalsIgnoreCase(n)){
                i.setPrecio(a);
                System.out.println("El precio a sido modificado");
                return;
            }
        }
        System.out.println("Producto no encontrado");
    }
}

