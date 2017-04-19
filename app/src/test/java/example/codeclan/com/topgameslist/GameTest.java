package example.codeclan.com.topgameslist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/04/2017.
 */

public class GameTest {

    Game game;

    @Before
    public void before(){
        game = new Game(974, "Two Worlds", "RPG");
    }

    @Test
    public void getRankingTest(){
        assertEquals((Integer)974, game.getRanking());
    }

    @Test
    public void getTitleTest(){
        assertEquals("Two Worlds", game.getTitle());
    }

    @Test
    public void getGenreTest(){
        assertEquals("RPG", game.getGenre());
    }

}
