package Sueldo_Empleados;

public class Trabajadores {
    private String nombre;
    private int horasTrabajadas;
    private double sueldoPorHora; // Cambiado a tipo primitivo
    private double sueldoTotal;

    public Trabajadores(String nombre, int horasTrabajadas, double sueldoPorHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.sueldoPorHora = sueldoPorHora;
    }

    public void calcularSueldo() {
        sueldoTotal = horasTrabajadas * sueldoPorHora;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public void setSueldoTotal(double sueldoTotal) {
        this.sueldoTotal = sueldoTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSueldoPorHora() {
        return sueldoPorHora;
    }

    public void setSueldoPorHora(double sueldoPorHora) {
        this.sueldoPorHora = sueldoPorHora;
    }

    @Override
    public String toString() {
        return "Trabajadores{" +
                "nombre='" + nombre + '\'' +
                ", horasTrabajadas=" + horasTrabajadas +
                ", sueldoPorHora=" + sueldoPorHora +
                ", sueldoTotal=" + sueldoTotal +
                '}';
    }
}
