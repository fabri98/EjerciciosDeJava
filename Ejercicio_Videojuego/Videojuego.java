package Ejercicio_Videojuego;

public class Videojuego {
    private int codigo;
    private String titulo;
    private String consola;
    private int cant_jugadores;
    private String categoria;

    public Videojuego() {
    }

    public Videojuego(int codigo, String titulo, String consola, int cant_jugadores, String categoria) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.cant_jugadores = cant_jugadores;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public int getCant_jugadores() {
        return cant_jugadores;
    }

    public void setCant_jugadores(int cant_jugadores) {
        this.cant_jugadores = cant_jugadores;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", consola='" + consola + '\'' +
                ", cant_jugadores=" + cant_jugadores +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
