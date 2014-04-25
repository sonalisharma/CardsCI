package playingcards;

import java.util.ArrayList;

/**
 * Created by sonali on 4/19/14.
 */
public class Deck {
    private ArrayList<Cards> cards=  new ArrayList<Cards>();

    public Deck()
    {
        for(int i =1; i<=13;i++)
        {
            cards.add(new Cards(i,CardSuite.CLUBS));
            cards.add(new Cards(i,CardSuite.HEART));
            cards.add(new Cards(i,CardSuite.SPADE));
            cards.add(new Cards(i,CardSuite.DIAMOND));
        }
    }

    public Cards drawRandomCard() {
        return new Cards(10,CardSuite.CLUBS);
    }



    public int getSize() {
        return cards.size();
    }


}
