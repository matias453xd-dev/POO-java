package Generics;
// Una clase generica que almacena un solo objeto
// de cualquier tipo definido por el usuario
// T es el tipo de dato
class Caja_generica<T> {
    private T objeto;

    public void set(T objeto){
        this.objeto = objeto;
    }
    public T get(){
        return objeto;
    }
}
