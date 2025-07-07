package Liga_Futbol;


public class Partidos {

    public Partidos(){
      
    }

    public void SimulacionDelPartido(Club equipo1, Club equipo2){
        System.out.println("Partido entre "+equipo1.getNombre()+" y "+equipo2.getNombre());
        int golesEquipo1 = (int)(Math.random()*7);
        int golesEquipo2 = (int)(Math.random()*7);

        // Agregar los goles a sus respectivos clubes
        equipo1.AgregarGoles(golesEquipo1);
        equipo2.AgregarGoles(golesEquipo2);

        if(golesEquipo1 > golesEquipo2){
            equipo1.AgregarVictoria();
            System.out.println("VICTORIA PARA "+equipo1.getNombre()+" "+golesEquipo1+" : "+golesEquipo2);
        } else if(golesEquipo2 > golesEquipo1){
            equipo2.AgregarVictoria();
            System.out.println("VICTORIA PARA "+equipo2.getNombre()+" "+golesEquipo2+" : "+golesEquipo1);
        } else {
            System.out.println("EMPATE: "+golesEquipo1+" : "+golesEquipo2);
        }
    }
}
