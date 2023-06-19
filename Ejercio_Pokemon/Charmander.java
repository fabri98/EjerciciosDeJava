package Ejercio_Pokemon;

public class Charmander extends Pokemon implements IFuego{
    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander usó placaje!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander usó mordisco!");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Charmander usó arañazo!");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Charmander usó puño fuego!");
    }

    @Override
    public void atacarLanzarLlamas() {
        System.out.println("Charmander usó lanza llamas!");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander usó ascuas!");
    }
}
