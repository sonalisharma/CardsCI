package playingcards;

import java.util.ArrayList;

/**
 * Created by sonali on 4/19/14.
 */
public class Deck {
    private ArrayList<Cards> cards=  new ArrayList<Cards>();

    public void Deck()
    {

    }

    public Cards drawRandomCard() {
        return new Cards(10,CardSuite.CLUBS);
    }
}
