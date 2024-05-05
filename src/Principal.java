import modelos.Pelicula;
import modelos.Serie;

import java.util.Scanner;

public class Principal {

    public void muestraMenu(){
        int opcion=0;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            String menu= """
                    Bienvenido(a) a ScreenMatch
                    1. Registrar Nueva Pelicula
                    2. Registrar Nueva Serie
                    
                    9. Salir
                    """;
            System.out.println(menu);
            opcion= teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese Nombre de la Pelicula ");
                    String nombre= teclado.nextLine();
                    //
                    System.out.println("Ingrese Año de Lanzamiento ");
                    int fechaLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    //
                    System.out.println("Ingrese Duracion en Minutos  ");
                    int duracion = teclado.nextInt();
                    teclado.nextLine();
                    Pelicula pelicula = new Pelicula();
                    pelicula.setNombre(nombre);
                    pelicula.setFechaLanzamiento(fechaLanzamiento);
                    pelicula.setTiempoDuracionMinutos(duracion);
                    pelicula.muestraFichaTecnica();
                    break;
                case 2:
                    System.out.println("Ingrese Nombre de la Serie ");
                    String nombreSerie = teclado.nextLine();
                    //
                    System.out.println("Ingrese Año de Lanzamiento ");
                    int fechaLanzamientoSerie = teclado.nextInt();
                    teclado.nextLine();
                    //
                    System.out.println("Ingrese Duracion en Minutos  ");
                    int duracionSerie = teclado.nextInt();
                    teclado.nextLine();
                    Serie serie = new Serie();
                    serie.setNombre(nombreSerie);

                    serie.muestraFichaTecnica();
                    break;
                case 9:
                    System.out.println("Finaliza Programa");
                    break;
                default:
                    System.out.println("Ha ingresado una opción Invalida\nIntente de nuevo por favor");
                    break;
            }
        }
    }
}
