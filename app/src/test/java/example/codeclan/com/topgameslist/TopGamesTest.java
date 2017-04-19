package example.codeclan.com.topgameslist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/04/2017.
 */

public class TopGamesTest {

    @Test
    public void getGamesListTest(){
        TopGames topGames = new TopGames();
        assertEquals(20, topGames.getList().size());
    }
}
