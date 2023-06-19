package Ejercicios_Facultad;

public class OrdemanientoSeleccion {
    public static void main(String[] args) {
        int arreglo[] = {4,3,2,1,5}, posMinimo, aux;

        for (int i = 0; i < arreglo.length; i++) {
            posMinimo = i; // Asignamos la posicion 0 como la posicion donde se encuentra ""EL MINIMO VALOR""
            for (int j = i+1; j < arreglo.length; j++) {
                /*Si el valor en la posicion SIGUIENTE es menor al valor en la posicion MINIMA*/
                if (arreglo[j] < arreglo[posMinimo]) {
                    /*La posicion MINIMA cambia a la posicion siguiente*/
                    posMinimo = j;
                }
            }
            /*Realizamos el cambio de valores*/
            aux = arreglo[i];
            arreglo[i] = arreglo[posMinimo];
            arreglo[posMinimo] = aux;
        }
        System.out.println("El arreglo ordenado es:");
        for (int valor:arreglo){
            System.out.print(valor+" ");
        }
    }
}
