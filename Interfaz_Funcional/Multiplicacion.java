package Interfaz_Funcional;

@FunctionalInterface
public interface Multiplicacion {
    // Las interfaces funcionales solo pueden tener un metodo el cual debe ser sobrescrito e implementado a la vez
    int Operador(int num1, int num2);
    // Sera implementada en el main
}
