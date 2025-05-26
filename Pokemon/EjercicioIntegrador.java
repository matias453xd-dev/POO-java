package Pokemon;

public class EjercicioIntegrador {
    public static void main(String[] args) {
        //Crando los objetos
        //Falta implementar los atributos a las clases pokemon
        CSquirtel squirtel = new CSquirtel(7, "Squirtel", 18, "macho", 1);
        CCharmander charmander = new CCharmander(4, "Charmander", 16, "macho", 1);
        CPikachu pikachu = new CPikachu(25, "Pikachu", 17, "hembra", 1);
        CBulbasaur bulbasaur = new CBulbasaur(1, "Bulbasaur", 20, "hembra", 1);

        squirtel.atacarHidrobomba();
        charmander.atacarLanzallamas();
        bulbasaur.atacarHojaAguda();
        pikachu.atacarRayo();
        System.out.println("El numero de pokedex de bulbasaur es: "+bulbasaur.numPokedex);
        System.out.println("El numero de pokedex de charmander es: "+charmander.numPokedex);
        System.out.println("El numero de pokedex de pikachu es: "+pikachu.numPokedex);
        System.out.println("El numero de pokedex de squirtel es: "+squirtel.numPokedex);
        bulbasaur.setNombre("Venasaur");
        System.out.println("bulbasaur a evolucionado a: "+bulbasaur.getNombre());
    }
}
