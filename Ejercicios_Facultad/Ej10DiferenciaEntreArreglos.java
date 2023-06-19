package Ejercicios_Facultad;

public class Ej10DiferenciaEntreArreglos {
    public static void main(String[] args) {
        int arreglo1[] = {1,2,3,4,5};
        int arreglo2[] = {1,2,3,7,8};
        int resultado[] = new int[arreglo1.length];
        int cont = 0;
        for (int i = 0; i < arreglo1.length; i++) {
            boolean encontrado = false;
            for (int j = 0; j < arreglo2.length; j++) {
                if (arreglo1[i] == arreglo2[j]){
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado){
                resultado[cont] = arreglo1[i];
                cont++;
            }
        }
        for (int valor:resultado) {
            System.out.print(valor+" - ");
        }
    }
}
