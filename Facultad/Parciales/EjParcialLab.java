package Facultad.Parciales;

import java.util.Scanner;

public class EjParcialLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad a devolver por teclado
        System.out.print("Introduzca la cantidad a devolver en pesos: ");
        float cantidad = scanner.nextFloat();

        // Convertir la cantidad a centavos
        int cantidadEnCentavos = Math.round(cantidad * 100);

        // Calcular el número de monedas de cada tipo que se deben devolver
        int numMonedas50 = cantidadEnCentavos / 50;
        cantidadEnCentavos = cantidadEnCentavos % 50;

        int numMonedas10 = cantidadEnCentavos / 10;
        cantidadEnCentavos = cantidadEnCentavos % 10;

        int numMonedas5 = cantidadEnCentavos / 5;
        cantidadEnCentavos = cantidadEnCentavos % 5;

        int numMonedas1 = cantidadEnCentavos;

        // Mostrar el resultado por pantalla
        System.out.println("Monedas de 50 centavos: " + numMonedas50);
        System.out.println("Monedas de 10 centavos: " + numMonedas10);
        System.out.println("Monedas de 5 centavos: " + numMonedas5);
        System.out.println("Monedas de 1 centavo: " + numMonedas1);
    }
}

