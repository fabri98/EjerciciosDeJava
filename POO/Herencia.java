package POO;

import java.util.Scanner;

public class Herencia {
    public static void main(String[] args) {
        Empleado emple = new Empleado();
        emple.setNum_legajo(24448);
        emple.setNombre("Fabrizio");
        emple.setId(3);

        System.out.println("\n--------------------------------------------");

        Consultor consul = new Consultor();
        consul.setNombre("James");
        consul.setNum_consultor(16);
        consul.setId(2);

        Consultor consul2 = new Consultor();
        consul.setNombre("Tino");
        consul.setNum_consultor(18);
        consul.setId(2);

        Persona person[] = new Persona[3];
        person[0] = emple;
        person[1] = consul;
        person[2] = consul2;

        System.out.println(consul.getId());


    }

}
