package Ejercicios_Facultad;

import java.util.Arrays;

public class OrdenarAlfabeticamenteUnArreglo {
    public static void main(String[] args) {
        String arr[] = new String[50];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=generarCadena(30);
        }
        System.out.println("Cadena sin ordenar:");
        for (String cadena:arr) {
            System.out.println(""+cadena);
        }
        Arrays.sort(arr);
        System.out.println("Cadena ordenada:");
        for (String cadena:arr) {
            System.out.println(""+cadena);
        }
    }
    public static String generarCadena(int n){
        String caracteres = "abcdefghijklmnñopqrstuvwxyz";
        StringBuilder cadenaAleatoria = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int index = (int) (Math.random() * caracteres.length());
            cadenaAleatoria.append(caracteres.charAt(index));
        }
        return cadenaAleatoria.toString();
    }
}

