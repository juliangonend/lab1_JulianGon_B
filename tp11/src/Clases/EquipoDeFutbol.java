package Clases;
import java.util.ArrayList;

public class EquipoDeFutbol {
    private ArrayList<String> players = new ArrayList<>();

    public void setPlayers(ArrayList<String> players) {
        this.players = players;
    }

    public void printTeam() {
        int i = 1;
        System.out.println("Lista de jugadores:");
        for (String p : players) {
            System.out.println(i + " : " + p);
            i++;
        }
    }

    public void addPlayer(String player) {
        players.add(player);
        System.out.println("Añadiendo jugador: " + player);
    }

    public void removePlayer(String player) {
        if (players.contains(player)) {
            players.remove(player);
            System.out.println("Eliminando jugador: " + player);
        } else {
            System.out.println("El jugador " + player + " no existe en el equipo.");
        }
    }
}
