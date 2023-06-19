package Ejercicio_Atletas;

public class Atleta {
    private int numero;
    private String nombre;
    private float tiempo;

    public Atleta() {
    }

    public Atleta(int numero, String nombre, float tiempo) {
        this.numero = numero;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTiempo() {
        return tiempo;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }
    public String mostrarDatos(){
        return "Datos del atleta mas rapido:\nNumero:"+this.numero+"\nNombre:"+this.nombre+
                "\nTiempo record:"+this.tiempo;
    }
}
