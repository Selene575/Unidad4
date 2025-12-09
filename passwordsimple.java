package Unidad4;

import java.util.Scanner;

public class passwordsimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
String passwordestatica ="Seleneh06";
        String passwordingresada;
        int intentos=0;
        boolean aciertos= false;

        while (intentos <3 && ! aciertos){
System.out.println("=VALIDADOR DE CONTRASEÑA SIMPLE=");
            System.out.println("\nTienes un máximo de tres intentos");
            System.out.print("Ingresa la contraseña:");
            passwordingresada = scanner.nextLine();

            if (passwordingresada.equals(passwordestatica)){
                System.out.println("Acceso concedido");
                aciertos = true;
            }
            else {
                intentos ++;
                if (intentos <3){
                    System.out.println("Contraseña incorrecta, intenta de nuevo");
                }
            }
        }
        if (!aciertos){
            System.out.println("Acceso desnegado, contacte a soporte");
        }
scanner.close();
    }
}
