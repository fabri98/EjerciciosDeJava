package Ejercicio_Atletas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cant_atletas;

        System.out.print("Ingrese la cantidad de atletas:");
        cant_atletas = scan.nextInt();
        Atleta atletas[] = agregarAtletas(cant_atletas,scan);

        System.out.println(masRapido(atletas).mostrarDatos());
        }

    public static Atleta[] agregarAtletas(int cantidad_atletas, Scanner scan){
        Atleta atletas[]= new Atleta[cantidad_atletas];
        int numero;
        String nombre;
        float tiempo;
        for (int i=0;i<cantidad_atletas;i++){
            System.out.print("Ingrese el numero del atleta:");
            numero = scan.nextInt();
            scan.nextLine();
            System.out.print("Ingrese el nombre del atleta:");
            nombre = scan.nextLine();
            System.out.print("Ingrese el tiempo record del atleta:");
            tiempo = scan.nextFloat();
            System.out.println();
            atletas[i] = new Atleta(numero,nombre,tiempo);
        }
        return atletas;
    }
    public static Atleta masRapido(Atleta atletas[]){
        float record;
        record = 5000000;
        for (Atleta atleta:atletas){
            if (atleta.getTiempo()<record){
                record = atleta.getTiempo();
            }
        }
        for (Atleta atleta:atletas) {
            if (atleta.getTiempo() == record){
                return atleta;
            }
        }
        return null;
    }
}
