import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private double[] calificaciones;

    //Con este bloque se agrega como inicio el Nombre y la calificacion
    public Estudiante(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    // Método para calcular el promedio de las calificaciones
    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    // Método para obtener la calificación final
    public char obtenerCalificacionFinal() {
        double promedio = calcularPromedio();
        if (promedio >= 91 && promedio <= 100) {
            return 'A';
        } else if (promedio >= 81 && promedio <= 90) {
            return 'B';
        } else if (promedio >= 71 && promedio <= 80) {
            return 'C';
        } else if (promedio >= 61 && promedio <= 70) {
            return 'D';
        } else if (promedio >= 51 && promedio <= 60) {
            return 'E';
        } else {
            return 'F';
        }
    }
    // Método para imprimir los resultados
    public void imprimirResultados() {
        System.out.println("\nNombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        double promedio = calcularPromedio();
        char calificacionFinal = obtenerCalificacionFinal();
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacionFinal);
    }

    //Inicio del programa con ingreso de datos para el calculo y el nombre
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        double[] calificaciones = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
        }

        Estudiante estudiante = new Estudiante(nombre, calificaciones);
        estudiante.imprimirResultados();

        scanner.close();
    }
}
