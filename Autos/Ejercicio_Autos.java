package Autos;
public class Ejercicio_Autos {
    public static void main(String[] args) {
        CAuto Auto = new CAuto(15420, "Azul oscuro", "Huracan", "Lamborghini", 0);
        CCamion Camion = new CCamion(53304, "Rojo", "Frigorifico", "Chevrolet", 0);
        CMoto Moto = new CMoto(39610, "Gris", "Yamaha", "Honda", 0);
        System.out.println("El auto es de color "+Auto.color);
        System.out.println("El camion es de color "+Camion.color);
        System.out.println("La moto es de color "+Moto.color);
        System.out.println("La marca de la moto es "+Moto.getMarca());
        System.out.println("La marca del camion es "+Camion.getMarca());
        System.out.println("La marca del auto es "+Auto.getMarca());
        Auto.setColor("Verde");
        System.out.println("El nuevo color del auto es "+Auto.getColor());
    }

}
