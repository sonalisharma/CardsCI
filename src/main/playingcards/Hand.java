package playingcards;

import java.util.ArrayList;

/**
 * Created by sonali on 4/24/14.
 */
public class Hand {

    ArrayList<Card> hand = new ArrayList<Card>();
    public void addCard(Card card) {
        hand.add(card);
    }

    public int cardsCount() {
        return hand.size();
    }

    public Card removeCard(Card card) {
        hand.remove(card);
        return card;
    }

}
