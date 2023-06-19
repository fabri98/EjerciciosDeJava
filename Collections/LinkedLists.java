package Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {
        List<Persona> lista = new LinkedList<Persona>();
        // Agregando al final de la lista
        lista.add(new Persona(1,"Fabrizio",24));
        lista.add(new Persona(2,"Jim",2));
        lista.add(new Persona(3,"Tino",3));
        lista.add(new Persona(4,"Pepi",2));

        //Agregando al principio de la lista
        lista.add(0,new Persona(4,"Rubio",3));
        //recorrido for each
        for(Persona person:lista){
            System.out.println("Recorrido con forEach: "+person.getNombre());
        }
    }
}
