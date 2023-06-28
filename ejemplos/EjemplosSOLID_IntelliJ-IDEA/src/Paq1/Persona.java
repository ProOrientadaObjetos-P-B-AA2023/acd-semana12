//S — Single responsibility principle - Principio de responsabilidad única
package Paq1;
import java.util.ArrayList;
public class Persona {
    private String nombre;
    private int edad;
    public Persona(String n, int e) {
        nombre = n;
        edad = e;
    }
    public void establecerNombre(String n) {
        nombre = n;
    }
    public void establecerEdad(int n) {
        edad = n;
    }
    public String obtenerNombre() {
        return nombre;
    }
    public int obtenerEdad() {
        return edad;
    }
    public double promedioEdades(ArrayList<Persona> lista) {
        double promedio = 0;
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = lista.get(i).obtenerEdad();
        }
        promedio = suma / lista.size();
        return promedio;
    }
    public String obtenerNombrePais() {
        return "Ecuador";
    }
}
