public class Alumno {
    int id;
    String nombre;
    String apellido;
    public Alumno() {
        
    }
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void mostrarnombre() {
        System.out.println("Hola, soy un alumno y sé decir mi nombre");
    }

    public static void main(String[] args) {
        Alumno alum1 = new Alumno(139, "Matias", "Llanos");
        Alumno alum2 = new Alumno(210, "Luis", "Torres");
        System.out.println("La id del alumno 1 es " + alum1.getId());
        System.out.println("La id del alumno 2 es " + alum2.getId());

        Alumno alum3 = new Alumno(0, "", "");
        alum3.setId(430);
        System.out.println("La id del alumno 3 es: " + alum3.getId());
        alum3.setApellido("Parra");
        System.out.println("El apellido del alumno 3 es: " + alum3.getApellido());

        // Creación de un objeto Profesor
        Profesor prof1 = new Profesor(50000.0, "Director", 101, "Carlos", "Gonzalez");
        System.out.println("El nombre del profesor es: " + prof1.getNombre() + " " + prof1.getApellido());
        System.out.println("El puesto del profesor es: " + prof1.getPuesto());
        System.out.println("El sueldo del profesor es: " + prof1.getSueldo());

    }
}
// Herencia y construccion de un nuevo objeto
class Profesor extends Alumno {
    double sueldo;
    String puesto;

    public Profesor(double sueldo, String puesto, int id, String nombre, String apellido) {
        super(id, nombre, apellido);
        this.sueldo = sueldo;
        this.puesto = puesto;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    } 
}





