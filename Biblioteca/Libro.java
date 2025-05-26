package Biblioteca;

public class Libro {
    String nombre;
    int paginas;
    String genero;
    boolean Estado;
    public Libro(){ 
    }

    public Libro(String nombre, int paginas, String genero){
        this.nombre = nombre;
        this.paginas = paginas;
        this.genero = genero;
        this.Estado = true;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getPaginas(){
        return paginas;
    }
    public void setPaginas(int paginas){
        this.paginas = paginas;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public boolean getEstado(){
        return Estado;
    }
    public void CambiarEstado(boolean lol){
        this.Estado = lol;
    }
    @Override
    public String toString(){
        return "Nombre: "+nombre+", Paginas: "+paginas+", Genero: "+genero+", Disponibilidad: "+Estado;
    }
}

