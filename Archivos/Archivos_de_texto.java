package Archivos;
import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;
public class Archivos_de_texto {
    public static void main(String[] args) {
        // Usando scanner para leer un archivo de texto linea por linea
        try {
            
            File archivo = new File("Archivos/miArchivo.txt"); // Archivo a leer
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) { // Mientras haya líneas por leer
                String linea = lector.nextLine();
                System.out.println(linea); // Imprime cada línea del archivo
            }

            lector.close(); // Cerrar Scanner
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no fue encontrado.");
            e.printStackTrace();
        }
    }
}


