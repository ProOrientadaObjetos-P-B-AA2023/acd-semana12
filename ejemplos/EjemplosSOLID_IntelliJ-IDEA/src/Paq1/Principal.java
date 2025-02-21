//S — Single responsibility principle - Principio de responsabilidad única
package Paq1;
import java.util.ArrayList;
import java.util.List;
class Persona {
    private String nombre;
    private int edad;
    public Persona(String n, int e) {
        nombre = n;
        edad = e;  }
    public void establecerNombre(String n) { nombre = n;  }
    public void establecerEdad(int n) { edad = n;  }
    public String obtenerNombre() { return nombre;   }
    public int obtenerEdad() { return edad;  }
    public double promedioEdades(ArrayList<Persona> listaPersonas) {
        double promedio = 0; double suma = 0;
        for (int i = 0; i < listaPersonas.size(); i++)
            suma += listaPersonas.get(i).obtenerEdad();
        promedio = suma / listaPersonas.size();
        return promedio;
    }
}
public class Principal{
    public static void main(String[] args) {
        ArrayList <Persona> listaPersonas = new ArrayList<>(List.of(new Persona("P1",10), new Persona("P2",12)));
        System.out.println(listaPersonas.get(1).promedioEdades(listaPersonas));
    }
}