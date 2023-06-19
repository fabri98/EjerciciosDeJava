package Ejercicios_Facultad;

import java.util.Arrays;
import java.util.Scanner;

public class NumerosConsecutivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        boolean bandera=false;

        do {
            System.out.println("Ingrese el primer numero:");
            a = sc.nextInt();
            System.out.println("Ingrese el segundo numero:");
            b = sc.nextInt();
            System.out.println("Ingrese el tercer numero:");
            c = sc.nextInt();
            if (b==a+1 && c==b+1){
                bandera=true;
            }
        }while (bandera==false);

        System.out.printf("Los numeros %d %d %d son consecutivos",a,b,c);
    }
}
