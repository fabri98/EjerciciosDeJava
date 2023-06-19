package Ejercio_Pokemon;

public class EjercicioIntegrador {
    public static void main(String[] args) {
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pika = new Pikachu();
        Squirtle squirtle = new Squirtle();

        charmander.atacarArañazo();
        charmander.atacarLanzarLlamas();
        squirtle.atacarArañazo();
        squirtle.atacarHidrobomba();
        bulbasaur.atacarArañazo();
        bulbasaur.atacarDrenaje();
        pika.atacarArañazo();
        pika.atacarImpactrueno();
    }
}
