//D - Dependency inversion principle (Principio de inversión de dependencias)
package Paq10;
interface APIMovie {
    public void establecerApiKey(String ak);
    public String obtenerApiKey();
}
class GeneradorPeliculas {
    private APIMovie llave;
    private String url;
    public void establecerLlave(APIMovie l){ // APINetflix, APIAmazon
        llave = l;
    }
    public void establecerUrl(String l){
        url = String.format("%s%s", l, obtenerLlave().obtenerApiKey());
    }
    public APIMovie obtenerLlave(){
        return llave;
    }
    public String obtenerUrl(){
        return url;
    }
}
class APINetflix implements APIMovie{
    private String apiKey;
    @Override
    public void establecerApiKey(String ak){
        apiKey = ak+123123;
    }
    @Override
    public String obtenerApiKey(){
        return apiKey;
    }
}

class APIAmazonMovie implements APIMovie{
    private String apiKey;
    @Override
    public void establecerApiKey(String ak){
        apiKey = ak+"909090";
    }
    @Override
    public String obtenerApiKey(){
        return apiKey;
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
        System.out.println("---------------------------");
        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("123455");
        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api=");
        System.out.println(gp2.obtenerUrl());
    }
}
