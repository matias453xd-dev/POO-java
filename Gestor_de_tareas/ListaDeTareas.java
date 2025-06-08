package Gestor_de_tareas;

import java.util.ArrayList;

public class ListaDeTareas {
    private ArrayList<Tarea> pendientes;
    private ArrayList<Tarea> completadas;

    public ListaDeTareas() {
        this.pendientes = new ArrayList<>();
        this.completadas = new ArrayList<>();
    }
    public void agregarTarea(Tarea tarea) {
        pendientes.add(tarea);
    }
    public void completarTarea(String nombre) {
        for (Tarea tarea : pendientes) {
            if (tarea.getNombre().equalsIgnoreCase(nombre)) {
                tarea.setEstado(true);
                completadas.add(tarea);
                pendientes.remove(tarea);
                return;
            }
        }
        System.out.println("Tarea no encontrada: " + nombre);
    }
    public void MostrarTareas(){
        System.out.println("TAREAS PENDIENTES");
        for(Tarea tareas: pendientes){
            System.out.println(tareas.toString());
        }
        System.out.println("TAREAS COMPLETADAS");
        for(Tarea homework: completadas){
            System.out.println(homework.toString());
        }
    }
}
