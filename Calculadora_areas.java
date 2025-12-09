package Unidad4;
import java.util.Scanner;
public class Calculadora_areas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULADORA DE ÁREAS CON CONDICIONAL");
        System.out.println("1.Calcular el área de un circulo");
        System.out.println("2.Calcular el área de un rectangulo");
        System.out.print("Elige una de las opciones:");

        int opcion= scanner.nextInt();
        double base, altura, radio, area;

        switch (opcion){
            case 1:
                System.out.println("\n Área del circulo");
                System.out.print("Introduce el radio:");
                radio = scanner.nextDouble();
                area=3.1416*(radio*radio);
                System.out.println("El área del circulo es:" +area);

                if (area > 100) {
                    System.out.println("El área es mayor que 100 unidades cuadradas");
                } else {
                    System.out.println("El área es menor que 100 unidades cuadradas");
                }
                break;

            case 2:
                System.out.println("\n Área de un rectángulo");
                System.out.print("Introduce la base:");
                base = scanner.nextDouble();
                System.out.print("Introduce la altura:");
                altura= scanner.nextDouble();
                area=base*altura;
                System.out.println("\n El área del rectángulo es:" +area);

                if (area > 100) {
                    System.out.println("El área es mayor que 100 unidades cuadradas");
                } else {
                    System.out.println("El área es menor que 100 unidades cuadradas");
                }
                break;

            default:
                System.out.println("Opción no válida");
        }
    }

}
