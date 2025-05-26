package Carreras_alumnos_etc;

public abstract class Persona {
    private String nombre;
    private String direccion;
    private String fecha_nacimiento;

    public Persona(String nombre, String direccion, String fecha_nacimiento){
        this.nombre = nombre;
        this.direccion = direccion;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void Obtenernombre(){
    }
    public void ObtenerDireccion(){
     
    }
    public void ObtenerFechaNacimiento(){
    }
    public void ActualizarDireccion(String d){
        direccion = d;
    }
    public String toString(){
        return "Nombre: "+nombre+"\n Direccion: "+ direccion+"\n Fecha de nacimiento: "+ fecha_nacimiento;
    }
}
