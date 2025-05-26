package Pokemon;

public class CBulbasaur extends pokemon implements IPlanta {

    public CBulbasaur() {
    }
    public CBulbasaur(int numPokedex, String nombre, double peso, String sexo, int temporada){
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
    public void atacarLatigoCepa() {
        System.out.println("Ataque Latigo Cepa");
    }

    @Override
    public void atacarHojaAguda() {
        System.out.println("Ataque Hoja Aguda");
    }
    
}
