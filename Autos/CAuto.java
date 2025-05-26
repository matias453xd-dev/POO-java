package Autos;

public class CAuto extends Tipo_Auto implements IAuto {
    protected int velocidad;
    public CAuto() {
    }
    public CAuto(int id, String color, String modelo, String marca, int velocidad) {
        this.id = id;
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.velocidad = velocidad;
    }
    public String getMarca(){
        return marca;
    }
    @Override
    public void derrape() {
        System.out.println("Haz derrapado");
        if (velocidad > 50) {
            System.out.println("Te has volcado");
            velocidad = 0;
            System.out.println("La velocidad actual es de "+velocidad);
        }
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
