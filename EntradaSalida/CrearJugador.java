package EntradaSalida;

import java.io.Serializable;

public class CrearJugador implements Serializable{
    private String Nombre;
    private String Apellido;
    private int Edad;

    public CrearJugador(String Nombre, String Apellido, int Edad){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
    }
    public String GetNombre(){
        return Nombre;
    }
    public String GetApellido(){
        return Apellido;
    }
    public int GetEdad(){
        return Edad;
    }
}

