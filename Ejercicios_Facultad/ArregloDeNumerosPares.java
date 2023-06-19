package Ejercicios_Facultad;

public class ArregloDeNumerosPares {
    public static void main(String[] args) {
        int numeros[] = {1,2,3,4,5,6,7,8};
        int numPares[] = agregarPares(numeros);

        for (int valor:numPares) {
            System.out.println(valor);
        }

    }
    public static int[] agregarPares(int num[]){
        int tamaño = cantidadPares(num);
        int pares[] = new int[tamaño];
        int cont=0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0){
                pares[cont] = num[i];
                cont++;
            }
        }
        return pares;
    }
    public static int cantidadPares(int num[]){
        int contPares=0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0){
                contPares++;
            }
        }
        return contPares;
    }
}
