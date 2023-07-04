package Varios;
import java.util.ArrayList;
import java.util.List;

class Persona{
    public String nomb;
    public int edad;
    public Persona(String nomb, int edad) {
        this.nomb = nomb;
        this.edad = edad;  }
    public int calcularPromedioEdades(ArrayList<Persona> personas){
        int suma=0;
        for (Persona perAux: personas)
            suma += perAux.edad;
        return suma/personas.size();  }
}
public class S_TestPersona_Incorr {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersonas = new ArrayList<>(List.of(new Persona("Juan",10), new Persona("Maria",12)));
        System.out.println(listaPersonas.get(1).calcularPromedioEdades(listaPersonas));
    }
}
