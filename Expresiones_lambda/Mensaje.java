package Expresiones_lambda;

@FunctionalInterface
public interface Mensaje {
    // Se define la interfaz funcional que solo posee
    // un metodo incompleto
    public void EmitirMensaje(String nombre, int numero);
}