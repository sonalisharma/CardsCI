package playingcards;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

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
        assertEquals(new Cards(1, CardSuite.SPADE), new Cards(1,CardSuite.CLUBS));
    }

    @Test
    public void AceOfSpadeShouldbeGreaterThanTwoOfSpade()
    {
        assertTrue(new Cards(1, CardSuite.SPADE).isGreater(new Cards(2, CardSuite.SPADE)));
    }

    @Test
    public void EightOfSpadeShouldbeGreaterThanTwoOfClubs()
    {
        assertTrue(new Cards(8, CardSuite.SPADE).isGreater(new Cards(2, CardSuite.CLUBS)));
    }


}
