package Facultad.Parciales.Parcial1;

public class Parcial1 {
    // Punto 1: Inventario con 5 prendas (1 punto)
    public static String inventario[] = {"camisa","remera","chaleco","buzo","jeans"};

    public static void main(String[] args) {
        System.out.println("---INVENTARIO INICIAL---");
        mostrarInventario();
        System.out.println("---AGREGAMOS UNA PRENDA---");
        inventario = agregarPrenda("gorro");
        System.out.println("---BUSCAMOS UNA PRENDA---");
        buscarPrenda("remera"); // Uso correcto del método buscarPrenda
        System.out.println("---VENDEMOS UNA PRENDA---");
        venderPrenda("buzo"); // Uso correcto del método venderPrenda
        System.out.println("---MOSTRAMOS INVENTARIO---");
        mostrarInventario();
    }

    public static String[] agregarPrenda(String prenda){
        int tamaño = inventario.length;
        String inventario_[] = new String[tamaño+1];
        for (int i = 0; i < tamaño; i++) {
            inventario_[i] = inventario[i];
        }
        inventario_[tamaño] = prenda;
        System.out.println("El inventario contiene:");
        for (String elemento:inventario_) {
            System.out.println(elemento);
        }
        return inventario_;
    }
    // Punto 3: Método para buscar una prenda (2 puntos)
    public static void buscarPrenda(String prenda){
        int encontrado = 0;
        for (int i = 0; i < inventario.length; i++) {
            if(inventario[i] == prenda){
                encontrado=1;
                break;
            }
        }
        if (encontrado==1){
            System.out.println("Prenda existente: "+prenda);
        }else{
            System.out.println("No existe");
        }
    }

    // Punto 4: Método para vender una prenda (3 puntos)
    public static void venderPrenda(String prenda){
        int encontrado = 0,pos=0;
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] == prenda){
                encontrado = 1;
                pos = i;
                break;
            }
        }
        if (encontrado==1){
            inventario[pos] = "";
            System.out.println("Prenda vendida: "+prenda);
            mostrarInventario();
            for (int i = pos; i < inventario.length-1; i++) {
                String aux = inventario[i];
                inventario[i] = inventario[i+1];
                inventario[i+1] = aux;
            }
        }else{
            System.out.println("No existe la prenda");
        }
    }

    // Punto 5: Método para mostrar el inventario (2 puntos)
    public static void mostrarInventario(){
        int cantidadPrendas=0;
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] != ""){
                System.out.println(inventario[i]);
                cantidadPrendas++;
            }
        }
        System.out.println("Hay "+cantidadPrendas+" prendas.");
    }
}
