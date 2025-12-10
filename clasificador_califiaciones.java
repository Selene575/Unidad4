package Unidad4;
import java.util.Scanner;
public class clasificador_califiaciones {


        // Función que recibe una calificación y devuelve la clasificación
        public static String clasificarCalificacion(int calificacion) {
            if (calificacion >= 90 && calificacion <= 100) {
                return "Sobresaliente";
            } else if (calificacion >= 80 && calificacion <= 89) {
                return "Notable";
            } else if (calificacion >= 70 && calificacion <= 79) {
                return "Aprobatorio";
            } else if (calificacion >= 0 && calificacion <= 69) {
                return "Reprobatorio";
            } else {
                return "Calificación fuera de rango";
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Ingresa tu calificación (0-100): ");
            int calificacion = sc.nextInt();

            String resultado = clasificarCalificacion(calificacion);

            System.out.println("Resultado: " + resultado);
        }
    }


