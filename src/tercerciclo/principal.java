package tercerciclo;

public class principal {

    public static void main(String[] args) {
        Persona personas[] = new Persona[2];

        personas[0] = new Persona("carlos", "farez", 1106030236, 23, "Sauces");
        personas[1] = new Docente("fisica", 5, 25, "Juan", "perez", 1103626102, 32, "jipiro alto");

        for (Persona persona : personas) {
            System.out.println(persona.mostrarDatos());
            System.out.println("");
        }
    }
}
