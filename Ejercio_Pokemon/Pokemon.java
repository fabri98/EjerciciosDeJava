package Ejercio_Pokemon;

public abstract class Pokemon {
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;

    protected abstract void atacarPlacaje();
    protected abstract void atacarMordisco();
    protected abstract void atacarArañazo();


}
