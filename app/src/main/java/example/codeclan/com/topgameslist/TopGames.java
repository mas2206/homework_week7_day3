package example.codeclan.com.topgameslist;

import java.util.ArrayList;

/**
 * Created by user on 19/04/2017.
 */

public class TopGames {

    private ArrayList<Game> list;

    public TopGames(){
        list = new ArrayList<Game>();
        list.add(new Game(1, "Dark Souls", "Action, RPG"));
        list.add(new Game(2, "Super Meat Boy", "Platformer"));
        list.add(new Game(3, "StarCraft II", "RTS"));
        list.add(new Game(4, "LIMBO", "Puzzle, Platformer"));
        list.add(new Game(5, "Fallout: New Vegas", "FPS, RPG"));
        list.add(new Game(6, "Age of Empires II", "RTS"));
        list.add(new Game(7, "DOOM", "FPS"));
        list.add(new Game(8, "Prince of Persia", "Platformer"));
        list.add(new Game(9, "Lord of the Rings: Battle for Middle Earth II", "RTS"));
        list.add(new Game(10, "Trials HD", "Physics, Racing"));
        list.add(new Game(11, "Portal", "Puzzle"));
        list.add(new Game(12, "BioShock", "FPS"));
        list.add(new Game(13, "Gears of War", "Third Person Shooter"));
        list.add(new Game(14, "Gears of War 2", "Third Person Shooter"));
        list.add(new Game(15, "Deadly Premonition", "Horror, Mystery"));
    }

    public ArrayList<Game> getList(){
        return new ArrayList<Game>(list);
    }
}
