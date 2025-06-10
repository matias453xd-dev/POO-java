package Gestor_de_inventario;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Creando el almacen
        Almacen LaTorre = new Almacen();
        int opcion = 0;
        System.out.println("ALMACEN LATORRE");
        while(opcion != 4){
            System.out.println("1)Agregar productos, 2)Ordenar Productos, 3)Mostrar productos, 4)Salir");
            opcion = input.nextInt();
            switch(opcion){
                case 1:
                    LaTorre.AgregarProducto(input);
                    break;
                case 2:
                    LaTorre.OrdenarProductos();
                    break;
                case 3:
                    LaTorre.MostrarProductos();
                    break;
                case 4:
                    System.out.println("Saliendo....");
                    break;
                default: System.out.println("Ingrese una opcion valida");
            }
        }
    }
}
