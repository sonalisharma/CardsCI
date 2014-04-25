package playingcards;

import java.util.ArrayList;

/**
 * Created by sonali on 4/24/14.
 */
public class Hand {

    ArrayList<Cards> hand = new ArrayList<Cards>();
    public void addCard(Cards card) {
        hand.add(card);
    }

    public int cardsCount() {
        return hand.size();
    }
}
