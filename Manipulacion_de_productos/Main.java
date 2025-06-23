package Manipulacion_de_productos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Almacen LaTorre = new Almacen();
        LaTorre.agregarItem(new Producto("Leche",1200));
        LaTorre.agregarItem(new Producto("QuesoEnTrozo",1500));
        LaTorre.agregarItem(new Producto("PanDeMolde",1800));
        LaTorre.agregarItem(new Producto("Galletas",800));
        LaTorre.agregarItem(new Producto("Lechuga",1000));
        LaTorre.agregarItem(new Producto("Paltas",2300));
        LaTorre.agregarItem(new Producto("Hamburguesas",1000));

        LaTorre.MostrarItems();
        System.out.println("--------------------");
        LaTorre.ContarItems();
        System.out.println("--------------------");
        LaTorre.FiltrarItems(1000);
        System.out.println("--------------------");
        LaTorre.ordenarItems();
        System.out.println("--------------------");
        LaTorre.CambiarPrecio("galletas", 900);
        System.out.println("--------------------");
        LaTorre.removerItem("Leche");
        System.out.println("--------------------");
        LaTorre.MostrarItems();
    }
}
