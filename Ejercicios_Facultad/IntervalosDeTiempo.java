package Ejercicios_Facultad;
/*Usando las funciones del ejercicio anterior, escribir un programa que pida al usuario dos
intervalos expresados en horas, minutos y segundos, sume sus duraciones, y muestre por
pantalla la duración total en horas, minutos y segundos.*/

import java.util.Scanner;

public class IntervalosDeTiempo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cantHs, cantMin, cantSeg;

        System.out.println("---Ingreso de valores del primer intervalo---");
        System.out.print("Digite la cantidad de horas:");
        cantHs = scan.nextInt();
        System.out.print("Digite la cantidad de minutos:");
        cantMin = scan.nextInt();
        System.out.print("Digite la cantidad de segundos:");
        cantSeg = scan.nextInt();

        int sumaTiempo = conversionASegundos(cantHs,cantMin,cantSeg);

        System.out.println("---Ingreso de valores del segundo intervalo---");
        System.out.print("Digite la cantidad de horas:");
        cantHs = scan.nextInt();
        System.out.print("Digite la cantidad de minutos:");
        cantMin = scan.nextInt();
        System.out.print("Digite la cantidad de segundos:");
        cantSeg = scan.nextInt();

        sumaTiempo += conversionASegundos(cantHs,cantMin,cantSeg);

        System.out.println("---Suma de los 2 intervalos de tiempo---");
        int tiempo[] = conversionTiempoCompleto(sumaTiempo);
        System.out.println(tiempo[0]+":"+tiempo[1]+":"+tiempo[2]);

    }
    public static int conversionASegundos(int hs,int min,int seg){
        int convertSegs;
        convertSegs = (hs*3600) + (min*60) + seg;
        return convertSegs;
    }
    public static int[] conversionTiempoCompleto(int segs){
        int convertHs, convertMin, convertSegs;
        convertHs = segs / 3600;
        convertMin = (segs % 3600) / 60;
        convertSegs = (segs % 3600) % 60;

        return new int[]{convertHs,convertMin,convertSegs};
    }
}
