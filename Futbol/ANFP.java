package Futbol;

import java.util.Scanner;
import java.util.ArrayList;

public class ANFP {
    protected static IUANFP interfaz = new IUANFP(); // Inicialización de la interfaz

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre, nomJugador;
        ArrayList<Jugador> ListaJugadores = new ArrayList<>();
        ArrayList<Club> ListaClubes = new ArrayList<>();
        int opcion = 0;

        while (opcion != 6) {
            interfaz.interfaz();
            System.out.println();
            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Cual sera el nombre del club: ");
                    nombre = input.nextLine();
                    boolean existe = false;

                    // Verifica si el club ya existe
                    for (Club clubExistente : ListaClubes) {
                        if (clubExistente.obtieneNombre().equals(nombre)) {
                            System.out.println("El club ya existe.");
                            existe = true;
                            break;
                        }
                    }

                    // Si no existe, lo agrega
                    if (!existe) {
                        Club club = new Club(nombre);
                        ListaClubes.add(club);
                        System.out.println("Club agregado exitosamente.");
                    }
                    break;
                case 2:
                    boolean clubEncontrado = false;
                    System.out.println("Cual será el nombre del jugador");
                    nomJugador = input.next();
                    System.out.println("Cual es su dorsal: ");
                    int dorsal = input.nextInt();
                    System.out.println("En que club jugará: ");
                    interfaz.mostrarClubes(ListaClubes);
                    String club = input.next();
                    for(Club clubseleccionado : ListaClubes){
                        if(clubseleccionado.obtieneNombre().equalsIgnoreCase(club)){
                            Jugador player = new Jugador(nomJugador);
                            ListaJugadores.add(player);
                            player.incorporaraClub(dorsal,clubseleccionado);
                            clubEncontrado = true;
                            System.out.println("Jugador agragado exitosamente");
                            break;
                        }
                    }
                    if(clubEncontrado == false){
                        System.out.println("El club no esta registrado o no existe");
                        break;   
                    }
                    break;
                case 3:
                    boolean jugEncontrado = false;
                    interfaz.mostrarJugadores(ListaJugadores);
                    System.out.println("Escriba el nombre del jugador: ");
                    String nom = input.next();
                    for(int i = 0; i < ListaJugadores.size(); i++){
                        if(ListaJugadores.get(i).obtenerNombre().equalsIgnoreCase(nom)){
                            Jugador jugadorSeleccionado = ListaJugadores.get(i);
                            interfaz.mostrarClubes(ListaClubes);
                            System.out.println("En que club quiere jugar: ");
                            String nomClub = input.next();
                            for(int j = 0; j < ListaClubes.size(); j++){
                                if(ListaClubes.get(j).obtieneNombre().equalsIgnoreCase(nomClub)){
                                    ListaClubes.get(j).agregarJugador(jugadorSeleccionado);
                                    System.out.println("Jugador fichado en "+ListaClubes.get(j).obtieneNombre());
                                    jugEncontrado = true;
                                    break;
                                }
                            }
                        }
                    }
                    if(jugEncontrado == false){
                        System.out.println("Jugador no encontrado");
                        break;
                    }
                    break;
                case 4:
                    boolean encontrado = false;
                    System.out.println("Seleccione un club");
                    interfaz.mostrarClubes(ListaClubes);
                    System.out.println("Elija uno");
                    String seleccion = input.next();
                    for(int i = 0; i < ListaClubes.size(); i++){
                        if(ListaClubes.get(i).obtieneNombre().equalsIgnoreCase(seleccion)){
                            ListaClubes.get(i).obtieneNombresJugadores();
                            encontrado = true;
                            break;
                        }
                    }
                    if(encontrado == false){
                        System.out.println("Club no encontrado");
                        break;
                    }
                    break;
                case 5:
                    boolean si = false;
                    System.out.println("Seleccione un jugador:");
                    interfaz.mostrarJugadores(ListaJugadores);
                    String jugSeleccionado = input.next();
                    for(int i = 0; i < ListaJugadores.size(); i++){
                        if(ListaJugadores.get(i).obtenerNombre().equalsIgnoreCase(jugSeleccionado)){
                            System.out.println("Juega en "+ListaJugadores.get(i).obtieneNombreCLub());
                            si = true;
                            break;
                        }
                    }
                    if(si == false){
                        System.out.println("Jugador no encontrado");
                        break;
                    }
                    break;
                case 6:
                    System.out.println("Saliendo....");
                    input.close();
                    break;
            }
        }

    }
}