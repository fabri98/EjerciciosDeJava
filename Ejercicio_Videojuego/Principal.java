package Ejercicio_Videojuego;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Videojuego> juegos = new ArrayList<>();
        Videojuego g1 = new Videojuego(1,"Mario Bros","Nintendo 64", 1,"Plataformas");
        Videojuego g2 = new Videojuego(2,"Zelda","Nintendo 64", 1,"Aventura");
        Videojuego g3 = new Videojuego(3,"Brawl Stars","Movil", 3,"MOBA");
        Videojuego g4 = new Videojuego(4,"CS 1.6","PC", 1,"Shooter");
        Videojuego g5 = new Videojuego(5,"GTA","PlayStation", 2,"Accion");

        juegos.add(g1);
        juegos.add(g2);
        juegos.add(g3);
        juegos.add(g4);
        juegos.add(g5);

        for(Videojuego game: juegos){
            System.out.printf("\nTitulo: %s, Consola: %s, Cantidad de Jugadores: %d",game.getTitulo(),game.getConsola(), game.getCant_jugadores());
        }
        g3.setTitulo("Clash Royale");
        g3.setCant_jugadores(1);
        g5.setTitulo("Valorant");
        g5.setCant_jugadores(1);

        System.out.println("\n\n---------Cambio en los titulos y cantidad de jugadores------------");
        for(Videojuego game: juegos){
            System.out.printf("\nTitulo: %s, Consola: %s, Cantidad de Jugadores: %d",game.getTitulo(),game.getConsola(), game.getCant_jugadores());
        }

        System.out.println("\n\n-------Juegos para la consola Nintendo 64-------");
        for (Videojuego game: juegos){
            if(game.getConsola().equals("Nintendo 64")){
                System.out.println(game);
            }
        }

    }
}
