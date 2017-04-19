package example.codeclan.com.topgameslist;

/**
 * Created by user on 19/04/2017.
 */

public class Game {

    private int ranking;
    private String title;
    private String genre;

    public Game(int ranking, String title, String genre){
        this.ranking = ranking;
        this.title = title;
        this.genre = genre;
    }

    public Integer getRanking(){
        return ranking;
    }

    public String getTitle(){
        return title;
    }

    public String getGenre(){
        return genre;
    }

}
