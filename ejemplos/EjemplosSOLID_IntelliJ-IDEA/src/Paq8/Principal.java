//I — Interface segregation principle (Principio de segregación de interfaces)
package Paq8;
interface EvaluacionTipoUno {
    public void establecerPromedioObjetivas();
    public double obtenerPromedioObjetivas();
}
interface EvaluacionTipoDos {
    public void establecerPromedioEnsayo();
    public double obtenerPromedioEnsayo();
}
class EvaluacionObjetiva implements EvaluacionTipoUno {
    protected double promedioObjetivas;
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
    @Override
    public void establecerPromedioObjetivas() {
        promedioObjetivas = obtenerTotalPreguntas() / obtenerNumeroPreguntas();
    }
    @Override
    public double obtenerPromedioObjetivas() {
        return promedioObjetivas;
    }
}
class EvaluacionEnsayo implements EvaluacionTipoDos {
    private int numeroProblemas;
    private double totalProblemas;
    protected double promedioEnsayo;
    public void establecerNumeroProblemas(int n) {
        numeroProblemas = n;
    }
    public void establecerTotalProblemas(double n) {
        totalProblemas = n;
    }
    public int obtenerNumeroProblemas() {
        return numeroProblemas;
    }
    public double obtenerTotalProblemas() {
        return totalProblemas;
    }
    @Override
    public void establecerPromedioEnsayo() {
        promedioEnsayo = obtenerTotalProblemas() / obtenerNumeroProblemas();
    }
    @Override
    public double obtenerPromedioEnsayo() {
        return promedioEnsayo;
    }
}
public class Principal {
    public static void main(String[] args) {
        EvaluacionEnsayo ensayo = new EvaluacionEnsayo();
        ensayo.establecerNumeroProblemas(10);
        ensayo.establecerTotalProblemas(20);
        ensayo.establecerPromedioEnsayo();
        System.out.println(ensayo.obtenerPromedioEnsayo());
        EvaluacionObjetiva ensayo2 = new EvaluacionObjetiva();
        ensayo2.establecerNumeroPreguntas(10);
        ensayo2.establecerTotalPreguntas(30);
        ensayo2.establecerPromedioObjetivas();
        System.out.println(ensayo2.obtenerPromedioObjetivas());
    }
}
