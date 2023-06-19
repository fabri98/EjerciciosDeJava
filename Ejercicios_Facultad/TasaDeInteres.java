package Ejercicios_Facultad;
/*Escribir un programa que le pregunte al usuario una cantidad de pesos, una tasa de interés y
un número de años y muestre como resultado el monto final a obtener.
La fórmula a utilizar es: C = c * (1+X100)POW n
Donde C es el capital inicial, x es la tasa de interés y n es el número de años a calcular.*/
import java.lang.Math;
import java.util.Scanner;

public class TasaDeInteres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite la cantidad de capital que desea ingresar:");
        double cantPesos = scan.nextDouble();
        System.out.print("Digite la tasa de interes:");
        int tasaInteres = scan.nextInt();
        System.out.print("Digite la cantidad de años en la que se va a pagar:");
        int cantAños = scan.nextInt();

        double total = calcularCapitalConInteres(cantPesos,tasaInteres,cantAños);
        System.out.println("---Calculo Monto Final---");
        System.out.printf("TOTAL:%.2f",total);

    }
    public static double calcularCapitalConInteres(double c, int x, int n){
        double calcTotal;
        calcTotal = c * Math.pow(1+ (double) x /100,n);

        return calcTotal;
    }
}
