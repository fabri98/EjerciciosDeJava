package Ejercicios_Facultad;

import java.util.Scanner;

public class UnirArreglos {
    final static Scanner scan = new Scanner(System.in);
    public static void cargarArreglo(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Ingrese un elemento en la posicion [%d]:",i);
            arr[i] = scan.nextInt();
        }
    }
    public static void ordenarArreglo(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int aux = arr[indiceMinimo];
            arr[indiceMinimo] = arr[i];
            arr[i] = aux;
        }
    }
    public static void unirArreglos(int arr1[],int arr2[],int arrFinal[]){
        int contador=0,i=0,j=0;
        while(i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j]){
                arrFinal[contador] = arr1[i];
                i++;
                contador++;
            } else if (arr2[j] < arr1[i]) {
                arrFinal[contador] = arr2[j];
                j++;
                contador++;
            }else {
                arrFinal[contador] = arr1[i];
                i++;
                j++;
                contador++;
            }
        }
        // Agregar los elementos restantes de arr1 (si los hay)
        while (i < arr1.length) {
            arrFinal[contador] = arr1[i];
            i++;
            contador++;
        }

        // Agregar los elementos restantes de arr2 (si los hay)
        while (j < arr2.length) {
            arrFinal[contador] = arr2[j];
            j++;
            contador++;
        }
    }
    public static void mostrarArreglo(int arrFinal[]){
        for (int valor:arrFinal) {
            if(valor!=0){
                System.out.print(valor+" - ");
            }

        }
    }
    public static void main(String[] args) {
        int array1[] = new int[5];
        int array2[] = new int[5];
        int union[] = new int[array1.length+array2.length];

        System.out.println("----CARGANDO EL PRIMER ARREGLO----");
        cargarArreglo(array1);
        System.out.println("----CARGANDO EL SEGUNDO ARREGLO----");
        cargarArreglo(array2);
        ordenarArreglo(array1);
        ordenarArreglo(array2);
        unirArreglos(array1,array2,union);
        System.out.println("----IMPRIMIMOS LA UNION----");
        mostrarArreglo(union);
    }

}
