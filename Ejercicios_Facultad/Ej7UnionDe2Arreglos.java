package Ejercicios_Facultad;

import java.util.HashSet;

public class Ej7UnionDe2Arreglos {
    public static void main(String[] args) {
        // Arreglos de ejemplo
        int[] arreglo1 = {1, 2, 3, 4};
        int[] arreglo2 = {3, 4, 5, 6};

        HashSet<Integer> arregloUnion = new HashSet<>();

        // Realizar la unión lógica de los dos arreglos
        for (int i = 0; i < arreglo1.length; i++) {
            arregloUnion.add(arreglo1[i]);
        }
        for (int i = 0; i < arreglo1.length; i++) {
            arregloUnion.add(arreglo2[i]);
        }

        // Imprimir el tercer arreglo (unión lógica)
        for (int valor : arregloUnion) {
            System.out.print(valor + " - ");
        }
    }
}
