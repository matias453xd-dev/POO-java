import java.lang.Math;
public class Metodo_Math {
    public static void main(String[] args) {
       int resultado = (int) Math.pow(5, 4);
       System.out.println("5 elevado a 4 es " + resultado);

       double resultado2 = Math.pow(1.25, 3.5);
       resultado2 = Math.round(resultado2*100)/100;
       System.out.println("1.25 elevado a 3.5 es "+ resultado2);

       double resultado3 = Math.pow(1.45,4.7);
       resultado3 = Math.round(resultado3*100.0)/100.0;
       System.out.println("1.45 elevado a 4.7 es "+resultado3);

       double resultado4 = 7.654800;
       resultado4 = Math.floor(resultado4*100 + 0.5)/100;
       System.out.println("El numero 7.654800 redondeado a las centesimas es "+resultado4);

       double numero = 4.567890;
       System.out.println(RedondearAEntero(numero));
       System.out.println(RedondearADecimas(numero));
       System.out.println(RedondearACentesimas(numero));
       System.out.println(RedondearAMilesimas(numero));
    }
    public static int RedondearAEntero(double numero) {
        numero = (int) Math.round(numero);
        return (int) numero;
    }
    public static double RedondearADecimas(double numero){
        numero = Math.round(numero*10.0)/10.0;
        return numero;
    }
    public static double RedondearACentesimas(double numero) {
        numero = Math.round(numero*100.0)/100.0;
        return numero;
    }
    public static double RedondearAMilesimas(double numero) {
        numero = Math.round(numero*1000.0)/1000.0;
        return numero;
    }
}
