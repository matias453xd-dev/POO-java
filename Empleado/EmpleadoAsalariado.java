package Empleado;

public class EmpleadoAsalariado extends Empleado{
    private double salarioSemanal;
    public EmpleadoAsalariado(String nombre, String apellido, int NumeroSeguro, double salarioSemanal) {
        super(nombre, apellido, NumeroSeguro);
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double sueldo() {
        return salarioSemanal;
    }
    @Override
    public String toString(){
        return String.format("Empleado asalariado: %s\n%s: $%,.2f",super.toString(), "salario semanal", sueldo());
    }

    @Override
    public double obtenerMontoPago() {
        return salarioSemanal;
    }
}
