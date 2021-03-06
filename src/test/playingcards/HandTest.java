package playingcards;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by sonali on 4/24/14.
 */


public class HandTest {

    @Test
    public void addingTwoCardsShouldReturn2asTheLengthOfHands()
    {
        Hand h = new Hand();
        h.addCard(new Card(CardRank.ACE,CardSuite.CLUBS));
        h.addCard(new Card(CardRank.ACE,CardSuite.CLUBS));
        assertTrue(2==h.cardsCount());
    }

    @Test
    public void removeOneCardsshouldReducetheSizeOfHandByOne()
    {
        Hand h = new Hand();
        h.addCard(new Card(CardRank.ACE,CardSuite.CLUBS));
        h.addCard(new Card(CardRank.ACE,CardSuite.CLUBS));
        assertTrue(2==h.cardsCount());
        h.removeCard(new Card(CardRank.ACE,CardSuite.CLUBS));
        assertTrue(1==h.cardsCount());
    }

    @Test
    public void addingTwoCardsInHandsShouldAddtwoCards()
    {
        Hand h1 = new Hand();
        h1.addCard(new Card(CardRank.TWO,CardSuite.SPADE));
        h1.addCard(new Card(CardRank.THREE,CardSuite.CLUBS));
        assertEquals(2,h1.getCardsCount());
    }

   //hand remove card should return card


}
