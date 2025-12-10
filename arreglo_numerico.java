package Unidad4;

public class arreglo_numerico {
        public static void main(String[] args) {

            int[] numeros = {10, 20, 30, 40, 50};

            System.out.println("Elementos del arreglo en orden inverso:");
            for (int i = numeros.length - 1; i >= 0; i--) {
                System.out.println(numeros[i]);
            }
        }
    }


