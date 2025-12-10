package Unidad4;
import java.util.Scanner;
public class secuencia_funcion {

        public static void generarSecuencia(int N) {
            for (int i = 1; i <= N; i++) {
                if (i % 2 == 0) {
                    System.out.println("Par");
                } else {
                    System.out.println("Impar");
                }
            }
        }

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingresa un número entero positivo (N): ");
            int N = entrada.nextInt();

            generarSecuencia(N);
        }
    }


