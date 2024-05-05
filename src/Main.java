import modelos.Encabezado;
public class Main {
    static int cuentaPeliculas=0;
    static int cuentaSeries=0;
    static int tiempoPeliculas=0;
    static int tiempoSeries=0;
    //
    public static void main(String[] args) {


        //
        Encabezado encabezado = new Encabezado();
        Principal principal = new Principal();
        //
        encabezado.muestraEncabezado();
        principal.muestraMenu();
    }
}