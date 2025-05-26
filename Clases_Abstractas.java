
public class Clases_Abstractas {
    
    public static void main(String[] args) {
        Circulo circulo = new Circulo(4,14,23);
        Cuadrado cuadrado = new Cuadrado(12,34,60);
        System.out.println("El area del circulo es: "+circulo.Area());
        System.out.println("El area del cuadrado es: "+cuadrado.Area());
    }
}
abstract class Figura {
    protected double x; //posicion en x
    protected double y; //posicion en y

    protected Figura(){

    }
    protected Figura(double x, double y){
        this.x = x;
        this.y = y;
    }

    public abstract double Area(); 
}
class Circulo extends Figura {
    private double radio;
    public Circulo() {
    }
    public Circulo(double radio, double x, double y) {
        super(x,y);
        this.radio = radio;
    }

    @Override
    public double Area() {
        double resultado = (radio*radio)*(3.1416);
        return resultado;
    }
}
class Cuadrado extends Figura {
    private double lado;
    public Cuadrado() {
    }
    public Cuadrado(double lado, double x, double y) {
        super(x,y);
        this.lado = lado;
    }


    @Override
    public double Area() {
        double resultado = lado*lado;
        return resultado;
    }
}