package EntradaSalida;

import java.io.*;
import java.util.Scanner;
import java.util.function.Function;
public class ObjectOutput{
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("EntradaSalida/JugadoresFutbol.txt"));
            CrearJugador JugadorNuevo = new CrearJugador("Matias", "Llanos", 20);
            salida.writeObject(JugadorNuevo);
            System.out.println("Objeto guardado con exito");

            // El metodo apply() permite ejecutar la funcion dado un parametro del mismo tipo, reemplazando a x con 5
            Function<Integer,Integer> cuadrado = x -> x*x;
            System.out.println(cuadrado.apply(5));
            
        } catch (IOException e) {
            System.out.println("Error al encontrar el archivo");
        }
        try {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("EntradaSalida/JugadoresFutbol.txt"));
            CrearJugador leerJugador = (CrearJugador) entrada.readObject();
            File archivo = new File("EntradaSalida/JugadoresFutbol.txt");
            Scanner input = new Scanner(archivo);

            // Leer el archivo con un Scanner
            while(input.hasNextLine()){
                String linea = input.nextLine();
                System.out.println(linea);
            }
            
        } catch (IOException a) {
            System.out.println("Error al leer el archivo");
        } catch (ClassNotFoundException g){
            System.out.println("No se encontro la clase");
        }

        
    }
}

