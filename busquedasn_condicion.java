package Unidad4;
import java.util.Scanner;
public class busquedasn_condicion {

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            // Arreglo de 7 números enteros
            int[] numeros = {5, 12, 8, 20, 3, 14, 7};

            System.out.print("Ingresa un número a buscar: ");
            int buscado = entrada.nextInt();

            int i = 0;
            boolean encontrado = false;


            while (i < numeros.length) {

                if (numeros[i] == buscado) {
                    System.out.println("Número encontrado en la posición (índice): " + i);
                    encontrado = true;
                    break;
                }

                i++;
            }

            if (!encontrado) {
                System.out.println("El número no se encontró en el arreglo.");
            }
        }
    }


