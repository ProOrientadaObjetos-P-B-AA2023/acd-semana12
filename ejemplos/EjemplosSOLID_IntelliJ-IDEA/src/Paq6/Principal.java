//L — Liskov substitution principle (Principio de sustitución de Liskov) 
package paquete06;
class Persona {
    private String nombre;
    public Persona(String n){
        nombre = n;
    }
    public void establecerNombre(String n){
        nombre = n;
    }
    public String obtenerNombre(){
        return nombre;
    }
}
class MayorEdad extends Persona{
    private String tarjeta;
    public MayorEdad(String n, String tar){
        super(n);
        tarjeta = tar;
    }
    public void establecerTarjeta(String n){
        tarjeta = n;
    }
    public String obtenerTarjeta(){
        return tarjeta;
    }
}
class MenorEdad extends Persona{
    private MayorEdad representante;
    public MenorEdad(String n, MayorEdad repre){
        super(n);
        representante = repre;
    }
    public void establecerRepresentante(MayorEdad m){
        representante = m;
    }
    public MayorEdad obtenerRepresentante(){
        return representante;
    }
}
public class Principal {
    public static void main(String[] args) {
        MayorEdad representante = new MayorEdad("José", "Visa");
        MenorEdad menor = new MenorEdad("Felipe", representante);
        System.out.printf("Nombre:%s - Tarjeta:%s\n",
                menor.obtenerNombre(), 
                menor.obtenerRepresentante().obtenerTarjeta());
    }
}
