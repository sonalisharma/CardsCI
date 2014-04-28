package playingcards;

/**
 * Created by sonali on 4/19/14.
 */
public class BlackJack {

    public int getHandValue(Hand hand)
    {
        int acc = 0;
        int cardValue = 0;
        for(Card card: hand.cards)
        {
            if(card.getRank().ordinal() >=10)
            {
                cardValue = 10;
            }
            else
            {
                cardValue = card.getRank().ordinal()+1;
            }
            acc = acc + cardValue;
        }

        return acc;
    }

    public static void main(String[] args) {


        //Cards c = new Cards(11);
        //System.out.println(c.getValue());

    }


}
