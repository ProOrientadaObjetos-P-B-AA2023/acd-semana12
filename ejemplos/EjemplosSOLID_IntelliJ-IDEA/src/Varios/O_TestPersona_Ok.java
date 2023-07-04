//SOLID => O: "abiertas para poder extenderse y cerradas para modificar" - Extiende, no modifiques.
package Varios;
import java.util.ArrayList;
import java.util.List;
class Persona_O_c{
    public String nombre, apellido;
    public Persona_O_c(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido; }
    public String getFormatoPersona(iFormatoPersona iFormato){
        return iFormato.getPersona(this);    }
}
interface iFormatoPersona{
    public String getPersona(Persona_O_c persona); }
class PersonaTxt implements iFormatoPersona{
    public String getPersona(Persona_O_c persona) {
        return "Persona_O_i{ nombre='" + persona.nombre + '\'' +
                ", apellido='" + persona.apellido + '\'' + '}';   }
}
class PersonaXML implements iFormatoPersona{
    public String getPersona(Persona_O_c persona) {
        return "<xml> " +
                "<nombre> "+ persona.nombre + " </nombre> " +
                "<apellido> "+ persona.apellido + " </apellido> " +
                " </xml>";    }
}
public class O_TestPersona_Ok {
    public static void main(String[] args) {
        ArrayList<Persona_O_c> listaPersonas = new ArrayList<>(List.of(
                new Persona_O_c("Juan", "Perez"),
                new Persona_O_c("Maria", "Lopez")));
        for (Persona_O_c personaAux : listaPersonas){
            System.out.println(personaAux.getFormatoPersona(new PersonaTxt()));
            System.out.println(personaAux.getFormatoPersona(new PersonaXML()));
        }
    }
}
