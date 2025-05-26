import java.util.Scanner;
public class Ejercicios_Funciones {

    public static void duplicar(int numero) {
        numero = numero * 2;
        System.out.println("Numero dentro del metodo: " + numero);
    }
    
    public static void saludo(String nombre){
        System.out.println("Saludos desde marte: "+nombre);
    }
    public static double ValorAbsoluto(double num) {
        if(num < 0){
            num = num*(-1);
            return num;
        } else {
            return num;
        }
        
    }
    public static boolean ParImpar(int num3){
        if (num3 % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
    public static boolean EsMultiplo(int num4, int num5){
        if(num5 % num4 == 0){
            return true;
        } else {
            return false;
        }
    }
    public static double Hipotenusa(double num6, double num7){
        double hipotenusa = Math.pow(num6, 2) + Math.pow(num7, 2);
        hipotenusa = Math.sqrt(hipotenusa);
        hipotenusa = Math.round(hipotenusa*100.0)/100.0;
        return hipotenusa;
    }
    public static void LeerDatos(Scanner input){
        System.out.println("Los lados de un triangulo rectangulo son: ");
        double ancho = input.nextDouble();
        double largo = input.nextDouble();
        System.out.println("La hipotenusa es: "+Hipotenusa(ancho, largo));
    }
    public static int LeerLargo(int[] lista){
        int cont = 0;
        for(int i = 0; i<lista.length; i++){
            cont++;
        }
        return cont;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 5, numero2 = 20;
        duplicar(numero);
        System.out.println("Numero fuera del metodo: "+ numero);
        String Hola = "Matias";
        saludo(Hola);
        System.out.println("Ingrese un numero negativo: ");
        double num1 = input.nextDouble();
        System.out.println("El valor absoluto de "+num1+" es "+ ValorAbsoluto(num1));
        System.out.println("Ingrese un numero entero para ver si es par: ");
        int num2 = input.nextInt();
        System.out.println("Es par?: "+ParImpar(num2));
        System.out.println(numero2+" Es multiplo de "+numero+"?: "+EsMultiplo(numero, numero2));
        LeerDatos(input);

        System.out.println("Ingrese el largo de la lista: ");
        int largo = input.nextInt();
        int[] lista = new int[largo];
        System.out.println("La cantidad de digitos de la lista es: "+LeerLargo(lista));
    }
}