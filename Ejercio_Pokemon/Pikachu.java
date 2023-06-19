package Ejercio_Pokemon;

public class Pikachu extends Pokemon implements IElectrico{
    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu usó placaje!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Pikachu usó mordisco!");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Pikachu usó arañazo!");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Pikachu usó impactrueno!");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Pikachu usó puño fuego!");
    }
}
