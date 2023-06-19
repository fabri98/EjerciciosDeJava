package Ejercicios_Facultad;

import java.util.Scanner;

public class EjOrdenarAlfabeticamenteUnArreglo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nombres [] = new String[3];

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("\nIngrese un nombre (maximo 30 caracteres):");
            nombres[i] = scan.nextLine();
            if(nombres[i].length() > 30){
                System.out.println("Error! cantidad invalida de caracteres.");
                System.out.print("\nIngrese nuevamente el nombre:");
                nombres[i] = scan.nextLine();
            }
        }
        System.out.println("---Arreglo desordenado---");
        for (String valor:nombres) {
            System.out.print(valor+" - ");
        }
        System.out.println("\n---Arreglo ordenado---");
        ordenarArreglo(nombres);
    }
    public static void ordenarArreglo(String arreglo[]){

        for (int i = 0; i < arreglo.length; i++) {
            int indiceMinimo = i;
            for (int j = i+1; j < arreglo.length; j++) {
                if(arreglo[j].compareTo(arreglo[indiceMinimo]) < 0){
                    indiceMinimo = j;
                }
            }
            String aux = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = aux;
        }

        for (String valor:arreglo) {
            System.out.print(valor+" - ");
        }
    }

}
