package Gestor_de_inventario;

public class Productos {
    String nombre;
    Double precio;
    String categoria;

    public Productos(){
    }
    public Productos(String nombre, Double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }
    public String getNombre() {
        return nombre;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public void aplicarDescuento(Double descuento){
        if(descuento > 0 && descuento < 100){
            this.precio = this.precio - this.precio*descuento/100;
            System.out.println("Descuento aplicado");
        }
    }
    public String getCategoria() {
        return categoria;
    }
    @Override
    public String toString() {
        return "Productos{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
