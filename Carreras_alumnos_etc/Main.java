package Carreras_alumnos_etc;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Asignatura Calculo = new Asignatura("Calculo", 143200, 8, 2, 32.0);
        Asignatura Ingles = new Asignatura("Ingles", 165700, 6, 2, 30.0);
        Asignatura MecanicaCuantica = new Asignatura("MecanicaCuantica", 191300, 10, 3, 36.0);
        Asignatura Quimica = new Asignatura("Quimica", 124100, 7, 1, 28.0);
        Asignatura Biologia = new Asignatura("Biologia", 189700, 6, 1, 28.0);

        Carrera IngenieriaCivil = new Carrera(55, "IngenieriaCivil", 12210);
        Carrera Pedagogia = new Carrera(34, "Pedagogia", 53391);
        Carrera Medicina = new Carrera(19, "Medicina", 49912);

        Alumno alumno1 = new Alumno("Matias", "Chillan", "17-05-1999", 2013);
        Profesor profesor1 = new Profesor("Juan", "Temuco", "03-07-1980", "IngenieroEnMinas", "GradoSuperior", 1002);
    
        alumno1.ElegirCarrera(IngenieriaCivil);
        profesor1.AgregarAsignaturaADictar(Biologia);
        profesor1.AgregarAsignaturaADictar(MecanicaCuantica);

        alumno1.InscribirAsignaturas(Biologia);
        alumno1.InscribirAsignaturas(Quimica);

        System.out.println(alumno1.toString());
        System.out.println();
        System.out.println(profesor1.toString());

        alumno1.ObtenerAsignaturasInscritas();
        System.out.println();
        profesor1.ObtenerTitulo();
        input.close();
    }
}
