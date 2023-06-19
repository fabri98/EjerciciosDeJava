package Ejercicios_Facultad;

import java.util.Scanner;

public class BusquedaBinaria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arreglo[] = {10,20,30,40,50,60,70,80};
        int apuntador1, apuntador2, apuntadorPuntoMedio, valorBuscado;

        System.out.print("Ingrese el numero que desea buscar:");
        valorBuscado = scan.nextInt();

        apuntador1 = 0; // Guardamos la primer posicion del arreglo
        apuntador2 = arreglo.length; // Guardamos la ultima posicion del arreglo
        apuntadorPuntoMedio = (apuntador1+apuntador2) / 2; // Guardamos la posicion MEDIA del arreglo

        /*Esto se repetira mientras el valor que buscamos sea DISTINTO al valor del arreglo en la posicion "apuntadorPuntoMedio"
         */
        while(valorBuscado != arreglo[apuntadorPuntoMedio]){
            /*Si el valor buscado es MAYOR al valor del arreglo en la posicion "apuntadorPuntoMedio"
            se le asigna la posicion "apuntadorPuntoMedio"+1 a "apuntador1"
            */
            if (valorBuscado > arreglo[apuntadorPuntoMedio]){
                apuntador1 = apuntadorPuntoMedio + 1;
            }/*Si el valor buscado es MENOR al valor del arreglo en la posicion "apuntadorPuntoMedio"
            se le asigna la posicion "apuntadorPuntoMedio"-1 a "apuntador2"
            */
            else if (valorBuscado < arreglo[apuntadorPuntoMedio]) {
                apuntador2 = apuntadorPuntoMedio - 1;
            }
            apuntadorPuntoMedio = (apuntador1+apuntador2) / 2; //Guardamos la nueva posicion MEDIA del arreglo
        }
        System.out.printf("El valor %d se encuentra en la posicion %d",valorBuscado,apuntadorPuntoMedio);
    }
}
