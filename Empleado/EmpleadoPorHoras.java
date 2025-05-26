package Empleado;

public class EmpleadoPorHoras extends Empleado {
    private double salario;
    private double horas;
    public EmpleadoPorHoras(String nombre, String apellido, int NumeroSeguro, double salario, double horas) {
        super(nombre, apellido, NumeroSeguro);
        this.salario = salario;
        this.horas = horas;
    }
    public void establecerSueldo(double salario){
        this.salario = (salario < 0.0) ? 0.0: salario;
    }
    public double obtenerSueldo(){
        return salario;
    }
    public void establecerHoras(double horas){
        this.horas = ((horas >= 0.0) && (horas <= 168.0)) ?horas : 0.0;
    }
    public double obtenerHoras(){
        return horas;
    }
    @Override
    public double sueldo() {
        if(obtenerHoras() <= 40){
            return obtenerSueldo()*obtenerHoras();
        } else {
            return 20*obtenerSueldo()+(obtenerHoras() -40)*obtenerSueldo()*1.5;
        }
    }
    @Override
    public String toString(){
        return String.format("Empleado por horas: %s\n%s: $s: %,.2f",super.toString(),"sueldo por hora",obtenerSueldo(),"horas trabajadas",obtenerHoras());
    }
    @Override
    public double obtenerMontoPago() {
        if(obtenerHoras() <= 40){
            return obtenerSueldo()*obtenerHoras();
        } else {
            return 20*obtenerSueldo()+(obtenerHoras() -40)*obtenerSueldo()*1.5;
        }
    }
    
}
