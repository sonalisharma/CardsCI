package playingcards;

/**
 * Created by sonali on 4/19/14.
 */

public class Cards {

    private int value;
    private CardSuite suite;

    public Cards(int value, CardSuite suite)
    {
        this.value = value;
        this.suite = suite;
    }

    public int getValue() {
        return value;
    }

}
