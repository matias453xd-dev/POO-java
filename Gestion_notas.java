import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class Gestion_notas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer,String> Alumnos = new HashMap<Integer,String>();
        ArrayList<Double> notas = new ArrayList<Double>();

        Alumnos.put(1,"Matias");
        Alumnos.put(2,"Joaquin");
        Alumnos.put(3,"Marcelo");
        Alumnos.put(4,"Andres");

        System.out.println(Alumnos);
        int cont = 0;
        String loco = String.valueOf(cont);
        System.out.println(loco);
        while(cont != 5) {
            System.out.println("Menú: 1) Agregar alumno, 2) Buscar alumno, 3) Agregar nota , 4) Ver notas , 5) Salir");
            cont = input.nextInt();
            switch (cont) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Saliendo.....");
                    break;
                default:
                    break;
            }
        }
    }
}
