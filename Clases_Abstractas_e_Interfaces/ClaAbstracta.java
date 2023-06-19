package Clases_Abstractas_e_Interfaces;

public class ClaAbstracta {
    public static void main(String[] args) {
        Circulo circ = new Circulo(5.2);
        Cuadrado cuad = new Cuadrado(6);

        double areaCuadrado = cuad.calcularArea();
        double areaCirculo = circ.calcularArea();
        System.out.println("El area del cuadrado es: "+areaCuadrado);
        System.out.println("El area del circulo es: "+areaCirculo);
        circ.dibujar();
        circ.rotar();
        cuad.dibujar();
    }
}
