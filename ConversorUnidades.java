package Proyecto_Integrador4;

import java.util.Scanner;

public class ConversorUnidades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecciona una conversión:");
        System.out.println("1. Kilómetros a Millas");
        System.out.println("2. Centígrados a Fahrenheit");
        System.out.println("3. Metros a Pies");
        int opcion = sc.nextInt();

        System.out.print("Ingresa el valor: ");
        double valor = sc.nextDouble();
        double resultado;

        switch (opcion) {
            case 1:
                resultado = valor * 0.621371;
                System.out.println("Resultado: " + resultado + " millas");
                break;
            case 2:
                resultado = (valor * 9/5) + 32;
                System.out.println("Resultado: " + resultado + " °F");
                break;
            case 3:
                resultado = valor * 3.28084;
                System.out.println("Resultado: " + resultado + " pies");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}

