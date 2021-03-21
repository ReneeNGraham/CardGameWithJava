import java.sql.SQLOutput;

public class Game {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        Card card1, card2;
//        card1 = new Card(Rank.ACE, Suit.HEARTS);
//        card2 = new Card(Rank.JACK, Suit.HEARTS);
//
//        //Flip our cards
//
//        card1.flipCard();
//        card2.flipCard();
//
//        //Create a hand
//
//        Hand hand1 = new Hand();
//        Hand hand2 = new Hand();
//        hand1.add(card1);
//        hand1.add(card2);
//        hand1.clear();
//        System.out.println(hand1.showHand());
//        hand1.giveCard(card1, hand2);
//        System.out.println("Hand 1 is:" + hand1.showHand() + "\n"
//                + "Hand 2 is now:" + hand2.showHand());

        //Create a deck

        Deck deck1 = new Deck();
        deck1.populate();
        System.out.println("Deck has following cards:"  + deck1.showHand());
        deck1.shuffle();
        System.out.println("Deck now has following card:" + deck1.showHand());

        //Create our playing hands
        // deal cards to our hands
        //Deal 2 cards to dealer
        //Show the player's hands
        //flip the dealer's card first
        //show the dealer's cards

    }
}
