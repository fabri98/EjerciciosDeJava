package Ejercicios_Facultad;

import java.util.Scanner;

public class DiaDeLluvia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float cant_agua,mayor=0,menor=50000, promedio=0;
        int dia_mayor=0,dia_menor=0,i=0;

        while(i < 7){
            System.out.println("Ingrese la cantidad de agua del dia "+(i+1)+":");
            cant_agua = scan.nextFloat();
            if (cant_agua>mayor){
                mayor = cant_agua;
                dia_mayor = i+1;
            }
            if (cant_agua<menor){
                menor = cant_agua;
                dia_menor = i+1;
            }
            i++;
            promedio += cant_agua;
        }
        promedio = promedio / 5;
        System.out.printf("El dia %d fue el que mayor cantidad de agua hubo. Cantidad:%.2f", dia_mayor, mayor);
        System.out.printf("\nEl dia %d fue el dia que menor cantidad de agua hubo. Cantidad:%.2f", dia_menor, menor);
        System.out.println("\nPromedio:"+promedio);
    }
}
