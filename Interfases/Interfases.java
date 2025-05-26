package Interfases;
// Creando una interfaz
// Una interfaz puede tener firmas de metodos, campos y
// metodos predeterminados

public class Interfases {
    public static void main(String[] args) {
        // Creamos los objetos
        Figura circulo = new Circulo(5.0);
        Figura rectangulo = new Rectangulo(4.0, 3.0);

        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
    }
}


