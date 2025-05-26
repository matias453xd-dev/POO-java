package Futbol;
import java.util.ArrayList;
public class Club {

    protected String nombre;
    ArrayList<Jugador> jugadores = new ArrayList<>();

    public Club(String nombre){
        this.nombre = nombre;
    }
    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }
    public String obtieneNombre(){
        return nombre;
    }
    public void obtieneNombresJugadores(){
        System.out.println("Nombres:");
        for(int i =  0; i < jugadores.size(); i++){
            System.out.println(jugadores.get(i).obtenerNombre());
        }
    }
}
