package Sueldo_Empleados;

public class Main {
    public static void main(String[] args) {
        Empresa Codelco = new Empresa("Codelco", "Santiago");
        Trabajadores trabajador1 = new Trabajadores("Juan", 40, 15000.0);
        Trabajadores trabajador2 = new Trabajadores("Matias", 38, 14000.0);
        Trabajadores trabajador3 = new Trabajadores("Vicente", 42, 17500.0);

        Codelco.agregarTrabajador(trabajador1);
        Codelco.agregarTrabajador(trabajador2);
        Codelco.agregarTrabajador(trabajador3);

        Codelco.CalSueldos();
        Codelco.sueldoSuperior();
        Codelco.mostrarSueldosSuperiores();

        // Después de aplicar impuestos
        System.out.println("Sueldos luego de aplicar impuestos: ");
        Codelco.Impuestos(); 
        Codelco.mostrarTrabajador();
    }
}