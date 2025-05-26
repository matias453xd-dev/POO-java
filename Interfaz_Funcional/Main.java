package Interfaz_Funcional;

public class Main {
    public static void main(String[] args) {
        // Sobreescribiendo el unico metodo de la interfaz Multiplicacion
        Multiplicacion resultado = new Multiplicacion() {
            @Override
            public int Operador(int num1,int num2){
                return num1*num2;
            }
        };
        System.out.println("Multiplicacion 12 * 6: "+resultado.Operador(12, 6));

        // Lo mismo pero con funciones lambda

        Multiplicacion resultado2 = (int num4,int num3) -> (num4*num3);
        System.out.println("Multiplicacion con lambda 7 * 8: "+resultado2.Operador(7, 8));
    }
}
