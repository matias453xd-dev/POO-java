package Empleado;

public class EmpleadoPorComision extends Empleado {
    private double ventasBrutas;
    private double tarifaComision;
    public EmpleadoPorComision(String nombre, String apellido, int NumeroSeguro, double ventasBrutas, double tarifaComision) {
        super(nombre, apellido, NumeroSeguro);
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }
    public void establecerVentasBrutas(double ventasBrutas){
        this.ventasBrutas = (ventasBrutas < 0.0) ? 0.0 : ventasBrutas;
    }
    public double obtenerVentasBrutas(){
        return ventasBrutas;
    }
    public void establecerTarifaComision(double tarifaComision){
        this.tarifaComision = (tarifaComision > 0.0 && tarifaComision < 1.0) ? tarifaComision : 0.0;
    }
    public double obtenerTarifaComision(){
        return tarifaComision;
    }
    @Override
    public double sueldo() {
        return obtenerTarifaComision()*obtenerVentasBrutas();
    }
    @Override
    public String toString(){
        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f","empleado por comision",super.toString(),"ventas brutas:",obtenerVentasBrutas(),"tarifa de comision",obtenerTarifaComision());
    }
    @Override
    public double obtenerMontoPago() {
        return obtenerTarifaComision()*obtenerVentasBrutas();
    }
}
