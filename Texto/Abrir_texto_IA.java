package Texto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Abrir_texto_IA {
    public static void main(String[] args) {
        File f = new File("telefono.txt");
        int a = 1; // ID que buscamos

        // Verificar y crear el archivo si no existe
        if (!f.exists()) {
            try {
                if (f.createNewFile()) {
                    System.out.println("Archivo creado: " + f.getAbsolutePath());
                    // Agregar contenido inicial al archivo
                    inicializarArchivo(f);
                    
                } else {
                    System.out.println("No se pudo crear el archivo.");
                    return;
                }
            } catch (IOException e) {
                System.out.println("Error al crear el archivo: " + e.getMessage());
                return;
            }
        } else {
            System.out.println("El archivo ya existe: " + f.getAbsolutePath());
        }

        // Listar los teléfonos del archivo
        listarTelefonos(a, f);
    }

    public static void inicializarArchivo(File f) {
        try (PrintWriter writer = new PrintWriter(f)) {
            // Escribir contenido inicial en el archivo
            writer.println("1,123-456-7890");
            writer.println("2,987-654-3210");
            writer.println("3,555-555-5555");
            System.out.println("Archivo inicializado con contenido de ejemplo.");

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public static void listarTelefonos(int id, File f) {
        try (Scanner telefonoFile = new Scanner(f)) {
            telefonoFile.useDelimiter(",|\\n");

            // Leer y buscar el ID en el archivo
            while (telefonoFile.hasNext()) {
                try {
                    int idTel = telefonoFile.nextInt(); // ID del archivo
                    String num = telefonoFile.next(); // Número telefónico

                    if (id == idTel) {
                        System.out.println("Teléfono encontrado: " + num);
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

