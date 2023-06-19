package Ejercicios_Facultad;

import java.util.Scanner;

public class EjNotasDeAlumnos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int notas1[] = new int[3];
        int notas2[] = new int[3];
        String resultados[] = new String[3];

        System.out.println("---Notas del primer parcial---");
        for (int i = 0; i < notas1.length; i++) {
            System.out.print("Ingrese la nota del alumno N°"+(i+1)+":");
            notas1[i] = scan.nextInt();
            if (notas1[i]<0 || notas1[i]>100){
                System.out.println("Nota Invalida!");
                System.out.print("Ingrese nuevamente la nota del alumno N°"+(i+1)+":");
                notas1[i] = scan.nextInt();
            }
        }
        System.out.println("\n---Notas del segundo parcial---");
        for (int j = 0; j< notas1.length; j++) {
            System.out.print("Ingrese la nota del alumno N°"+(j+1)+":");
            notas2[j] = scan.nextInt();
            if (notas1[j]<0 || notas1[j]>100){
                System.out.println("Nota Invalida!\n");
                System.out.print("Ingrese nuevamente la nota del alumno N°"+(j+1)+":");
                notas1[j] = scan.nextInt();
            }
        }
        for (int k = 0; k < notas1.length; k++) {
            if((notas1[k]+notas2[k]) / 2 > 60){
                resultados[k] = String.valueOf((float)(notas1[k] + notas2[k])/2)+" - Aprobado";
            }else{
                resultados[k] = String.valueOf((float)(notas1[k] + notas2[k])/2)+" - Desaprobado";
            }
        }

        System.out.println("\n---Notas Finales---");
        for (String valor:resultados) {
            System.out.println(""+valor);
        }
    }
}
