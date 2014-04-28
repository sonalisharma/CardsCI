package playingcards;

/**
 * Created by sonali on 4/19/14.
 */
public class BlackJack {

    public int getHandValue(Hand hand)
    {
        int value = 0;
        for(Card card: hand.cards)
        {
            value = value + card.getRank().ordinal()+1;
        }

        return value;
    }

    public static void main(String[] args) {


        //Cards c = new Cards(11);
        //System.out.println(c.getValue());

    }


}
