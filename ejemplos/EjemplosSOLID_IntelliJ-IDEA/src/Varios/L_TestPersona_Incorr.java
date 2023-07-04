//SOLID => L: "las clases derivadas deben poder sustituirse por sus clases base" - De tal padre, tal hijo.
package Varios;
class Persona_L_i{
    public String nombre, tarjeta;
    public Persona_L_i(String nombre, String tarjeta) {
        this.nombre = nombre;
        this.tarjeta = tarjeta;    }
}
class PersonaMenorEdad extends Persona_L_i{
    public PersonaMenorEdad(String nombre) {
        super(nombre, null);     }
    public String getTarjeta(){
        throw new RuntimeException("un niño no tiene tarjeta");   }
}
class PersonaMayorEdad extends Persona_L_i{
    public PersonaMayorEdad(String nombre, String tarjeta) {
        super(nombre, tarjeta);  }
    public String toString() {
        return "PersonaMayorEdad{ nombre='" + nombre + '\'' + ", tarjeta='" + tarjeta + '\'' + '}';
    }
}
public class L_TestPersona_Incorr {
    public static void main(String[] args) {
        PersonaMenorEdad personaMenorEdad = new PersonaMenorEdad("Luis");
        PersonaMayorEdad personaMayorEdad = new PersonaMayorEdad("Luis", "Visa Oro");
        //System.out.println(personaMenorEdad.getTarjeta());
        System.out.println(personaMayorEdad);
    }
}
