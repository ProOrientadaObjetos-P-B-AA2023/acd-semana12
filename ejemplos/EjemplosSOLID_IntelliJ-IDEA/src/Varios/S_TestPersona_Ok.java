//SOLID => S: "Una, y solo una, razón para cambiar” - Una sola razón
package Varios;
import java.util.List;
import java.util.ArrayList;
class Persona_S_c{
    public String nomb;
    public int edad;
    public Persona_S_c(String nomb, int edad) {
        this.nomb = nomb;
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Persona2{nomb='" + nomb + '\'' + ", edad=" + edad + '}';
    }
}
class PromedioEdadesPersonas{
    public double promedioEdadesPersonas;
    public ArrayList<Persona_S_c> personas;
    public PromedioEdadesPersonas(ArrayList<Persona_S_c> personas) {
        this.personas = personas;
    }
    public void calcularPromedios(){
        double edadTotal = 0;
        for (Persona_S_c personaAux : this.personas)
            edadTotal += personaAux.edad;
        this.promedioEdadesPersonas = edadTotal / this.personas.size();
    }
    @Override
    public String toString() {
        return "PromedioEdadesPersonas{ promedioEdadesPersonas=" + promedioEdadesPersonas +
                ", personas=" + personas + '}';
    }
}
public class S_TestPersona_Ok {
    public static void main(String[] args) {
        ArrayList<Persona_S_c> listaPersonas = new ArrayList<>(List.of(new Persona_S_c("Juan", 30), new Persona_S_c("Maria", 70)));
        PromedioEdadesPersonas promedioEdadesPersonas = new PromedioEdadesPersonas(listaPersonas);
        promedioEdadesPersonas.calcularPromedios();
        System.out.println(promedioEdadesPersonas);
    }
}
