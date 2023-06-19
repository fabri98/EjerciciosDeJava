package Ejercicios_Facultad;

import java.util.Scanner;

public class ParesDeValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s, v, contSMayorV = 0, contSDobleV = 0;

        do {
            System.out.print("Ingrese el valor de S: ");
            s = sc.nextInt();
            System.out.print("Ingrese el valor de V: ");
            v = sc.nextInt();

            if (s > v) {
                contSMayorV++;
            }
            if (s != 0 && v != 0){
                if (s == v * 2) {
                    contSDobleV++;
                }
            }


        } while (s != 0 || v != 0);

        System.out.println("Se ingresaron " + (contSMayorV + contSDobleV) + " pares de valores.");

        System.out.println("En " + contSMayorV + " pares el primer valor S es mayor que el segundo V.");

        System.out.println("En " + contSDobleV + " pares se cumple que S es el doble de V.");
    }
}
