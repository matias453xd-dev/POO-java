package Gestor_de_tareas;

import java.util.Scanner;

public class Usuario {
    public Scanner input;
    public String nombre;
    private ListaDeTareas tareas;

    public Usuario(String nombre){
        this.nombre = nombre;
        // Inicializar los demás atributos
        this.input = new Scanner(System.in);
        this.tareas = new ListaDeTareas();
    }
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre = nombre; 
    }
    public void CrearTarea(Scanner input){
        System.out.println("Como se llamará la tarea: ");
        String name = input.next();
        tareas.agregarTarea(new Tarea(false, name));
    }
    public ListaDeTareas GetListaDeTareas(){
        return tareas;
    }
}
