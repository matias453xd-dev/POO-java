package Empleado;
//No es necesario declarar los metodos de una interfaz en una clase abstracta
//Pero si es necesario declararlos en las subclases que tienen herencia de esta
public abstract class Empleado implements PorPagar{
    private String nombre;
    private String apellido;
    private int NumeroSeguro;

    public Empleado(String nombre, String apellido, int NumeroSeguro){
        this.nombre = nombre;
        this.apellido = apellido;
        this.NumeroSeguro = NumeroSeguro;
    }
    public abstract double sueldo();
    public String toString(){
        return "Nombre = "+nombre+", Apellido = "+apellido+"NumeroDeSeguro = "+NumeroSeguro;
    }
}
