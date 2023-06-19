package Ejercicios_Facultad;
/*Una farmacia hace el 15% de descuento sobre los precios de la lista oficial. Hacer un programa que permita ingresar
por teclado el precio de lista de un determinado artículo y la cantidad de unidades compradas por un determinado
cliente. Luego calcular e informar por pantalla el total a pagar aplicando el descuento respectivo. Por ejemplo: Precio
del artículo: $5.-. Cantidad de Unidades: 2. Total a Pagar: $ 8,50. Usar DEFINE para indicar la cantidad de iteraciones.
Para las iteraciones usar FOR*/

import java.util.Scanner;

public class PrecioDeListaArticulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioArticulo, precioTotal = 0;
        int cantArticulos;

        System.out.printf("Ingrese el precio del articulo:");
        precioArticulo = sc.nextDouble();
        System.out.printf("Ingrese la cantidad de articulos que desea comprar:");
        cantArticulos = sc.nextInt();

        for (int i = 0; i < cantArticulos; i++) {
            precioTotal += precioArticulo;
        }
        precioTotal = precioTotal - (precioTotal * 0.15);
        System.out.printf("El precio TOTAL es: %.2f",precioTotal);

    }
}

