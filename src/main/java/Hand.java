import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards;

    //constructor

    public Hand() {
        cards = new ArrayList<Card>();
    }
    public void clear() {
        cards.clear();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public String showHand() {
        String str = "";
        for (Card c: cards) {
            str += c.toString() + "\n";
        }
        return str;
    }

    public boolean giveCard(Card card, Hand otherHand) {
        if (!cards.contains(card)) {
            return false;
        }
        else {
            //get index position of card, but can just remove as an object
            cards.remove(card);
            otherHand.add(card);
            return true;

        }
    }




}
