package Ejercicios_Facultad;

public class OrdenamientoBurbuja {
    public static void main(String[] args) {
        int arreglo[] = {8,2,5,1,7,3}, aux;

        for (int i = 0; i < arreglo.length-1; i++) {
            for (int j = 0; j < arreglo.length-1; j++) {
                /* Si valorActual > valorSiguiente, hacemos el intercambio de valores*/
                if (arreglo[j] > arreglo[j+1]) {
                    /*Guardamos el valor ACTUAL*/
                    aux = arreglo[j];
                    /*En la posicion ACTUAL guardamos el valor SIGUIENTE*/
                    arreglo[j] = arreglo[j+1];
                    /*En la posicion SIGUIENTE guardamos el valor ACTUAL*/
                    arreglo[j+1] = aux;
                }
            }
        }
        System.out.println("El arreglo ordenado es:");
        for (int valor:arreglo){
            System.out.print(valor+" ");
        }
    }
}
