//S — Single responsibility principle - Principio de responsabilidad única
package Paq2;
import java.util.ArrayList;
import java.util.List;
class Persona {
    private String nombre;
    private int edad;
    public Persona(String n, int e){
        nombre = n;
        edad = e;  }
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
}
class OperacionesEstudiantes {
    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    public void establecerEstudiante(ArrayList<Persona> lista){
        estudiantes = lista;
    }
    public ArrayList<Persona> obtenerEstudiante(){
        return estudiantes;
    }
    public void establecerPromedioEdades(){
        double suma = 0;
        for(Persona e: obtenerEstudiante())
            suma += e.obtenerEdad();
        promedioEdades = suma/obtenerEstudiante().size();
    }
    public double obtenerPromedioEdades(){
        return promedioEdades;
    }
}
public class Principal {
    public static void main(String[] args) {
        ArrayList <Persona> listaPersonas = new ArrayList<>(List.of(new Persona("P1",10), new Persona("P2",12)));
        OperacionesEstudiantes opeEst = new OperacionesEstudiantes();
        opeEst.establecerEstudiante(listaPersonas);
        opeEst.establecerPromedioEdades();
        System.out.println(opeEst.obtenerPromedioEdades());
    }
}
