//SOLID => S: "Una, y solo una, razón para cambiar” - Una sola razón
package Varios;
import java.util.ArrayList;
import java.util.List;
class Persona_S_i{
    public String nomb;
    public int edad;
    public Persona_S_i(String nomb, int edad) {
        this.nomb = nomb;
        this.edad = edad;
    }
    public int calcularPromedioEdades(ArrayList<Persona_S_i> personas){
        int suma=0;
        for (Persona_S_i perAux: personas)
            suma += perAux.edad;
        return suma/personas.size();
    }
}
public class S_TestPersona_Incorr {
    public static void main(String[] args) {
        ArrayList<Persona_S_i> listaPersonas = new ArrayList<>(List.of(new Persona_S_i("Juan",10), new Persona_S_i("Maria",12)));
        System.out.println("Promedio Edades: " + listaPersonas.get(1).calcularPromedioEdades(listaPersonas));
    }
}
