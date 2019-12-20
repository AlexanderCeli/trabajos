package tercerciclo;

public class Docente extends Persona {

    protected String asignatura;
    protected int Numerohoras;
    protected int numeroalumnos;

    public Docente() {
    }

    public Docente(String asignatura, int Numerohoras, int numeroalumnos, String Nombre, String Apellido, int cedula, int edad, String direccion) {
        super(Nombre, Apellido, cedula, edad, direccion);
        this.asignatura = asignatura;
        this.Numerohoras = Numerohoras;
        this.numeroalumnos = numeroalumnos;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getNumerohoras() {
        return Numerohoras;
    }

    public void setNumerohoras(int Numerohoras) {
        this.Numerohoras = Numerohoras;
    }

    public int getNumeroalumnos() {
        return numeroalumnos;
    }

    public void setNumeroalumnos(int numeroalumnos) {
        this.numeroalumnos = numeroalumnos;
    }

    @Override
    public String mostrarDatos() {
        return "Mi nombre es: " + Nombre + " , mi Apellido es: " + Apellido + ", mi numero de cedula es: " + cedula + ", mi edad es: " + edad + ", mi direccion es: " + direccion + ", doy  la  asignatura de: " + asignatura + ", mi numero de horas es: " + Numerohoras + " y mi curso es de: " + numeroalumnos + " alumnos";
    }
}
