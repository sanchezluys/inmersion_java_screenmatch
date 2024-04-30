import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*********************************************");
        System.out.println("Bienvenido a la inmersion en Java Abril 2024");
        System.out.println("Profesora: Genesys Rondon");
        System.out.println("*********************************************");
        // declaracion de variables
        System.out.println("Película Matrix");
        // se usa convencion cammelcase
        // variables primitivas int, double, float, boolean
        int fechaDeLanzamiento=1999;
        double evaluacion= 4.5;
        boolean incluidoPlan=true;
        //** variable compleja clase
        String nombre="Matrix";
        // multiples lineas con triple comilla
        String sinopsis= """
                La mejor pelicula del fin del milenio
                """;
        //**
        System.out.println("Pelicula " + nombre);
        System.out.println("Sinopsis " + sinopsis);
        System.out.println("Fecha de Lanzamiento " + fechaDeLanzamiento);
        System.out.println("Evaluacion " + evaluacion);
        System.out.println("Incluido en el plan " + incluidoPlan);
        //**
        double mediaEvaluacion= (4.5 + 4.8 + 3)/3;
        System.out.println("Media de Evaluacion "+ mediaEvaluacion);
        // uso if - else
        if(fechaDeLanzamiento < 2023){
            System.out.println("Pelicula Popular en el momento");
        }
        else
        {
            System.out.println("Pelicula retro que vale la pena ver");
        }
        //** ciclos de repeticion for
        double mediaEvaluacionUsuario=0;
        int iteraciones=3;
        for (int i = 0; i < iteraciones; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la evalaucion #"+ (i+1) +" que le darias a la pelicula " + nombre);
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario=mediaEvaluacionUsuario + notaMatrix;
        }
        mediaEvaluacionUsuario=mediaEvaluacionUsuario/iteraciones;
        System.out.println("La media de la pelicula "+ nombre +" calculada por los " +iteraciones + " usuarios, es: " + mediaEvaluacionUsuario);
        //**
    }
}