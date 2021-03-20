import java.sql.SQLOutput;

public class Game {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Card c1, c2;
        c1 = new Card(Rank.ACE, Suit.HEARTS);
        c2 = new Card(Rank.JACK, Suit.HEARTS);

        //Flip our cards

        c1.flipCard();
        c2.flipCard();

        //Create a hand

        Hand h1 = new Hand();
        Hand h2 = new Hand();
        h1.add(c1);
        h1.add(c2);
        System.out.println(h1.showHand());
        h1.giveCard(c1, h2);
        System.out.println("Hand 1  is:" + h1.showHand() + "\n"
                + "Hand 2 is now:" + h2.showHand());
    }
}
