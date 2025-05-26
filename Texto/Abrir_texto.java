package Texto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Abrir_texto {
    public static void main(String[] args) {
        File f = new File("telefono.txt");
        int a = 1; // ID que buscamos
        listarTelefonos(a, f);
    }

    public static void listarTelefonos(int id, File f) {
        // Verificar si el archivo existe
        if (!f.exists()) {
            System.out.println("El archivo no existe.");
            return;
        }

        // Leer el archivo
        try (Scanner telefonoFile = new Scanner(f)) {
            telefonoFile.useDelimiter(",|\\n");

            // Leer y buscar el ID en el archivo
            while (telefonoFile.hasNext()) {
                try {
                    int idTel = telefonoFile.nextInt(); // ID del archivo
                    String num = telefonoFile.next(); // Número telefónico

                    if (id == idTel) {
                        System.out.println("Teléfono encontrado: " + num);
                        System.out.println("Ruta del archivo: "+f.getAbsolutePath());
                        return;
                    }
                } catch (Exception e) {
                    System.out.println("Formato incorrecto en el archivo.");
                    break;
                }
            }
            System.out.println("ID no encontrado en el archivo.");
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no fue encontrado.");
        }
    }
}
