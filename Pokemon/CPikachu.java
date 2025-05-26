package Pokemon;

public class CPikachu extends pokemon implements IElectrico{
    public CPikachu() {
    }
    public CPikachu(int numPokedex, String nombre, double peso, String sexo, int temporada){
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
    public void atacarRayo() {
        System.out.println("Ataque Rayo");
    }

    @Override
    public void atacarPuñoTrueno() {
        System.out.println("Ataque Puño Trueno");
    }
}
