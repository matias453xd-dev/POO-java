package Futbol;

public class Jugador {

    protected String nombre;
    protected int camiseta;
    protected Club club;
    
    public Jugador(String nombre){
        this.nombre = nombre;

    }
    public void incorporaraClub(int numCamiseta, Club club){
        this.camiseta = numCamiseta;
        this.club = club;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public String obtieneNombreCLub(){
        return club.obtieneNombre();
    }
    public int obtenerDorsal(){
        return camiseta;
    }
}
