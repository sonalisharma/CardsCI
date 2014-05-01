package playingcards;

import java.util.Scanner;

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



    public boolean getResult(Hand playerHand, Hand dealerHand) {

       if (getHandValue(playerHand) == 21) return true;
       if (getHandValue(dealerHand) == 21) return true;
       if (getHandValue(playerHand) > 21) return false;
       if (getHandValue(dealerHand) > 21) return false;
       return getHandValue(playerHand) > getHandValue(dealerHand);


    }

    public static void main(String[] args) {

        boolean flag = false;
        boolean userInputEnd = false;
        boolean dealerInputEnd = false;

        Deck d = new Deck();
        d.shuffle();
        Hand user = new Hand();
        BlackJack game = new BlackJack();


        System.out.println("===================================");
        System.out.println(" WELCOME TO THE GAME OF BLACK JACK");
        System.out.println("===================================");
        System.out.println("Your     Hand");

        user.addCard(d.dealCard());
        user.addCard(d.dealCard());
        user.displayCards();

        Hand dealer = new Hand();
        dealer.addCard(d.dealCard());
        dealer.addCard(d.dealCard());

        System.out.println("Do you want to hit? Type Y for Yes and N for No");
        Scanner inputReader = new Scanner(System.in);

        //Getting input in String format
        String response = inputReader.nextLine();

        while(flag == false)
        {
            System.out.println(response);
            if(response.endsWith("Y"))
            {
                user.addCard(d.dealCard());
                user.displayCards();
                if(game.getHandValue(user) > 21)
                {
                    flag = true;
                    break;
                }

                System.out.println("Do you want to hit? Type Y for Yes and N for No");
                response = inputReader.nextLine();
            }
            else
            {
                userInputEnd = true;
            }

            if(game.getHandValue(dealer) <= 16)
            {
                dealer.addCard(d.dealCard());
                if(game.getHandValue(dealer) > 21)
                {
                    flag = true;
                    break;
                }

            }
            else
            {
                if(userInputEnd) break;
            }

        }

        if(game.getResult(user,dealer))
        {
            System.out.println("Congratulations!!! you won!!!!");
        }
        else
        {
            System.out.println("The dealer won!!!");
        }


    }

}
