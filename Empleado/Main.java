package Empleado;

public class Main {
    public static void main(String[] args) {
        // Objetos de las subclases
        EmpleadoAsalariado Asalariado = new EmpleadoAsalariado("Matias", "Llanos", 30040440, 800.00);
        EmpleadoPorHoras PorHoras = new EmpleadoPorHoras("Karen", "Price", 430022, 16.75, 40);
        EmpleadoPorComision PorComision = new EmpleadoPorComision("Bob", "Jones", 54410451, 200, 400.00);
        EmpleadoBaseMasComision BaseMasComision = new EmpleadoBaseMasComision("Rico", "Lewis", 45291012, .4,300, 300);

        System.out.println("Empleados procesados por separado:\n");

        System.out.printf("%s\n%s: $%,.2f\n\n",Asalariado,"ingresos: ", Asalariado.sueldo());
        System.out.printf("%s\n%s: $%,.2f\n\n",PorHoras,"ingresos: ", PorHoras.sueldo());
        System.out.printf("%s\n%s: $%,.2f\n\n",PorComision,"ingresos: ", PorComision.sueldo());
        System.out.printf("%s\n%s: $%,.2f\n\n",BaseMasComision,"ingresos: ", BaseMasComision.sueldo());

        // Al ser heredados de la misma superclase todas pueden ser guardadas en un arreglos de esa superclase
        // No se pueden crear objetos directamente de la clase Empleado

        Empleado[] empleados = new Empleado[4];
        empleados[0] = Asalariado;
        empleados[1] = PorHoras;
        empleados[2] = PorComision;
        empleados[3] = BaseMasComision;

        System.out.println("Empleados procesados en forma polimorfica:\n");

        // Procesar los elementos del arreglo
        for(Empleado empleadoActual : empleados){
            System.out.println(empleadoActual); //Invoca al metodo toString
            //Convertir refencia Empleado a EmpleadoBaseMasComision
            // instanceof determina a que clase del objeto hace referencia
            if(empleadoActual instanceof EmpleadoBaseMasComision){
                //Convertir empleadoActual con la clase Empleado a EmpleadoBaseMasComision
                EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) empleadoActual;
                double salarioBaseAnterior = empleado.obtenerSalarioBase();
                empleado.establecerSalarioBase(1.10*salarioBaseAnterior);
                System.out.printf("El nuevo salario base con 10%% de aumento es: $%,.2f\n",empleado.obtenerSalarioBase());

            }
            System.out.printf("ingresos $%,.2f\n\n",empleadoActual.sueldo());
        }   
        for(int j = 0; j < empleados.length; j++){
            System.out.printf("El empleado %d es un %s\n", j, empleados[j].getClass().getName());
        }
        System.out.println("---------o----------");
        // Luego de implementar la interfaz PorPagar

        PorPagar[] objetosPorPagar = new PorPagar[4];
        // Un objeto de tipo Factura tambien es un objeto de tipo PorPagar
        objetosPorPagar[0] = new Factura("01234","asiento",2,375.00);
        objetosPorPagar[1] = new Factura("56789","llanta",4,79.78);
        objetosPorPagar[2] = new EmpleadoAsalariado("Jonh","Smith",405052,5000.00);
        objetosPorPagar[3] = new EmpleadoAsalariado("Laura","Barnes",705640,6005.00);

        System.out.println("Facturas y Empleados procesados en forma polimorfica:\n");
        for(PorPagar porPagarActual: objetosPorPagar){
            System.out.printf("%s \n%s: $%,.2f\n\n",porPagarActual.toString(),"pago vencido",porPagarActual.obtenerMontoPago());
        }
    }
}
