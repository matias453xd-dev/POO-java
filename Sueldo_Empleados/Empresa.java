package Sueldo_Empleados;

import java.util.ArrayList;

public class Empresa {
    ArrayList<Trabajadores> trabajadores = new ArrayList<>();
    ArrayList<Trabajadores> trabajadoresSueldoSuperior = new ArrayList<>();
    private String nombre;
    private String direccion;

    public Empresa(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void agregarTrabajador(Trabajadores trabajador) {
        trabajadores.add(trabajador);
    }

    public void mostrarTrabajador() {
        for (Trabajadores trabajador : trabajadores) {
            System.out.println(trabajador.toString());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "trabajadores=" + trabajadores +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    public void sueldoSuperior() {
        for (Trabajadores trabajador : trabajadores) {
            if (trabajador.getSueldoTotal() > 200000.0) {
                trabajadoresSueldoSuperior.add(trabajador);
            }
        }
    }

    public void mostrarSueldosSuperiores() {
        System.out.println("Trabajadores con sueldo superior a 200000: ");
        for (Trabajadores trabajador : trabajadoresSueldoSuperior) {
            System.out.println(trabajador.toString());
        }
    }
    // Calcular impuestos según el sueldo total
    public void Impuestos() { // Cambiado a minúscula
        for (Trabajadores trabajador : trabajadores) {
            if (trabajador.getSueldoTotal() >= 200000.0) {
                trabajador.setSueldoTotal(trabajador.getSueldoTotal() * 0.90);
            } else if(trabajador.getSueldoTotal() >= 150000.0 && trabajador.getSueldoTotal() < 200000.0) {
                trabajador.setSueldoTotal(trabajador.getSueldoTotal() * 0.94);
            } else if(trabajador.getSueldoTotal() < 150000.0) {
                trabajador.setSueldoTotal(trabajador.getSueldoTotal() * 0.98);
            } 
            }
    }
    

    public void CalSueldos() { // Cambiado a minúscula
        for (Trabajadores trabajador : trabajadores) {
            trabajador.calcularSueldo();
        }
    }
}
