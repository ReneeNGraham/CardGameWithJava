public class Card {


    //Private fields

    private Suit suit;
    private Rank rank;
    private boolean isFaceUp;

    //Constructor Method
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        isFaceUp = true;
    }

    // Public Methods

    public String getSuit() {
        return suit.printSuit();
    }

    public int getRank() {
        return rank.getRank();
    }
    public String toString() {
        String str  = "";
        if (isFaceUp) {
        str += rank.getRank() + " of " + suit.printSuit();
        }
        else {
            str = "Face Down (nothing to see here)";
        }
        return str;

    }

    public void flipCard() {
    }
}
