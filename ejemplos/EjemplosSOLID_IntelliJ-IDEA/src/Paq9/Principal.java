//D - Dependency inversion principle (Principio de inversión de dependencias)
package Paq9;
class APINetflix {
    private String apiKey;
    public void establecerApiKey(String ak){
        apiKey = ak+123123;
    }
    public String obtenerApiKey(){
        return apiKey;
    }
}
class GeneradorPeliculas {
    private APINetflix llave;
    private String url;
    public void establecerLlave(APINetflix l) {
        llave = l;
    }
    public void establecerUrl(String l) {
        url = String.format("%s%s", l, obtenerLlave().obtenerApiKey());
    }
    public APINetflix obtenerLlave() {
        return llave;
    }
    public String obtenerUrl() {
        return url;
    }
}
public class Principal {
    public static void main(String[] args) {
        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");
        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");
        System.out.println(gp.obtenerUrl());
    }
}
