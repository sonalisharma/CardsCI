package playingcards;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by sonali on 4/19/14.
 */
public class Deck {
    private ArrayList<Card> cards=  new ArrayList<Card>();
    public static final int DECK_SIZE = 52;

    public Deck()
    {
       for(CardRank r: CardRank.values())
       {

           for(CardSuite s: CardSuite.values())
           {
            cards.add(new Card(r,s));
           }

        }
    }

    public Card dealCard()
    {
        if(this.getSize() == 0)
        {
            throw new RuntimeException("Deck does not have any cards left");
        }
        else
        {
            return cards.remove(0);
        }
    }

    public int getSize()
    {
        return cards.size();
    }


    public void shuffle()
    {
        for(int i=0;i<this.getSize();i++)
        {
            Random r = new Random();
            Card temp = cards.get(i);
            int rand = r.nextInt(this.getSize());
            cards.set(i,cards.get(rand));
            cards.set(rand,temp);

        }

    }


}
