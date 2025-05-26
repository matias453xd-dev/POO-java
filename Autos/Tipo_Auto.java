package Autos;

public abstract class Tipo_Auto {
    protected int id;
    protected String color;
    protected String modelo;
    protected String marca;

    protected abstract void acelerar();
    protected abstract void frenar();

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public String getmodelo(){
        return modelo;
    }
    public String getMarca(){
        return marca;
    }
}
