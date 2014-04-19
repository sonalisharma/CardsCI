package playingcards;

import org.junit.Test;
import playingcards.Cards;

import static junit.framework.Assert.assertEquals;

/**
 * Created by sonali on 4/19/14.
 */

public class CardsTest {

    @Test
    public void  shouldreturnAreaOfTenforTwoByFiveRectangle()
    {
        Cards rectangle = new Cards(5,2);
        assertEquals(10,rectangle.area());
    }

}
