package Ejercicios_Facultad;

import java.util.Scanner;

public class DosPuntosEnElPlano {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("---Ingreso de los valores del PUNTO A---");
        System.out.print("Ingrese la coordenada x1:");
        int x1 = scan.nextInt();
        System.out.print("Ingrese la coordenada y1:");
        int y1 = scan.nextInt();

        System.out.println("---Ingreso de los valores del PUNTO B---");
        System.out.print("Ingrese la coordenada x2:");
        int x2 = scan.nextInt();
        System.out.print("Ingrese la coordenada y2:");
        int y2 = scan.nextInt();

        int sumaAB[] = sumaVector(x1,y1,x2,y2);
        int restaAB[] = restaVector(x1,y1,x2,y2);
        System.out.println("---Suma de los vectores A Y B---");
        System.out.print("A+B("+sumaAB[0]+";"+sumaAB[1]+")\n");

        System.out.println("---Resta de los vectores A Y B---");
        System.out.print("A-B("+restaAB[0]+";"+restaAB[1]+")");


    }
    public static int[] sumaVector(int x1,int y1,int x2,int y2){
        int z1,z2;
        z1 = x1 + x2;
        z2 = y1 + y2;
        return new int[]{z1,z2};
    }
    public static int[] restaVector(int x1,int y1,int x2,int y2){
        int z1,z2;
        z1 = x1 - x2;
        z2 = y1 - y2;
        return new int[]{z1,z2};
    }
}
