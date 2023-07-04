//SOLID => L: "las clases derivadas deben poder sustituirse por sus clases base" - De tal padre, tal hijo.
package Varios;
class Persona_L_c{
    public String nombre, tarjeta;
    public Persona_L_c(String nombre) {
        this.nombre = nombre;   }
    public Persona_L_c(String nombre, String tarjeta) {
        this.nombre = nombre;      this.tarjeta = tarjeta;    }
    public String toString() {
        return "Persona_L_c{ nombre='" + nombre + '\'' + ", tarjeta='" + tarjeta + '\'' + '}';
    }
}
class PerMenorEdad extends Persona_L_c{
    public PerMayorEdad representante;
    public PerMenorEdad(String nombre, PerMayorEdad representante) {
        super(nombre);   this.representante = representante;  }
    public String toString() {
        return "PerMenorEdad{ representante=" + representante + '}' + "; Nombre menor=" + this.nombre;
    }
}
class PerMayorEdad extends Persona_L_c{
    public PerMayorEdad(String nombre, String tarjeta) {
        super(nombre, tarjeta);
    }
}
public class L_TestPersona_Ok {
    public static void main(String[] args) {
        PerMayorEdad perMayorEdad = new PerMayorEdad("Juan", "Vida Oro");
        PerMenorEdad perMenorEdad = new PerMenorEdad("Maria", perMayorEdad);
        System.out.println(perMayorEdad);
        System.out.println(perMenorEdad);
    }
}
