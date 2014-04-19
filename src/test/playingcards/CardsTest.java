package playingcards;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by sonali on 4/19/14.
 */

public class CardsTest {

    @Test
    public void  shouldReturnValueBetweenOneToThirteen()
    {
        Cards card = new Cards(11);
        assertEquals(11,card.getValue());
    }

}
