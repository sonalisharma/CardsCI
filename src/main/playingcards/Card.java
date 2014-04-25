package playingcards;

/**
 * Created by sonali on 4/19/14.
 */

public class Card {

    private int value;
    private CardSuite suite;

    public Card(int value, CardSuite suite)
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
        if(! (other instanceof Card)) return false;
        return (this.getValue() == ((Card) other).getValue());
    }
    public boolean isGreater(Card other) {

        if(this.getValue() == 1) return true;
        else return this.getValue() > other.getValue();

    }

}
