class Persona {
    String nombre;
    String apellidos;
    public String getFormato(IFormateable iformat) {
        String s = iformat.getFormato(this);
        return s;
    }
}
interface IFormateable {
    public String getFormato(Persona p);
}
class FormatoString implements IFormateable {
    public String getFormato(Persona p) {
        return p.nombre + " " + p.apellidos;
    }
}
class FormatoXML implements IFormateable {
    public String getFormato(Persona p) {
        return "<xml>  < nombre > " + p.nombre +"< / nombre >"
                    +"<apellido>"+p.apellidos +"< / apellido > < / xml >";
    }
}
public class Test_Persona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.apellidos = "Irene";
        persona1.nombre = "Daniel";
        System.out.println(persona1.getFormato(new FormatoString()));
        System.out.println(persona1.getFormato(new FormatoXML()));
    }
}