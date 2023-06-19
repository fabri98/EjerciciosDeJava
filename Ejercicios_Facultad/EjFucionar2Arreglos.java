package Ejercicios_Facultad;

public class EjFucionar2Arreglos {
    public static void main(String[] args) {
        int[] lista1 = {1, 3, 5, 7, 9};
        int[] lista2 = {2, 4, 6, 8, 10};

        int[] listaFusionada = new int[lista1.length + lista2.length];

        // Fusión de las listas ordenadas
        for (int i = 0; i < lista1.length; i++) {
            listaFusionada[i] = lista1[i];
        }
        for (int j = 0; j < lista2.length; j++) {
            listaFusionada[lista1.length+j] = lista2[j];
        }
        ordenarArreglo(listaFusionada);
    }
    public static void ordenarArreglo(int resultado[]){
        for (int i = 0; i < resultado.length; i++) {
            int indiceMinimo = i;
            for (int j = i+1; j < resultado.length; j++) {
                if (resultado[j] < resultado[indiceMinimo]){
                    indiceMinimo = j;
                }
            }
            int aux = resultado[indiceMinimo];
            resultado[indiceMinimo] = resultado[i];
            resultado[i] = aux;
        }
        // Mostrar listaFusionada
        System.out.println("Lista Fusionada (con enlaces implícitos):");
        for (int elemento : resultado) {
            System.out.print(elemento + " ");
        }
    }
}

