package Pokemon;

public class CSquirtel extends pokemon implements IAgua{
    public CSquirtel() {
    }
    public CSquirtel(int numPokedex, String nombre, double peso, String sexo, int temporada){
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
    public void atacarHidrobomba() {
        System.out.println("Ataque Hidrobomba");
    }

    @Override
    public void atacarSalmuera() {
        System.out.println("Ataque Salmuera");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Ataque Burbuja");
    }
}
