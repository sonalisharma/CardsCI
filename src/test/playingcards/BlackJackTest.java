package playingcards;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by sonali on 4/25/14.
 */
public class BlackJackTest {



    @Test
    public void totalValueOfTwoOfSpadeAndThreeOfClubsShouldBeFive()
    {
        Hand h1 = new Hand();
        h1.addCard(new Card(CardRank.TWO,CardSuite.SPADE));
        h1.addCard(new Card(CardRank.THREE,CardSuite.CLUBS));
        BlackJack b = new BlackJack();
        assertEquals(5, b.getHandValue(h1));
    }

    @Test
    public void totalValueOfTwoOfSpadeAndThreeOfClubsEightOfHeartsShouldBe13()
    {
        Hand h1 = new Hand();
        h1.addCard(new Card(CardRank.TWO,CardSuite.SPADE));
        h1.addCard(new Card(CardRank.THREE,CardSuite.CLUBS));
        h1.addCard(new Card(CardRank.EIGHT,CardSuite.HEART));
        BlackJack b = new BlackJack();
        assertEquals(13, b.getHandValue(h1));
    }

    @Test
    public void kingOfSpadeAndQueenOfHeartShouldReturn20()
    {
        Hand h1 = new Hand();
        h1.addCard(new Card(CardRank.KING,CardSuite.SPADE));
        h1.addCard(new Card(CardRank.QUEEN,CardSuite.HEART));
        BlackJack b = new BlackJack();
        assertEquals(20, b.getHandValue(h1));
    }



}
