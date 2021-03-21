import java.util.ArrayList;

public class Hand {

    public ArrayList<Card> cards;

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
        /* Show cards and their total points, but
        * only show total points if ALL cards arte face up*/
        String str = "";
        boolean allFaceUp = true;
        for (Card card: cards) {
            str += card.toString() + "\n";
            if(!card.isFaceUp) {
                allFaceUp = false;
            }
        }
        //if we are all faceup show the total
        if(allFaceUp) {
            str += "Total points =" + getTotal() + "\n";
        }
        return str;
    }

    public void flipCard() {
        for (Card card: cards){
            card.flipCard();
        }
    }

    public boolean giveCard(Card card, Hand otherHand) {
        if (cards.contains(card)) {
            int i = cards.indexOf(card);
            cards.remove(i);
            otherHand.add(card);
            return true;
        }
        else {
            return false;
        }
    }

    //Return total points of hand

    public int getTotal() {
        int totalPts = 0;
        boolean hasAce = false;
        //get total points and any aces will be worth 1 by default
        for (int i = 0; i <cards.size(); i++ ) {
            totalPts += cards.get(i).getRank();
            //check to see if card is an Ace
            if (cards.get(i).printRank() == "Ace") {
                hasAce = true;
            }
            //Make Ace worth 11 if total points <= 11
            if(hasAce && totalPts <= 11) {
                totalPts += 10; //Add 10 more to the Ace
            }
        }

        return totalPts;

    }
    public String toString() {
        String str = "";
        //loop through all the cards (foreach loop)
        for (Card card: cards) {
            str += card.toString() + "\n";

        }
        return str;


    }




}
