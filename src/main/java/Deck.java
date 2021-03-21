import java.util.Random;

public class Deck extends Hand {
    public void populate() {

        /* FOR  suit in Suits (nested for loop)
              For rand in Ranks
              SET card to Card with rand & suit
              CALL CARDS.ADD WITH CARD
            END FOR
           END FOR
         */
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(rank, suit);
                card.flipCard();
                this.add(card);
            }
        }
    }

    //shuffle method
    public void shuffle() {
        Random rand = new Random();
        for (int i = cards.size() - 1; i > 0; i--) {
            /*
            swap a random card between the beginning
            and last card of the last loop
            */
            int pick = rand.nextInt(i);
            Card randCard = cards.get(pick);
            Card lastCard = cards.get(i);
            cards.set(i, randCard);
            cards.set(pick, lastCard);

        }
    }

    //deal method - we use indexing here because there are multiple hands in an array
    public void deal(Hand[] hands, int perHand) {
        for (int i = 0; i < perHand; i++) ;
        {
            for (int j = 0; j < hands.length; j++) {
                this.giveCard(cards.get(0), hands[j]);
            }
        }


    }

    public void deal(Hand hand, int perHand) {
        //deal to a single hand
        for (int i = 0; i < perHand; i++) {
            this.giveCard(cards.get(0), hand);
        }

    }
//void because it does not return a value - the flipCard method

    public void flipCard(Card card) {

        card.flipCard();
    }

}
