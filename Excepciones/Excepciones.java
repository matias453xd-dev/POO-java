package Excepciones;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;
public class Excepciones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            // Intentar leer un archivo
            BufferedReader lector = new BufferedReader(new FileReader("archivo1.txt"));
            String linea;
            
            // Leer y mostrar el contenido del archivo línea por línea
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
            
            // Cerrar el lector
            lector.close();
        } catch (IOException e) {
            // Manejar la excepción si ocurre algún problema de E/S
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
        // Atrapando la excepcion permite continuar con el codigo
        System.out.println("Continunado, elija un numero:");
        int Num = input.nextInt();
        System.out.println("--> "+Num);
    }
}
