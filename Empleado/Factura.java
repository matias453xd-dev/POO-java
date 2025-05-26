package Empleado;

public class Factura implements PorPagar {
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String pieza, String descripcionPieza, int cantidad, double precioPorArticulo){
        this.numeroPieza = pieza;
        this.descripcionPieza = descripcionPieza;
        this.cantidad = cantidad;
        this.precioPorArticulo = precioPorArticulo;
    }
    public String obtenerNumeroPieza(){
        return numeroPieza;
    }
    public String obtenerDescripcionPieza(){
        return descripcionPieza;
    }
    public int obtenerCantidad(){
        return cantidad;
    }
    public double obtenerPrecioPorArticulo(){
        return precioPorArticulo;
    }
    public String toString(){
        return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f","factura","numero de pieza",obtenerNumeroPieza(),obtenerDescripcionPieza(),"cantidad",obtenerCantidad(),"precio por articulo",obtenerPrecioPorArticulo());
    }
    @Override
    public double obtenerMontoPago() {
        return obtenerCantidad() * obtenerPrecioPorArticulo();
    }
    
}
