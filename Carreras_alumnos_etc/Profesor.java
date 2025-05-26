package Carreras_alumnos_etc;

import java.util.ArrayList;
import java.util.Scanner;

public class Profesor extends Persona{
    private String titulo_profesional;
    private String grado_academico;
    private int jerarquia;
    ArrayList<Asignatura> AsignaturasADictar = new ArrayList<>();
    Scanner input;

    public Profesor(String nombre, String direccion, String fecha_nacimiento, String titulo_profesional, String grado_academico, int jerarquia){
        super(nombre, direccion, fecha_nacimiento);
        this.titulo_profesional = titulo_profesional;
        this.grado_academico = grado_academico;
        this.jerarquia  =jerarquia;
        input = new Scanner(System.in);
    }
    public String ObtenerTitulo(){
        return titulo_profesional;
    }
    public String Obtenergrado_academico(){
        return grado_academico;
    }
    public void setGradoAcademico(String grado){
        this.grado_academico = grado;
    }
    public int ObtenerJerarquia(){
        return jerarquia;
    }
    public void setJerarquia(int jerarquia){
        this.jerarquia = jerarquia;
    }
    public void AgregarAsignaturaADictar(Asignatura asignaturaA){
        AsignaturasADictar.add(asignaturaA);
    }
    public void EliminarAsignaturaADictar(Scanner input){
        System.out.println("Asignaturas a dictar:");
        for(int i = 0; i < AsignaturasADictar.size(); i++){
            System.out.println(i+".- "+AsignaturasADictar.get(i));
        }
        System.out.println("Borre uno indicando el indice: ");
        int seleccion = input.nextInt();
        if(seleccion < 0 || seleccion > AsignaturasADictar.size()){
            System.out.println("No se seleccionó ningun requisito");
            return;
        } else {
            AsignaturasADictar.remove(seleccion);
        }
    }
    @Override
    public String toString(){
        return "Profesor: "+super.toString()+"\n Titulo profesional: "+ObtenerTitulo()+"\n Grado academico: "+Obtenergrado_academico()+"\n Jerarquia: "+ObtenerJerarquia();
    }

}
