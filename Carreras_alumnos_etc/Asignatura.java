package Carreras_alumnos_etc;
import java.util.ArrayList;
import java.util.Scanner;
public class Asignatura {
    private String nombre;
    private int codigo;
    private int nro_creditos;
    private int semestre;
    private double nro_horas_semanales;
    Scanner input;
    ArrayList<String> PreRequisitos = new ArrayList<>();
    public Asignatura(String nombre, int codigo, int nro_creditos, int semestre, double nro_horas_semanales){
        this.nombre = nombre;
        this.codigo = codigo;
        this.nro_creditos = nro_creditos;
        this.semestre = semestre;
        this.nro_horas_semanales = nro_horas_semanales;
        input = new Scanner(System.in);
    }
    public String ObtenerNombre(){
        return nombre;
    }
    public int ObtenerCodigo(){
        return codigo;
    }
    public int ObtenerNro_creditos(){
        return nro_creditos;
    }
    public int ObtenerSemestre(){
        return semestre;
    }
    public double ObtenerHorasSemanales(){
        return nro_horas_semanales;
    }
    public void ObtenerNombrePreRequisitos(){
        System.out.println("Pre requisitos:");
        for(int i = 0; i < PreRequisitos.size(); i++){
            System.out.println(PreRequisitos.get(i));
        }
    }
    public void AgregarPreRequisito(Scanner input){
        System.out.println("Agregar un requisito sin espacios:");
        String requisito = input.next();
        PreRequisitos.add(requisito);
    }
    public void EliminarPreRequisito(){
        System.out.println("Pre requisitos:");
        for(int i = 0; i < PreRequisitos.size(); i++){
            System.out.println(i+".- "+PreRequisitos.get(i));
        }
        System.out.println("Borre uno indicando el indice: ");
        int seleccion = input.nextInt();
        if(seleccion < 0 || seleccion > PreRequisitos.size()){
            System.out.println("No se seleccionó ningun requisito");
            return;
        } else {
            PreRequisitos.remove(seleccion);
        }
    }
}
