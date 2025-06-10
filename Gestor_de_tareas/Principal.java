package Gestor_de_tareas;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Usuario estudiante1 = new Usuario("Matias");
        int opcion = 0;
        while(opcion != 4){
            System.out.println("1)Crear tarea, 2)Marcar como completas, 3)Mostrar tareas, 4)Salir");
            opcion = input.nextInt();
            switch(opcion){
                case 1:
                    Creartarea(input, estudiante1);
                    System.out.println("Tarea creada");
                    break;
                case 2:
                    ImprimirLista(estudiante1);
                    System.out.println("Ingrese el nombre de la tarea a completar: ");
                    String listo = input.next();
                    Completartarea(listo, estudiante1);
                    System.out.println("Tarea completada");
                    break;
                case 3:
                    ImprimirLista(estudiante1);
                    break;
                case 4:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Elija una opcion valida");
            }
        }
    }
    public static void Creartarea(Scanner input, Usuario user){
        user.CrearTarea(input);
    }
    public static void Completartarea(String nombre,Usuario m){
        ListaDeTareas tar = m.GetListaDeTareas();
        tar.completarTarea(nombre);
    }
    public static void ImprimirLista(Usuario user){
        try {
            ListaDeTareas lista = user.GetListaDeTareas();
            lista.MostrarTareas();
        } catch (NullPointerException e) {
            System.out.println("Lista vacía");
        }
    }
}
