package Collections;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
    Stack<Integer> pila = new Stack<>();

    pila.push(1);
    pila.push(2);
    pila.push(3);

    for (int pilita:pila){
        System.out.println(pilita);
    }
        System.out.println("Buscando el valor 2 en la posicion "+pila.search(2));
        System.out.println("Trayendo el ultimo valor de la pila:"+pila.peek());
        System.out.println("Removiendo el ultimo valor en ingresar.");
        pila.pop();

        for (int pilita:pila){
            System.out.println(pilita);
        }

    }
}
