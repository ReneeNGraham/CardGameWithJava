import java.sql.SQLOutput;

public class Game {


    public static void main(String[] args) {

        // TODO Auto-generated method stub

        Card c1, c2;

        c1 = new Card(Rank.ACE, Suit.HEARTS);
        c2 = new Card(Rank.JACK, Suit.HEARTS);


        System.out.println(c1.toString() + "\n" +
                c2.toString());

        //Flip our cards

        c1.flipCard();

    }
}
