package Futbol;

import java.util.ArrayList;

public class IUANFP {
    
    public IUANFP(){
    }
    public void interfaz(){
        System.out.print("1)Agregar club, 2)Agregar jugador, 3)Incorporar jugador a un club, 4)Obtener jugadores de un club, 5) Obtener club de un jugador, 6) Salir");
    }
    public void mostrarJugadores(ArrayList<Jugador> listaJugadores){
        System.out.println("Jugadores:");
        for(int i = 0; i < listaJugadores.size(); i++){
            System.out.println(listaJugadores.get(i).obtenerNombre());
        }
    }
    public void mostrarClubes(ArrayList<Club> listaClubes){
        System.out.println("Clubes:");
        for(int j = 0; j < listaClubes.size(); j++){
            System.out.println(listaClubes.get(j).obtieneNombre());
        }
    }
}
