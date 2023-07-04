//SOLID => O: "abiertas para poder extenderse y cerradas para modificar" - Extiende, no modifiques.
package Varios;
import java.util.List;
import java.util.ArrayList;
class Persona_O_i{
    public String nombre, apellido;
    public Persona_O_i(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido; }
    public String getPersonaTxt() {
        return "Persona_O_i{ nombre='" + nombre + '\'' + ", apellido='" + apellido + '\'' + '}';
    }
    public String getPersonaXML() {
        return "<xml> " +
                 "<nombre> "+ this.nombre + " </nombre> " +
                 "<apellido> "+ this.apellido + " </apellido> " +
               " </xml>";
    }
}
public class O_TestPersona_Incorr {
    public static void main(String[] args) {
        ArrayList<Persona_O_i> listaPersonas = new ArrayList<>(List.of(
                new Persona_O_i("Juan", "Perez"),
                new Persona_O_i("Maria", "Lopez")));
        for (Persona_O_i personaAux : listaPersonas){
            System.out.println(personaAux.getPersonaTxt());
            System.out.println(personaAux.getPersonaXML());
        }
    }
}
