package Liga_Futbol;

import java.util.ArrayList;

public class Club {
    String nombre;
    String Estadio;
    ArrayList<Jugador> jugadores;
    int victorias;
    int goles;

    public Club(String nombre, String estadio) {
        this.nombre = nombre;
        this.Estadio = estadio;
        this.jugadores = new ArrayList<>();
    }
    public void AgregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }
    public String getNombre() {
        return nombre;
    }
    public String getEstadio() {
        return Estadio;
    }
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
    public int getVictorias() {
        return victorias;
    }
    public void AgregarVictoria() {
        victorias++;
    }
    public void AgregarGoles(int score){
        goles+=score;
    }
    public int GetGoles(){
        return goles;
    }
    @Override
    public String toString() {
        return "Club{" +
                "nombre='" + nombre + '\'' +
                ", Estadio='" + Estadio + '\'' +
                ", jugadores=" + jugadores +
                ", victorias=" + victorias +
                ", goles="+ goles +
                '}';
    }
}
