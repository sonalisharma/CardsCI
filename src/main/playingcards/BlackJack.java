package playingcards;

import javax.swing.*;
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
        System.out.println("===================================");
        System.out.println(" WELCOME TO THE GAME OF BLACK JACK");
        System.out.println("===================================");
        System.out.println("Your     Hand");
        Deck d = new Deck();
        Hand user = new Hand();
        user.addCard(d.dealCard());
        user.addCard(d.dealCard());
        user.displayCards();

        Hand dealer = new Hand();
        dealer.addCard(d.dealCard());
        dealer.addCard(d.dealCard());

        System.out.println("Do you want to hit? Type Y for Yes and N for No ");
        Scanner inputReader = new Scanner(System.in);

        //Getting input in String format
        String name = inputReader.nextLine();
        System.out.println("Hi " + name);

        //Getting number as input from command line in Java
        System.out.println("Please enter a number from command line? ");
        int number = inputReader.nextInt();
        System.out.println("You have entered : " + number);

        //Getting floating point as input from command line in Java
        System.out.println("Please enter a floating point number from command line? ");
        float decimal = inputReader.nextFloat();
        System.out.println("You have entered : " + decimal);

        //Java Example to get input from user using GUI
        String input = JOptionPane.showInputDialog("Enter any number of your choice");
        System.out.println("User has entered: " + input);



    }

}
