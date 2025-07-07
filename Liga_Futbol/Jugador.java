package Liga_Futbol;

public class Jugador {
    String nombre;
    int edad;
    String posicion;
    Club equipo;

    public Jugador(String nombre, int edad, String posicion, Club equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.equipo = equipo;
    }
    public void cambiarEquipo(Club nuevoEquipo) {
        this.equipo = nuevoEquipo;
    }
    public String getNombre() {
        return nombre;
    }
    public void CambiarPosicion(String pos){
        posicion = pos;
    }
    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", posicion='" + posicion + '\'' +
                ", equipo=" + equipo.getNombre()+
                '}';
    }
}
