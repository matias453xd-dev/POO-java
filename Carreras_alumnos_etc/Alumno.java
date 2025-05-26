package Carreras_alumnos_etc;

import java.util.ArrayList;

public class Alumno extends Persona{
    private int año_ingreso;
    private Carrera carreraelegida;
    private ArrayList<Asignatura> Asignaturas = new ArrayList<>();
    public Alumno(String nombre, String direccion, String fecha_nacimiento, int año_ingreso){
        super(nombre, direccion, fecha_nacimiento);
        this.año_ingreso = año_ingreso;
    }
    public int ObtenerAñoDeIngreso(){
        return año_ingreso;
    }
    public void ElegirCarrera(Carrera TuFuturo){
        carreraelegida = TuFuturo;
    }
    public String ObtenerCarrera(){
        return carreraelegida.ObtenerNombre();
    }
    public void ObtenerAsignaturasInscritas(){
        System.out.println("ASIGNATURAS:");
        for(int i = 0; i < Asignaturas.size(); i++){
            System.out.println(i+".- "+Asignaturas.get(i).ObtenerNombre());
        }
    }
    public void InscribirAsignaturas(Asignatura AsignaturaElegida){
        Asignaturas.add(AsignaturaElegida);
    }

    @Override
    public String toString(){
        return "Alumno: "+super.toString()+"\n Año de ingreso: "+ObtenerAñoDeIngreso()+"\n Carrera: "+ObtenerCarrera();
    }


}
