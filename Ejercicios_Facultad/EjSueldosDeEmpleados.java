package Ejercicios_Facultad;

import java.util.Scanner;

public class EjSueldosDeEmpleados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float sueldos, promedio, acum=0;
        int cantSueldos=0;

        do {
            System.out.print("Ingrese un sueldo:");
            sueldos = scan.nextFloat();
            acum+=sueldos;
            cantSueldos++;
        }while (sueldos>20000 && sueldos < 100000);
        promedio = (acum - sueldos) / (cantSueldos-1);
        System.out.println("El promedio de sueldo es:$"+promedio);
    }
}
