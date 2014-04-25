package playingcards;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

/**
 * Created by sonali on 4/24/14.
 */


public class HandTest {

    @Test
    public void addingTwoCardsShouldReturn2asTheLengthOfHands()
    {
        Hand h = new Hand();
        h.addCard(new Cards(1,CardSuite.CLUBS));
        h.addCard(new Cards(1,CardSuite.CLUBS));
        assertTrue(2==h.cardsCount());
    }

    @Test
    public void removeOneCardsshouldReducetheSizeOfHandByOne()
    {
        Hand h = new Hand();
        h.addCard(new Cards(1,CardSuite.CLUBS));
        h.addCard(new Cards(1,CardSuite.CLUBS));
        assertTrue(2==h.cardsCount());
        h.removeCard(new Cards(1,CardSuite.CLUBS));
        assertTrue(1==h.cardsCount());
    }
}
