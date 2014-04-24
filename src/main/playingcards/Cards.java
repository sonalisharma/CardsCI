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

    private int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object other)
    {
        if(this == other) return true;
        if(! (other instanceof Cards)) return false;
        return (this.getValue() == ((Cards) other).getValue());
    }
    public boolean isGreater(Cards other) {

        if(this.getValue() == 1) return true;
        else return this.getValue() > other.getValue();

    }

}
