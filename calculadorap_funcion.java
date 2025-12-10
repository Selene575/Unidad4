package Unidad4;
import java.util.Scanner;
public class calculadorap_funcion {
        public static float calcularPromedio(float[] calificaciones, int tamaño) {
            float suma = 0;

            // Sumar los elementos del arreglo
            for (int i = 0; i < tamaño; i++) {
                suma += calificaciones[i];
            }
            return suma / tamaño;
        }
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            float[] calificaciones = new float[5];

            System.out.println("Ingresa las 5 calificaciones:");
            for (int i = 0; i < 5; i++) {
                System.out.print("Calificación " + (i + 1) + ": ");
                calificaciones[i] = entrada.nextFloat();
            }

            float promedio = calcularPromedio(calificaciones, 5);

            System.out.println("El promedio de las 5 calificaciones es: " + promedio);
        }
    }


