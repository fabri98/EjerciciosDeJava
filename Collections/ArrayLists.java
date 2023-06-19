package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<Persona>();
        lista.add(new Persona(1,"Fabrizio",24));
        lista.add(new Persona(2,"Jim",2));
        lista.add(new Persona(3,"Tino",3));
        lista.add(new Persona(4,"Pepi",2));

        //recorrido por indice
        for(int i=0;i< lista.size();i++){
            System.out.println("Recorrido por indice: "+lista.get(i).getNombre());
        }
        System.out.println("-------------------------------------------");
        //recorrido for each
        for(Persona person:lista){
            System.out.println("Recorrido con forEach: "+person.getNombre());
        }
    }
}
