
package tercerciclo;
public class main {
    public static void main(String[] args) {
        Docente objeto= new Docente();
        objeto.setNombre("Juan");
        objeto.setApellido("Marin");
        objeto.setEdad(26);
        
        objeto.setAsignatura("Fisica");
        objeto.setNumeroalumnos(30);
        objeto.setNumerohoras(80);
        
        System.out.println("Nombre del Docente: " + objeto.getNombre() + " su Asignatura a cargo es: " + objeto.getAsignatura() );
    }
}
