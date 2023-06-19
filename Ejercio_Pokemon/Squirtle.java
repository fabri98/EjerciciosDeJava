package Ejercio_Pokemon;

public class Squirtle extends Pokemon implements IAgua{
    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle usó placaje!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Squirtle usó mordisco!");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Squirtle usó arañazo!");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Squirtle usó hidrobomba!");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle usó pistola de agua!");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle usó burbuja!");
    }
}
