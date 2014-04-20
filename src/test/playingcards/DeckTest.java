package playingcards;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

/**
 * Created by sonali on 4/19/14.
 */
public class DeckTest {

    @Test
    public void shouldReturnACard()
    {
        Deck d = new Deck();
        assertTrue(d.drawRandomCard() instanceof Cards);
    }
}
