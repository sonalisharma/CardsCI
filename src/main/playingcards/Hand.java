package playingcards;

import java.util.ArrayList;

/**
 * Created by sonali on 4/24/14.
 */
public class Hand {

    ArrayList<Card> cards = new ArrayList<Card>();
    public void addCard(Card card) {
        cards.add(card);
    }

    public int cardsCount() {
        return cards.size();
    }

    public Card removeCard(Card card) {
        cards.remove(card);
        return card;
    }

    public int getCardsCount() {
        int count = 0;
        for(Card card: cards)
        {

            count = count + 1;
        }
        return count;
    }
}
