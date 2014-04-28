package playingcards;

/**
 * Created by sonali on 4/19/14.
 */
public class BlackJack {

    public int getHandValue(Hand hand)
    {
        int totalVal = 0;
        int cntAce = 0;

        for(Card card: hand.cards)
        {
            int cardValue = 0;
            if(card.getRank() == CardRank.ACE)
            {
                cntAce++;
            }
            else
            {
                if(card.getRank().ordinal() >=10)
                    cardValue = 10;
                else
                    cardValue = card.getRank().ordinal() + 1;
            }

            totalVal = totalVal + cardValue;
        }

        for(int i=1; i<=cntAce; i++)
        {
            int diff = 21 - totalVal;
            int aceValue = (diff > 10) ? 11 : 1;
            totalVal += aceValue;
        }

        return totalVal;
    }

    public static void main(String[] args) {


        //Cards c = new Cards(11);
        //System.out.println(c.getValue());

    }


}
