package Liga_Futbol;

import java.util.ArrayList;

public class Liga {
    String nombre;
    ArrayList<Club> clubes;
    ArrayList<String> encuentros;

    public Liga(String nombre){
        this.nombre = nombre;
        this.clubes = new ArrayList<>();
        this.encuentros = new ArrayList<>();
    }
    public void AgregarEquipo(Club equipo){
        clubes.add(equipo);
    }
    // Mostrar clubes participantes
    public void MostrarClubes(){
        try {
            for(Club club: clubes){
                System.out.println(club.toString());
                System.out.println("------------o----------");
        }
        } catch (NullPointerException e) {
            System.out.println("No hay equipos en la liga");
        }
    }
    public ArrayList<Club> GetEquipos(){
        return clubes;
    }
    // Mostrar tabla ordenada segun la cantidad de vixtorias y como segundo parametro los goles anotados
    public void MostrarTabla(){
        clubes.sort((e1,e2) -> {int cmpVictorias = Integer.compare(e2.getVictorias(),e1.getVictorias());
            if(cmpVictorias != 0)return cmpVictorias; return Integer.compare(e2.GetGoles(),e1.GetGoles());});
        System.out.println("TABLA DE POSICIONES");
        int indice = 1;
        for(Club equipo: clubes){
            System.out.printf("%-4d| %-14s| %-6d| %-5d%n", indice, equipo.getNombre(),equipo.getVictorias(),equipo.GetGoles());
            indice++;
        }
    }
    public void GenerarPartidos(){
        try {
            for(Club equipo: clubes){
                    for(Club equipo2: clubes){
                        if(!equipo.getNombre().equals(equipo2.getNombre())){
                            String fubol = (equipo.getNombre() + " vs "+equipo2.getNombre());
                            encuentros.add(fubol);
                        }
                    }
                }
        }
         catch (Exception e) {
            System.out.println("No se pudieron generar los partidos");
        }
    }
    public void MostrarPartidos(){
        for(String partido: encuentros){
            System.out.println("- "+partido);
        }
    }
    // Cada equipo jugara 6 partidos
    public void EmpezarLiga(){
        try {
            for(Club equipo: clubes){
                    for(Club equipo2: clubes){
                        if(!equipo.getNombre().equals(equipo2.getNombre())){
                            Partidos game = new Partidos();
                            game.SimulacionDelPartido(equipo, equipo2);
                        }
                    }
                }
        }
         catch (Exception e) {
            System.out.println("No se pudieron generar los partidos");
        }
    }
}
