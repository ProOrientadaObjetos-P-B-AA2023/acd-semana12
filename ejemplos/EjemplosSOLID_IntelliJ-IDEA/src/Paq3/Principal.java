//O — Open/closed principle (Principio abierto/cerrado)
package Paq3;
class TiposTransporte {
    private double promedioTarifas;
    private TransporteTaxi ttaxi;
    private TransporteBus ttbus;
    //private TransporteTransvia transvia;
    //private TransporteAereo aereo;
    //private TransporteMaritimo maritimo;
    public void establecerTransporteTaxi(TransporteTaxi taxi){
        ttaxi = taxi;
    }
    public void establecerTransporteBus(TransporteBus bus){
        ttbus = bus;
    }
    public TransporteTaxi obtenerTransporteTaxi(){
        return ttaxi;
    }
    public TransporteBus obtenerTransporteBus(){
        return ttbus;
    }
    public void establecerPromedioTarifas(){
        promedioTarifas = (obtenerTransporteBus().obtenerTarifa() + 
                obtenerTransporteTaxi().obtenerTarifa())/2;
    }
    public double obtenerPromedioTarifas(){
        return promedioTarifas;
    }
}
class TransporteBus {
    private String cooperativaBus;
    public double tarifa;
    public void establecerCooperativaBus(String n){
        cooperativaBus = n;
    }
    public void establecerTarifa(){
        tarifa = 2.00 + 0.20;
    }
    public String obtenerCooperativaBus(){
        return cooperativaBus;
    }
    public double obtenerTarifa(){
        return tarifa;
    }
}
class TransporteTaxi {
    private String cooperativaTaxi;
    private double tarifa;
    public void establecerCooperativaTaxi(String n){
        cooperativaTaxi = n;
    }
    public void establecerTarifa(){
        tarifa = 0.40 + (0.40*0.5);
    }
    public String obtenerCooperativaTaxi(){
        return cooperativaTaxi;
    }
    public double obtenerTarifa(){
        return tarifa;
    }
}
public class Principal {
    public static void main(String[] args) {
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransporteBus(bus);
        tipos.establecerTransporteTaxi(taxi);
        tipos.establecerPromedioTarifas();
        System.out.printf("Promedio de Tarifas: %.2f", 
                tipos.obtenerPromedioTarifas());
    }
}
