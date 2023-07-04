//O — Open/closed principle (Principio abierto/cerrado)
package Paq4;
import java.util.ArrayList;
import java.util.List;
abstract class Transporte {
    protected double tarifa;
    public double obtenerTarifa(){
        return tarifa;
    }
    public abstract void establecerTarifa();
}
class TransporteBus extends Transporte {
    private String cooperativaBus;
    public void establecerCooperativaBus(String n) {
        cooperativaBus = n;
    }
    @Override
    public void establecerTarifa() {
        tarifa = 2.00 + 0.20;
    }
    public String obtenerCooperativaBus() {
        return cooperativaBus;
    }
}
class TransporteTaxi extends Transporte {
    private String cooperativaTaxi;
    public void establecerCooperativaTaxi(String n){
        cooperativaTaxi = n;
    }
    public void establecerTarifa(){
        tarifa = 0.40 + (0.40*0.5);
    }
    public String obtenerCooperativaTaxi(){
        return cooperativaTaxi;
    }
}
class TiposTransporte {
    private double promedioTarifas;
    private ArrayList<Transporte> transportes; // puedo tener muchos tipos de Transporte
    public void establecerTransportes(ArrayList<Transporte> t){
        transportes = t;
    }
    public ArrayList<Transporte> obtenerTransportes(){
        return transportes;
    }
    public void establecerPromedioTarifas(){
        double suma = 0;
        for (int i = 0; i < obtenerTransportes().size(); i++) {
            suma = suma + obtenerTransportes().get(i).obtenerTarifa();
        }
        promedioTarifas = suma / obtenerTransportes().size();
    }
    public double obtenerPromedioTarifas(){
        return promedioTarifas;
    }
}
class Principal {
    public static void main(String[] args) {
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransportes(new ArrayList<Transporte>(List.of(bus, taxi)));
        tipos.establecerPromedioTarifas();
        System.out.printf("Promedio de Tarifas: %.2f", 
                tipos.obtenerPromedioTarifas());
    }
}
