import Entidad.Persona;
import Services.PersonaService;

public class POOEj01 {
    public static void main(String[] args) {
        // Instanciación utilizando el constructor vacío
        Persona primeraPersona = new Persona();
        // Instanciación utilizando el constructor por parámetro
        Persona segundaPersona = new Persona("Mariano");

        primeraPersona.setName("Lucio");
        segundaPersona.getName();

        // Instanciar el objeto del tipo Servicio para acceder a sus métodos.
        PersonaService persService = new PersonaService();

        // Alojamos el retorno del método en un objeto tipo Persona.
        Persona terceraPersona = persService.crearPersona();

        // EJERCICIO VOID
        persService.mostrarPersona(primeraPersona);

    }

}
