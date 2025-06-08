package Gestor_de_tareas;

public class Tarea {
    // Si no se define el nivel de acceso de un atributo
    // este sera catalogado como default, en donde solo
    // será visible desde otras clases en el mismo packete
    public Boolean Estado;
    private String nombre;

    public Tarea(boolean Estado, String nombre){
        this.Estado = Estado;
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Boolean getEstado() {
        return Estado;
    }
    public void setEstado(Boolean estado) {
        Estado = estado;
    }
    @Override
    public String toString() {
        return "Tarea{" +
                "Estado=" + Estado +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
