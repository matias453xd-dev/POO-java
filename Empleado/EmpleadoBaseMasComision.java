package Empleado;

public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    private double salarioBase;
    public EmpleadoBaseMasComision(String nombre, String apellido, int NumeroSeguro,double ventasBrutas ,double tarifaComision, double salarioBase) {
        super(nombre, apellido, NumeroSeguro,ventasBrutas ,tarifaComision);
        this.salarioBase = salarioBase;
    }
    public void establecerSalarioBase(double salarioBase){
        this.salarioBase = (salarioBase < 0.0) ? 0.0 : salarioBase; //Debe ser positivo
    }
    public double obtenerSalarioBase(){
        return salarioBase;
    }
    @Override
    public double sueldo(){
        return obtenerSalarioBase()+ super.sueldo();
    }
    @Override
    public String toString(){
        return String.format("%s %s; %s: $%,.2f","con salario base",super.toString(),"salario base", obtenerSalarioBase());
    }
}
