

public enum Suit {

    HEARTS("Hearts"),
    SPADES ("Spades"),
    DIAMONDS("Diamonds"),
    CLUBS("Clubs");


    private final String suitText;
   //Constructor and this and be created in my IDEA by using "option" and  "enter"

    private Suit(String suitText) {
        this.suitText = suitText;
    }

    //Public Method

    public String printSuit() {
        return suitText;
    }
}
