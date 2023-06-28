package Paq7;
abstract class Evaluacion {
    protected double promedioObjetivas;
    protected double promedioEnsayo;
    public abstract void establecerPromedioObjetivas();
    public abstract double obtenerPromedioObjetivas();
    public abstract void establecerPromedioEnsayo();
    public abstract double obtenerPromedioEnsayo();
}
class EvaluacionEnsayo extends Evaluacion{
    private int numeroProblemas;
    private double totalProblemas;
    public void establecerNumeroProblemas(int n){
        numeroProblemas = n;
    }
    public void establecerTotalProblemas(double n){
        totalProblemas = n;
    }
    public int obtenerNumeroProblemas(){
        return numeroProblemas;
    }
    public double obtenerTotalProblemas(){
        return totalProblemas;
    }
    public void establecerPromedioObjetivas(){
        throw new RuntimeException("Sin implementar establecerPromedioObjetivas");
    }
    public double obtenerPromedioObjetivas(){
        throw new RuntimeException("Sin implementar obtenerPromedioObjetivas");
    }
    public void establecerPromedioEnsayo(){
          promedioEnsayo = obtenerTotalProblemas()/obtenerNumeroProblemas();
    }
    public double obtenerPromedioEnsayo(){
          return promedioEnsayo;
    }
}
class EvaluacionObjetiva extends Evaluacion {
    private int numeroPreguntas;
    private double totalPreguntas;
    public void establecerNumeroPreguntas(int n) {
        numeroPreguntas = n;
    }
    public void establecerTotalPreguntas(double n) {
        totalPreguntas = n;
    }
    public int obtenerNumeroPreguntas() {
        return numeroPreguntas;
    }
    public double obtenerTotalPreguntas() {
        return totalPreguntas;
    }
    public void establecerPromedioObjetivas() {
        promedioObjetivas = obtenerTotalPreguntas() / obtenerNumeroPreguntas();
    }
    public double obtenerPromedioObjetivas() {
        return promedioObjetivas;
    }
    public void establecerPromedioEnsayo() {
        throw new RuntimeException("Sin implementar establecerPromedioEnsayo");
    }
    public double obtenerPromedioEnsayo() {
        throw new RuntimeException("Sin implementar obtenerPromedioEnsayo");
    }
}
public class Principal {
    public static void main(String[] args) {
        try {
            EvaluacionEnsayo ensayo = new EvaluacionEnsayo();
            ensayo.establecerNumeroProblemas(10);
            ensayo.establecerTotalProblemas(20);
            ensayo.establecerPromedioEnsayo();
            ensayo.establecerPromedioObjetivas();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
