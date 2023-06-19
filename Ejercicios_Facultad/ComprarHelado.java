package Ejercicios_Facultad;

import java.util.Scanner;

public class ComprarHelado {
    public static final float HELADO = 100;
    public static final float OREO = 10;
    public static final float CHIPS_CHOCOLATE = 15;
    public static final float BROWNIE = 20;
    public static final float OBLEAS = 12;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opc;
        float total_compra=0;

        System.out.println("El precio del helado SIN ADICIONALES ES DE $100.");
        do {
            System.out.println("Lista de Adicionales:");
            System.out.println("1. Oreo($10)\n2.Chips de Chocolate($15)\n3.Brownie($20)\n4.Obleas(12)\n5.Sin adicional(Finaliza la compra)\nOpcion:");
            opc = scan.nextInt();
            switch (opc){
                case 1:total_compra += OREO;
                    System.out.println("\nSi desea agregar otro adicional, eliga una opcion:");
                break;
                case 2:total_compra += CHIPS_CHOCOLATE;
                    System.out.println("\nSi desea agregar otro adicional, eliga una opcion:");
                break;
                case 3:total_compra += BROWNIE;
                    System.out.println("\nSi desea agregar otro adicional, eliga una opcion:");
                break;
                case 4:total_compra += OBLEAS;
                    System.out.println("\nSi desea agregar otro adicional, eliga una opcion:");
                break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion invalida!!");
                    break;
            }

        }while(opc != 5);
        total_compra+=HELADO;

        System.out.printf("\nEl precio total del helado es: %.2f",total_compra);

    }
}
