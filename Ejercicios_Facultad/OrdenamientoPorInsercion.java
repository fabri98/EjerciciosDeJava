package Ejercicios_Facultad;

public class OrdenamientoPorInsercion {
    public static void main(String[] args) {
        int arreglo[] = {3,4,8,7,6,5}, pos, aux;

        //Ordenamiento por insercion
        for (int i=0;i< arreglo.length;i++){
            pos = i;
            aux = arreglo[i];
            //Entra al bucle cuando la posicion(pos) es mayor a 0 y el valor ANTERIOR es mayor a el valor ACTUAL
            while ((pos > 0 ) && (arreglo[pos-1] > aux)){
                //Intercambiamos el valor de la posicion ACTUAL por el valor en la posicion ANTERIOR
                arreglo[pos] = arreglo[pos-1];
                //Disminuimos en 1 la posicion(pos)
                pos--;
            }
            //Insertamos el valor de la posicion ACTUAL en la posicion ANTERIOR
            arreglo[pos] = aux;
        }
        System.out.println("El arreglo ordenado es:");
        for (int valor:arreglo) {
            System.out.printf(valor+" ");
        }
    }
}
