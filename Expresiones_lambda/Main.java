package Expresiones_lambda;

public class Main {
    public static void main(String[] args) {
        // Voy a modificar el metodo de la interfaz funcional
        // usando expresiones lambda
        Mensaje AbrirMensaje = (name, numero) -> {System.out.println("Que tal estas "+name+" de ID "+numero);};
        // El compilador reconoce el tipo de "name"
        // relacionandolo con el parametro de la interfaz

        AbrirMensaje.EmitirMensaje("Matias",320011);

    }
}
