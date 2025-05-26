package Autos;

public class CCamion extends Tipo_Auto implements ICamion{
    private int velocidad;
    public CCamion() {
    }
    public CCamion(int id, String color, String modelo, String marca, int velocidad) {
        this.id = id;
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.velocidad = velocidad;
    }
    
    @Override
    public void potencia() {
       System.out.println("Aumentando la potencia");
       velocidad += 10;
       System.out.println("La velocidad actual es de "+velocidad);
    }
    @Override
    protected void acelerar() {
        System.out.println("Haz acelerado 5km/h");
        velocidad += 5;
        System.out.println("La velocidad actual es de "+velocidad);
    }
    @Override
    protected void frenar() {
        if(velocidad > 0) {
            System.out.println("Haz fremado 5km/h");
            velocidad -= 5;
            System.out.println("La velocidad actual es de "+velocidad);
        } else {
            System.out.println("El auto se encuentra detenido");
        }
       
    }
}
