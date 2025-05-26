package Carreras_alumnos_etc;

import java.util.ArrayList;

public class Carrera {
    private int codigo;
    private String nombre;
    private int regimen;
    ArrayList<Asignatura> AsignaturasProgramadas = new ArrayList<>();
    public Carrera(int codigo, String nombre, int regimen){
        this.codigo = codigo;
        this.nombre = nombre;
        this.regimen = regimen;
    }

    public String ObtenerNombre(){
        return nombre;
    }
    public int ObtenerCodigo(){
        return codigo;
    }
    public int ObtenerRegimen(){
        return regimen;
    }
    public void AgregarAsignatura(Asignatura a){
        AsignaturasProgramadas.add(a);
    }
    public void EliminarAsignatura(){

    }
    public void ObtenerAsignaturasInscritas(){
        System.out.println("ASIGNATURAS:");
        for(int i = 0; i < AsignaturasProgramadas.size(); i++){
            System.out.println(i+".- "+AsignaturasProgramadas.get(i).ObtenerNombre());
        }
    }
    public void ObtenerCreditosTotales(){
        int total = 0;
        for(int i = 0; i < AsignaturasProgramadas.size(); i++){
            total += AsignaturasProgramadas.get(i).ObtenerNro_creditos();
        }
        System.out.println("Creditos totales: "+total);
    }
}
