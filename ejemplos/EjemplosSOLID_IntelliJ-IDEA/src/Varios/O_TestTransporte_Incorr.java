//SOLID => O: "abiertas para poder extenderse y cerradas para modificar" - Extiende, no modifiques.
package Varios;
class TipoTransporte{
    public TransporteBus transporteBus;
    public TransporteTaxi transporteTaxi;
    public double promedioTarifas;
    public TipoTransporte(TransporteBus transporteBus, TransporteTaxi transporteTaxi) {
        this.transporteBus = transporteBus;   this.transporteTaxi = transporteTaxi;  }
    public double calcularPromedioTarifas(){
        return (transporteBus.tarifa + transporteTaxi.tarifa)/2;  }
}
class TransporteBus {
    public String nombre;
    public double tarifa;
    public TransporteBus(String nombre, double tarifa) {
        this.nombre = nombre;
        this.tarifa = tarifa;   }
}
class TransporteTaxi {
    public String nombre;
    public double tarifa;
    public TransporteTaxi(String nombre, double tarifa) {
        this.nombre = nombre;
        this.tarifa = tarifa;    }
}
public class O_TestTransporte_Incorr {
    public static void main(String[] args) {
        TipoTransporte TransporteTaxi = new TipoTransporte(new TransporteBus("Urbano", 10), new TransporteTaxi("Loja", 20));
        System.out.println("Promedio de tarifas: " + TransporteTaxi.calcularPromedioTarifas());
    }
}
