package Unidad4;

public class contador_vocales {
        public static void main(String[] args) {
            char[] letras = {'a', 'b', 'e', 'x', 'i', 'o', 'u', 't', 'm', 'a'};

            int contadorVocales = 0;

            for (int i = 0; i < letras.length; i++) {

                // Verificar si el caracter es una vocal
                if (letras[i] == 'a' || letras[i] == 'e' || letras[i] == 'i' ||
                        letras[i] == 'o' || letras[i] == 'u') {

                    contadorVocales++;
                }
            }

            System.out.println("Total de vocales encontradas: " + contadorVocales);
        }
    }


