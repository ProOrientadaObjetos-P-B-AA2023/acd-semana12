//SOLID => O: "abiertas para poder extenderse y cerradas para modificar" - Extiende, no modifiques.
package Varios;
import java.util.ArrayList;
import java.util.List;
class Transporte{
    public String nombre;
    public double tarifa;
    public Transporte(String nombre, double tarifa) {
        this.nombre = nombre;
        this.tarifa = tarifa;     }
}
class TransporteBus2 extends Transporte{
    public TransporteBus2(String nombre, double tarifa) {
        super(nombre, tarifa);     }
}
class TransporteTaxi2 extends Transporte{
    public TransporteTaxi2(String nombre, double tarifa) {
        super(nombre, tarifa);     }
}
class TipoTransporte2{
    public double promedioTarifa, suma;
    public ArrayList<Transporte> listaTransportes;
    public TipoTransporte2(ArrayList<Transporte> listaTransportes) {
        this.listaTransportes = listaTransportes;     }
    public double calcularPromedioTarifas(){
        for (Transporte transporte : listaTransportes)
            suma += transporte.tarifa;
        promedioTarifa = suma / listaTransportes.size();
        return promedioTarifa;
    }
}
public class O_TestTransporte_Ok {
    public static void main(String[] args) {
        ArrayList<Transporte> listaTransporte = new ArrayList<>(List.of(new TransporteBus2("Urbano", 10), new TransporteTaxi2("Loja", 30)));
        TipoTransporte2 tipoTransporte2 = new TipoTransporte2(listaTransporte);
        System.out.println(tipoTransporte2.calcularPromedioTarifas());
    }
}
