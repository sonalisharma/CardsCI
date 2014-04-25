package playingcards;

/**
 * Created by sonali on 4/19/14.
 */

public class Card {

    private CardRank rank;
    private CardSuite suite;

    public Card(CardRank rank, CardSuite suite)
    {
        this.rank = rank;
        this.suite = suite;
    }

    public CardRank getRank() {
        return rank;
    }

    public CardSuite getSuite() {
        return suite;
    }

    @Override
    public boolean equals(Object other)
    {
        if(this == other) return true;
        if(! (other instanceof Card)) return false;
        return (this.getRank() == ((Card) other).getRank());
    }

    /* Commenting this out since this is not really the behaviour of a Card class
    public boolean isGreater(Card other) {

        if(this.getValue() == 1) return true;
        else return this.getValue() > other.getValue();

    } */

}
