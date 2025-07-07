package Liga_Futbol;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Agregar equipos a la liga
        Liga PremierLeague = new Liga("PremierLeague");
        Club BayernMünech = new Club("BayernMünech", "AliansArena");
        PremierLeague.AgregarEquipo(BayernMünech);
        Club ManchesterCity = new Club("ManchesterCity", "EtihadStadium");
        PremierLeague.AgregarEquipo(ManchesterCity);
        Club RealMadrid = new Club("RealMadrid", "Bernabeu");
        PremierLeague.AgregarEquipo(RealMadrid);
        Club Milan = new Club("Milan", "Sansiro");
        PremierLeague.AgregarEquipo(Milan);
        Club Liverpool = new Club("Liverpool", "Anfield");
        PremierLeague.AgregarEquipo(Liverpool);
        Club Psg = new Club("PSG","ParqueDeLosPrincipes");
        PremierLeague.AgregarEquipo(Psg);
        Club Barcelona = new Club("Barcelona", "CampNou");
        PremierLeague.AgregarEquipo(Barcelona);

        // Agregar jugadores a los clubes
        BayernMünech.AgregarJugador(new Jugador("ManuelNuer",38,"Arquero",BayernMünech));
        BayernMünech.AgregarJugador(new Jugador("HarryKane",33,"Delantero",BayernMünech));
        BayernMünech.AgregarJugador(new Jugador("Musiala",20,"MedioCentro",BayernMünech));

        ManchesterCity.AgregarJugador(new Jugador("PhilFoden",24,"MedioCentro",ManchesterCity));
        ManchesterCity.AgregarJugador(new Jugador("RubenDiaz",29,"Defensa",ManchesterCity));
        ManchesterCity.AgregarJugador(new Jugador("Savinho",21,"ExtremoDerecho",ManchesterCity));

        RealMadrid.AgregarJugador(new Jugador("Bellinham",21,"MedioCentro",RealMadrid));
        RealMadrid.AgregarJugador(new Jugador("Valverde",23,"VolanteMixto",RealMadrid));
        RealMadrid.AgregarJugador(new Jugador("Vinicius",25,"ExtremoIzquierdo",RealMadrid));

        Milan.AgregarJugador(new Jugador("KyleWalker",32,"LateralDerecho",Milan));
        Milan.AgregarJugador(new Jugador("TheoHenandes",27,"Defensa",Milan));
        Milan.AgregarJugador(new Jugador("RafaelLeao",26,"ExtremoIzquierdo",Milan));

        Liverpool.AgregarJugador(new Jugador("MacAlister",26,"MedioCentro",Liverpool));
        Liverpool.AgregarJugador(new Jugador("Salah",32,"Delantero",Liverpool));
        Liverpool.AgregarJugador(new Jugador("VanDijk",33,"Defensa",Liverpool));

        Psg.AgregarJugador(new Jugador("Vitinha", 25, "MedioCentro", Psg));
        Psg.AgregarJugador(new Jugador("NunoMendes", 24, "LateralIzquierdo", Psg));
        Psg.AgregarJugador(new Jugador("Dembele", 27, "Delantero", Psg));

        Barcelona.AgregarJugador(new Jugador("Pedri",23,"MedioCentro",Barcelona));
        Barcelona.AgregarJugador(new Jugador("Raphina",27,"ExtremoIzquierdo",Barcelona));
        Barcelona.AgregarJugador(new Jugador("LamineYamal",17,"ExtremoDerecho",Barcelona));
        // Los partidos pueden ser aleatorios y repetirse durante 12 fechas
        int opcion = 0;
        int fecha = 1;
        // Generar partidos desde la liga
        PremierLeague.GenerarPartidos();
        while(opcion != 6){
            System.out.println("Opciones: 1)Empezar liga, 2) Consultar jugadores, 3) Consultar clubes, 4)Partidos que se jugarán, 5)Tabla, 6)Salir");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("TEMPORADA "+fecha);
                    PremierLeague.EmpezarLiga();
                    fecha++;
                    break;
                case 2:
                    System.out.println("De que club quiere ver sus jugadores?: ");
                    String equipo = input.next();
                    // Mostrara todos los jugadores del equipo
                    if(VerificarEquipo(equipo, PremierLeague) != null){
                        ConsutaJugador(VerificarEquipo(equipo, PremierLeague));
                    }
                    break;
                case 3:
                    PremierLeague.MostrarClubes();
                    break;
                case 4:
                    PremierLeague.MostrarPartidos();
                    break;
                case 5:
                    PremierLeague.MostrarTabla();
                    break;
                case 6:
                    System.out.println("Saliendo....");
                    input.close();
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
        // Organizar la tabla de la liga segun el numero de victorias y como segundo parametro los goles
        // Switch con opciones de 1) empezar la liga, 2) consultar juegadores de cada club, 3) clubes en la liga
        // 4) partidos que se jugarán, 5) salir
    }
    public static void ConsutaJugador(Club ClubElegido){
        for(Jugador futbolista: ClubElegido.getJugadores()){
            System.out.println(futbolista.toString());
        }
    }
    public static Club VerificarEquipo(String nombre, Liga Premier){
        for(Club equipo: Premier.GetEquipos()){
            if(equipo.getNombre().equalsIgnoreCase(nombre)){
                return equipo;
            }
        }
        System.out.println("No se encontro el equipo");
        return null;
    }
}
