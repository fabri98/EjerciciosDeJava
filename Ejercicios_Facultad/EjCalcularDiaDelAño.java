package Ejercicios_Facultad;
import java.util.Scanner;
public class EjCalcularDiaDelAño {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingresa el número del día del año (1-366): ");
            int dia = sc.nextInt();
            sc.close();

            String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
            int primerDia = 1; // Lunes (primer día del año)

            int numeroDia = (dia - 1) % 7;
            int indiceDia = (primerDia + numeroDia - 1) % 7;

            System.out.println("El día " + dia + " del año corresponde a: " + diasSemana[indiceDia]);
        }
    }

