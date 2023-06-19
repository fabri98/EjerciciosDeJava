package Ejercio_Pokemon;

public class Bulbasaur extends Pokemon implements IPlanta{
    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Bulbasaur usó placaje!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Bulbasaur usó mordisco!");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Bulbasaur usó arañazo!");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasaur usó drenaje!");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasaur usó paralizar!");
    }
}
