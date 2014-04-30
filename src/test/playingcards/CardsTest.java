package playingcards;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by sonali on 4/19/14.
 */

public class CardsTest {

   /* @Test
    public void  shouldReturnValueBetweenOneToThirteen()
    {
        Cards card1 = new Cards(11);
        assertEquals(11,card1.getValue());
    }
    */
    /*@Test
    public void card2OfSpadesShouldHaveSuiteSpade()
    {
        Cards card1 = new Cards(11,"spade");
        assertEquals("spade", new cards(10,);
    }*/

    @Test
    public void AceOfSpadeShouldBeEqualToAceOfClubs()
    {
        assertEquals(new Card(CardRank.ACE, CardSuite.SPADE), new Card(CardRank.ACE,CardSuite.CLUBS));
    }

    @Test
    public void aceofSpadeShouldHaveRankAce()
    {
        Card card = new Card(CardRank.ACE, CardSuite.SPADE);
        assertEquals(CardRank.ACE,card.getRank());
    }

    @Test
    public void aceofSpadeShouldHaveSuiteSpade()
    {
        Card card = new Card(CardRank.ACE, CardSuite.SPADE);
        assertEquals(CardSuite.SPADE,card.getSuite());
    }

    @Test
    public void aceofSpadeShouldPrintACEofSPADE()
    {
        Card card = new Card(CardRank.ACE, CardSuite.SPADE);
        assertEquals("ACE of SPADE",card.toString());
    }

    /*This test becomes redundant now
    @Test
    public void AceOfSpadeShouldbeGreaterThanTwoOfSpade()
    {
        assertTrue(new Card(CardRank.ACE, CardSuite.SPADE).isGreater(new Card(CardRank.ACE, CardSuite.SPADE)));
    }

    @Test
    public void EightOfSpadeShouldbeGreaterThanTwoOfClubs()
    {
        assertTrue(new Card(CardRank.EIGHT, CardSuite.SPADE).isGreater(new Card(2, CardSuite.CLUBS)));
    }
    */


}
