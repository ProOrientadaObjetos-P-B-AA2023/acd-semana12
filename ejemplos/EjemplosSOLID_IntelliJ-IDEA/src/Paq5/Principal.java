//L — Liskov substitution principle (Principio de sustitución de Liskov)
package Paq5;
class Persona {
    private String nombre;
    private String tarjeta;
    public Persona(String n, String e){
        nombre = n;
        tarjeta = e;
    }
    public void establecerNombre(String n){
        nombre = n;
    }
    public void establecerTarjeta(String n){
        tarjeta = n;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerTarjeta(){
        return tarjeta;
    }
}
class MenorEdad extends Persona{
    public MenorEdad(String n){
        super(n, null);
    }
    @Override
    public String obtenerTarjeta(){
        throw new RuntimeException("un niño no tiene tarjeta");
    }
}
public class Principal {
    public static void main(String[] args) {
        try {
            MenorEdad menor = new MenorEdad("Felipe");
            System.out.printf("Nombre:%s - Tarjeta:%s\n",
                    menor.obtenerNombre(), menor.obtenerTarjeta());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
