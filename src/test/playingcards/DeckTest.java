package playingcards;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by sonali on 4/19/14.
 */
public class DeckTest {

    @Test
    public void shouldReturnACard()
    {
        Deck d = new Deck();
        assertTrue(d.dealCard() instanceof Card);
    }



    @Test
    public void oneDeckShouldHave52Cards()
    {
        Deck d = new Deck();
        assertEquals(52, d.getSize());
    }

    /*@Test
    public void shufflingCardShouldReturnDifferentCards()
    {
        Deck d = new Deck();
        Card c1 = d.dealCard();
        d.shuffle();
        Card c2 = d.dealCard();
        assertEquals(c1,c2);
    }*/

    @Test(expected = RuntimeException.class)
    public void dealingCardfromEmptyDeckShouldThrowException()
    {
        Deck d= new Deck();
        for(int i=0; i<54;i++)
        {
            d.dealCard();
        }
    }

    //removecard, shuffle,

}
