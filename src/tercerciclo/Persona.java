package tercerciclo;

public class Persona {

    protected String Nombre;
    protected String Apellido;
    protected int cedula;
    protected int edad;
    protected String direccion;

    public Persona() {
    }

    public Persona(String Nombre, String Apellido, int cedula, int edad, String direccion) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String mostrarDatos() {
        return "Mi nombre es: " + Nombre + ", mi Apellido es: " + Apellido + ",mi numero de cedula es: " + cedula + ",mi edad es: " + edad + "y mi direccion es: " + direccion;
    }

}
