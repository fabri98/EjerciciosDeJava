package Ejercicios_Facultad;

import java.util.Scanner;

public class IntervaloDe2Numeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1, n2, i;

        System.out.println("Ingrese el primer numero:");
        n1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero:");
        n2 = scan.nextInt();

            while(n1 == n2){
                System.out.println("Ingrese nuevamente el primer numero:");
                n1 = scan.nextInt();
                System.out.println("Ingrese nuevamente el segundo numero");
                n2 = scan.nextInt();
            }

            if (n1 < n2){
                i = n1;
                while (i <= n2){
                    System.out.println(i);
                    i++;
                }
            }else{
                i = n2;
                while (i <= n1){
                    System.out.println(i);
                    i++;
                }
            }

    }
}
