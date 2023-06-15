package Services;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaService {

    public Persona crearPersona() {
        // Instanciarmos un objeto persona con sus atributos vacíos
        Persona personaCompleta = new Persona();

        // Pedimos al usuario que ingrese la información que se alojará en el atributo
        // por consola

        System.out.println("Ingrese el nombre de la persona");

        // Utilizamos el objeto para invocar el método GET
        // Y con el Scanner recibimos la información
        Scanner read = new Scanner(System.in);
        personaCompleta.setName(read.next());
        read.close();

        // este método retorna un objeto persona con sus atributos llenos de información

        return personaCompleta;
    }

    public void mostrarPersona(Persona persona) {
        String name = persona.getName();
        System.out.println(name);

    }

}
