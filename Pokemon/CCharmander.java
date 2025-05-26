package Pokemon;

public class CCharmander extends pokemon implements IFuego {
    public CCharmander() {
    }
    public CCharmander(int numPokedex, String nombre, double peso, String sexo, int temporada){
        this.numPokedex = numPokedex;
        this.nombre = nombre;
        this.peso = peso;
        this.sexo = sexo;
        this.temporada = temporada;
    }
    @Override
    protected void atacarPlacaje() {
        System.out.println("Ataque placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Ataque mordisco");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Ataque Lanzallamas");
    }

    @Override
    public void atacarLlamarada() {
        System.out.println("Ataque Llamarada");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Ataque Ascuas");
    }
}
