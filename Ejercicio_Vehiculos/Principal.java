package Ejercicio_Vehiculos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        List<Vehiculo> autos = new ArrayList<>();
        autos.add(agregarVehiculo());
        autos.add(agregarVehiculo());
        autos.add(agregarVehiculo());

        //Mostramos todos los autos
        for (Vehiculo auto:autos) {
            System.out.println(auto.toString());
        }

        System.out.println("El auto mas barato es:\n"+vehiculoMasBarato(autos).toString());
    }
    //Nos devuelve el auto con el precio mas barato
    public static Vehiculo vehiculoMasBarato(List<Vehiculo> autos) {
        double mas_barato = 500000000;
        for (Vehiculo auto : autos) {
            if (auto.getPrecio() < mas_barato) {
                mas_barato = auto.getPrecio();
            }
        }
        for (Vehiculo auto: autos) {
            if (auto.getPrecio()==mas_barato){
                return auto;
            }
        }
        return null;
    }
    //Agrega un objeto auto
    public static Vehiculo agregarVehiculo(){
        Scanner scan = new Scanner(System.in);
        Vehiculo auto = new Vehiculo();

            System.out.println("--------Sistema de ingreso de autos---------\n");

            System.out.println("Ingrese la marca del auto:");
            String marca = scan.nextLine();
            auto.setMarca(marca);

            System.out.println("Ingrese el modelo del auto:");
            String modelo = scan.nextLine();
            auto.setModelo(modelo);

            System.out.println("Ingrese el precio del auto:");
            double precio = scan.nextDouble();
            auto.setPrecio(precio);

        return auto;
    }
}

