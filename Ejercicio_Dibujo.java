import java.util.Scanner;
public class Ejercicio_Dibujo {
    public static void DibujarMarco(String caracter, String[][] lado, int numero){
        for(int i = 0; i < numero;i++){
            lado[i][0] = caracter;
            lado[0][i] = caracter;
            lado[numero-1][i] = caracter;
            lado[i][numero-1] = caracter;
        }
        for(int j = 0; j < numero; j++){
            for(int e = 0; e < numero; e++){
                System.out.print(lado[j][e]);
            }
            System.out.println();
        }
    }
    public static String[][] LlenarMatriz(String[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j] = " ";
            }
        }
        return matriz;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un caracter y un numero natural: ");
        String caracter = input.next();
        int numero = input.nextInt();
        String[][] matriz = new String[numero][numero];
        DibujarMarco(caracter, LlenarMatriz(matriz), numero);

    }
}
