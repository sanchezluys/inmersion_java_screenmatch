import modelos.Encabezado;
public class Main {
    public static void main(String[] args) {
        Encabezado encabezado = new Encabezado();
        Principal principal = new Principal();
        //
        encabezado.muestraEncabezado();
        principal.muestraMenu();
    }
}