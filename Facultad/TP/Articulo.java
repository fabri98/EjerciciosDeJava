package Facultad.TP;
/*Creamos la clase Articulo*/
public class Articulo {
    /*Definimos sus atributos*/
    protected String ID;
    protected float precioBase;

    /*Constructor con parametros*/
    public Articulo(String ID, float precioBase) {
        this.ID = ID;
        this.precioBase = precioBase;
    }
    /*Metodos Getters y Setters*/
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }

    /*Metodo toString*/
    @Override
    public String toString() {
        return ID + " ("+precioBase+")";
    }
}
