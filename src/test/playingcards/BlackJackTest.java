package playingcards;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

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

    @Test
    public void kingOfSpadeAndThreeOfHeartShouldReturn13()
    {
        Hand h1 = new Hand();
        h1.addCard(new Card(CardRank.KING,CardSuite.SPADE));
        h1.addCard(new Card(CardRank.THREE,CardSuite.HEART));
        BlackJack b = new BlackJack();
        assertEquals(13, b.getHandValue(h1));
    }

    @Test
    public void aceOfSpadeAndThreeOfDiamondShouldReturn14()
    {
        Hand h1 = new Hand();
        h1.addCard(new Card(CardRank.ACE,CardSuite.SPADE));
        h1.addCard(new Card(CardRank.THREE,CardSuite.HEART));
        BlackJack b = new BlackJack();
        assertEquals(14, b.getHandValue(h1));
    }

    @Test
    public void aceOfSpadeAndAceOfHeartsAndEightOfDiamondShouldReturn20()
    {
        Hand h1 = new Hand();
        h1.addCard(new Card(CardRank.ACE,CardSuite.SPADE));
        h1.addCard(new Card(CardRank.ACE,CardSuite.HEART));
        h1.addCard(new Card(CardRank.EIGHT,CardSuite.DIAMOND));
        BlackJack b = new BlackJack();
        assertEquals(20, b.getHandValue(h1));
    }

    @Test
    public void handWithValue17ShouldBeatHandwithValue14()
    {
        Hand h1 = new Hand();
        h1.addCard(new Card(CardRank.ACE,CardSuite.SPADE));
        h1.addCard(new Card(CardRank.SIX,CardSuite.HEART));

        Hand h2 = new Hand();
        h2.addCard(new Card(CardRank.EIGHT,CardSuite.SPADE));
        h2.addCard(new Card(CardRank.SIX,CardSuite.HEART));

        BlackJack b = new BlackJack();
        assertTrue(b.getResult(h1,h2));

    }


}
