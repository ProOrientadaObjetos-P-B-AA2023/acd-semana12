package Paq2;
import java.util.ArrayList;
class Persona {
    private String nombre;
    private int edad;
    public Persona(String n, int e){
        nombre = n;
        edad = e;
    }
    public void establecerNombre(String n){
        nombre = n;
    }
    public void establecerEdad(int n){
        edad = n;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public int obtenerEdad(){
        return edad;
    }
    public double promedioEdades(ArrayList<Persona> lista){
        double promedio = 0;
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = lista.get(i).obtenerEdad();
        }
        promedio = suma/lista.size();
        return promedio;
    }
}
class OperacionesEstudiantes {
    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    // private double edadminima;
    public void establecerEstudiante(ArrayList<Persona> lista){
        estudiantes = lista;
    }
    public ArrayList<Persona> obtenerEstudiante(){
        return estudiantes;
    }
    public void establecerPromedioEdades(){
        double suma = 0;
        for(Persona e: obtenerEstudiante()){
            suma = e.obtenerEdad();
        }
        promedioEdades = suma/obtenerEstudiante().size();
    }
    public double obtenerPromedioEdades(){
        return promedioEdades;
    }
}
public class Principal {
    public static void main(String[] args) {
    }
}
