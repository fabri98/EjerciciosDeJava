package Collections;

public class TryCatch {
    public static void main(String[] args) {
        int edades[] = {1,2,3,4};

        try{
            System.out.println("La edad de la posicion 4 es: "+edades[4]);
        }catch (Exception e){
            System.out.println("Intestaste acceder a un indice que no exite.");
        }finally {
            System.out.println("Termino el programa!");
        }
    }
}
