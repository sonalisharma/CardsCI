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

    @Override
    public boolean equals(Object other)
    {
        if(this == other) return true;
        if(! (other instanceof Cards)) return false;
        return (this.getValue() == ((Cards) other).getValue());
        //return true;
    }
}
